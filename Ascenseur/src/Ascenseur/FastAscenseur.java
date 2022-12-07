package Ascenseur;

import java.util.ArrayList;
import javax.swing.JPanel;

public class FastAscenseur extends Thread {
	private int xAx, yAy; //Coordonnees de l'ascenseur
	private JPanel tarik;    // le panel d'ascenseur
	private Personne personne;
	private ArrayList<Personne> personnesAsc = new ArrayList<Personne>(); //Personnes existe dans dl'ascenseur
	
	//------- Constructeur ------------
	public FastAscenseur(JPanel asc,Personne person)
	{
		this.tarik = asc;
		this.xAx = asc.getLocation().x;
		this.yAy = asc.getLocation().y;
		this.personne = person;
		
	}
	
	//----- Fonction : monter() ---------
	synchronized void up()
	{
		this.tarik.setLocation(this.tarik.getLocation().x, this.tarik.getLocation().y - 100);
	}
	
	//------- Fonction : descendre() ----
	synchronized void descendre()
	{
		this.tarik.setLocation(this.tarik.getLocation().x, this.tarik.getLocation().y + 100);
	}
	
	
	///------- Fonction : run() --------------
	@Override
	public void run() 
	{
		
		if(personne.getAppel() == true)
		{
			System.out.println("-------------| L'appel est vraie! |-------------");
			System.out.println("              --------------------");
			
				if(personne.getEtage() < this.getYAsc())
				{
					System.out.println("asc < personne => Monter");
					int j = personne.allerInv(personne.getEtage()) - this.allerInv(this.getYAsc());
					System.out.println("Nombre d'itération : " + j);
					
					for(int i = 0; i < j; i++)
					{
						this.up();
						this.setYAsc(this.tarik.getLocation().y);
						try 
						{
							sleep(500);
						} 
						catch (Exception e) 
						{
							e.printStackTrace();
						}
					}
					//---- verifier capacite -----------
					if(personnesAsc.size() < 4)
					{
						System.out.println("Entrez : il reste encore des places");
						
						this.personnesAsc.add(personne);
						personne.rentrer(this.tarik);
						try 
						{
							Personne.sleep(500);
						} 
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						if(personne.getDestination() < this.getYAsc())
						{
							int k = this.allerInv(personne.getDestination()) - this.allerInv(this.getYAsc());
							System.out.println("Number of iterations : " + k);
							
							for(int i = 0; i < k; i++)
							{
								this.up();
								try
								{
									sleep(500);
								}
								catch (InterruptedException e) 
								{
									e.printStackTrace();
								}
							}
							personne.sortir(this.tarik);
							this.personnesAsc.remove(personne);
						}
						if(personne.getDestination() > this.getYAsc())
						{
							int h = this.allerInv(this.getYAsc()) - this.allerInv(personne.getDestination());
							System.out.println("Number of iterations  : " + h);
							
							for(int i = 0; i < h; i++)
							{
								this.descendre();
								try
								{
									sleep(500); 
								}
								catch (InterruptedException e) 
								{
									e.printStackTrace();
								}
							}
							personne.sortir(this.tarik);
							this.personnesAsc.remove(personne);
						}
					}
					else
					{
						try 
						{
							personne.wait();
						} 
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						};
					}
				}
				
				if(personne.getEtage() > this.getYAsc())
				{
					System.out.println("asc > personne => Descendre");
					int l = this.allerInv(this.getYAsc()) - personne.allerInv(personne.getEtage());
					System.out.println("Nombre d'itération : " + l);
					
					for(int i = 0; i < l; i++)
					{
						this.descendre();
						this.setYAsc(this.tarik.getLocation().y);
						try 
						{
							sleep(500);
						} 
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
					}
					//------- verifier capacite -------
					if(personnesAsc.size() < 4)
					{
						this.personnesAsc.add(personne);
						personne.rentrer(this.tarik);
						try 
						{
							Personne.sleep(500);
						} 
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
						if(personne.getDestination() < this.getYAsc())
						{
							int m = this.allerInv(personne.getDestination()) - this.allerInv(this.getYAsc());
							System.out.println("Nombre d'itération : " + m);
							
							for(int i = 0; i < m; i++)
							{
								this.up();
								try
								{
									sleep(500);
								}
								catch (InterruptedException e) 
								{
									e.printStackTrace();
								}
							}
							personne.sortir(this.tarik);
							this.personnesAsc.remove(personne);
						}
						if(personne.getDestination() > this.getYAsc())
						{
							int n = this.allerInv(this.getYAsc()) - this.allerInv(personne.getDestination());
							System.out.println("Nombre d'itération : " + n);
							
							for(int i = 0; i < n; i++)
							{
								this.descendre();
								try
								{
									sleep(500); 
								}
								catch (InterruptedException e) 
								{
									e.printStackTrace();
								}
							}
							personne.sortir(this.tarik);
							this.personnesAsc.remove(personne);
						}
					} 
					else
					{
						try 
						{
							personne.wait();
						} 
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
					}
				}
			}
		
	}

	//-------- pour les  etage -----------
	public int allerInv(int etageNumber)
	{
		int etage = 0;
		switch(etageNumber)
		{
			case 510 :
				etage = 0;
				break;
			case 410 :
				etage = 1;
				break;
			case 310 :
				etage = 2;
				break;
			case 210 :
				etage = 3;
				break;
			case 110 :
				etage = 4;
				break;
			case 10 :
				etage = 5;
				break;
		}
		return etage;
	}
	
	//----------- Getters ---------
	public int getXAsc()
	{
		return this.xAx;
	}
	
	public synchronized int getYAsc()
	{
		return this.yAy;
	}
	
	//--------- Setters --------------
	public void setXAsc(int x)
	{
		this.xAx = x;
	}
	
	public void setYAsc(int y)
	{
		this.yAy = y;
	}
	
	
}
