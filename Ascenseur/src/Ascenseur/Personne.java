package Ascenseur;



import javax.swing.JLabel;
import javax.swing.JPanel;

public class Personne extends Thread {
	private JLabel personne; //contient  l'image de la personne
	private JPanel Parents; // panel dans laquel la personne existe
	private String name;   //nom de personne
	private int etage;	 //position de personne
	private boolean appel = true;
	private int destination; //destination de la personne

	//------- constructeur ------------
	public Personne(JLabel person, String nom)
	{
		this.personne = person;
		this.etage = person.getLocation().y;
		this.name = nom;
		Parents = (JPanel) this.personne.getParent();
	}
	
	//------ Getters ---------
	public int getEtage()
	{
		return this.etage;
	}
	
	public boolean getAppel()
	{
		return this.appel;
	}
	
	public int getDestination()
	{
		return this.destination;
	}
	//----- Setters ----------
	public void setDestination(int des)
	{
		this.destination = aller(des);
	}
	
	
	public void setAppel(boolean appel)
	{
		this.appel = appel;
	}
	
	public boolean appel(boolean appel)
	{
		return appel;
	}
	
	//--------- Fonction : rentrer() -----
	synchronized void rentrer(JPanel asc)
	{
		Parents.remove(this.personne);
		Parents.repaint();
		asc.add(this.personne);
		asc.repaint();
		asc.revalidate();
		System.out.format("[%s] entre \n",this.name);
	}
	
	//-------- Fonction: sortir() ----------
	synchronized void sortir(JPanel asc)
	{
		asc.remove(this.personne);
		asc.repaint();
		if(asc.getX() == 10)
		{
			this.personne.setBounds(asc.getLocation().x +220, asc.getLocation().y, 45, 50);
		}
		if(asc.getX() == 112)
		{
			this.personne.setBounds(asc.getLocation().x +180, asc.getLocation().y, 45, 50);
		}
		Parents.add(this.personne);
		Parents.repaint();
		Parents.revalidate();
		System.out.format("[%s] sort \n",this.name);
	}
	
	
	//-------- etage => y --------------
	public int aller(int etage)
	{
		int yEtage = 0;
		switch(etage)
		{
		case 0 :
			yEtage = 510;
			break;
		case 1 :
			yEtage = 410;
			break;
		case 2 :
			yEtage = 310;
			break;
		case 3 :
			yEtage = 210;
			break;
		case 4 :
			yEtage = 110;
			break;
		case 5 :
			yEtage = 10;
			break;
		}
		return yEtage;
	}
	
	//---------pour les etage -----------
	public int allerInv(int yEtage)
	{
		int etage = 0;
		switch(yEtage)
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
		return etage;}}

