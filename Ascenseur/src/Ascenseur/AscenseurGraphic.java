package Ascenseur;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Font;
import java.util.ArrayList;
//import java.util.Random;

import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class AscenseurGraphic {

	private JFrame frameOfAscenseur;
	private ArrayList<Personne> ListPersonnes = new ArrayList<Personne>();
	private int i = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AscenseurGraphic window = new AscenseurGraphic();
					window.frameOfAscenseur.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AscenseurGraphic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameOfAscenseur = new JFrame();
		frameOfAscenseur.setTitle("Ascenseur");
		frameOfAscenseur.getContentPane().setBackground(new Color(102, 153, 153));
		frameOfAscenseur.getContentPane().setForeground(new Color(0, 0, 0));
		frameOfAscenseur.getContentPane().setLayout(null);
		ImageIcon image14 = new ImageIcon("src/icon/ic.png");
		frameOfAscenseur.setIconImage(image14.getImage());
		
		ImageIcon image = new ImageIcon("src/icon/on.png");
		
		ImageIcon image1 = new ImageIcon("src/icon/of.png");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 204, 153));
		panel_1.setBounds(10, 23, 5, 673);
		frameOfAscenseur.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 204, 153));
		panel_2.setBounds(25, 23, 503, 4);
		frameOfAscenseur.getContentPane().add(panel_2);
		ImageIcon image3 = new ImageIcon("src/icon/play.png");
		
	
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 204, 153));
		panel_10.setToolTipText("Cliquer ici pour commencer");
		panel_10.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		panel_10.setBounds(526, 0, 60, 60);
		frameOfAscenseur.getContentPane().add(panel_10);
		panel_10.setLayout(null);
		
		
		JPanel principal = new JPanel();
		principal.setBackground(new Color(255, 255, 204));
		principal.setBounds(388, 86, 198, 626);
		frameOfAscenseur.getContentPane().add(principal);
		principal.setLayout(null);
		
		JPanel ascenseur2 = new JPanel();
		ascenseur2.setBounds(112, 510, 75, 100);
		principal.add(ascenseur2);
		ascenseur2.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		ascenseur2.setBackground(new Color(240, 255, 255));
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(image);
		ascenseur2.add(lblNewLabel_1);
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(image1);
		ascenseur2.add(lblNewLabel_2);
		
		
		JLabel rez = new JLabel("");
		ascenseur2.add(rez);
		
		JPanel panel_11 = new JPanel();
		panel_11.setBounds(112, 612, 75, 4);
		principal.add(panel_11);
		panel_11.setBackground(new Color(0, 0, 139));
		
		JPanel ascenseur1 = new JPanel();
		ascenseur1.setBounds(10, 510, 75, 100);
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(image);
		ascenseur1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setIcon(image1);
		ascenseur1.add(lblNewLabel_21);
		principal.add(ascenseur1);
		ascenseur1.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		ascenseur1.setBackground(new Color(240, 255, 255));
		
		JLabel label = new JLabel("");
		ascenseur1.add(label);
		
		JLabel label_1 = new JLabel("");
		ascenseur1.add(label_1);
		
		JLabel label_2 = new JLabel("");
		ascenseur1.add(label_2);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(10, 612, 75, 4);
		principal.add(panel_9);
		panel_9.setBackground(new Color(0, 0, 139));
		
		
		
		JPanel panelImm = new JPanel();
		panelImm.setBackground(new Color(255, 204, 153));
		panelImm.setToolTipText("");
		panelImm.setBorder(new LineBorder(new Color(0, 0, 204), 2));
		panelImm.setBounds(25, 86, 342, 610);
		frameOfAscenseur.getContentPane().add(panelImm);
		panelImm.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		panel_3.setBackground(new Color(105, 105, 105));
		panel_3.setBounds(10, 510, 148, 39);
		panelImm.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Garage");
		lblNewLabel.setForeground(new Color(255, 255, 204));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(36, 10, 102, 19);
		panel_3.add(lblNewLabel);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		panel_4.setBackground(new Color(105, 105, 105));
		panel_4.setBounds(10, 410, 148, 39);
		panelImm.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblRezchausse = new JLabel("Rez-de-Chaussée");
		lblRezchausse.setForeground(new Color(255, 255, 204));
		lblRezchausse.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblRezchausse.setBounds(5, 5, 145, 29);
		panel_4.add(lblRezchausse);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		panel_5.setBackground(new Color(105, 105, 105));
		panel_5.setBounds(10, 310, 148, 39);
		panelImm.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblEtage = new JLabel("Etage 1");
		lblEtage.setForeground(new Color(255, 255, 204));
		lblEtage.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEtage.setBounds(36, 10, 102, 19);
		panel_5.add(lblEtage);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		panel_6.setBackground(new Color(105, 105, 105));
		panel_6.setBounds(10, 210, 148, 39);
		panelImm.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblEtage_1 = new JLabel("Etage 2");
		lblEtage_1.setForeground(new Color(255, 255, 204));
		lblEtage_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEtage_1.setBounds(36, 10, 102, 19);
		panel_6.add(lblEtage_1);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		panel_7.setBackground(new Color(105, 105, 105));
		panel_7.setBounds(10, 110, 148, 39);
		panelImm.add(panel_7);
		panel_7.setLayout(null);
		
		JLabel lblEtage_2 = new JLabel("Etage 3");
		lblEtage_2.setForeground(new Color(255, 255, 204));
		lblEtage_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEtage_2.setBounds(36, 10, 102, 19);
		panel_7.add(lblEtage_2);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 139), 2));
		panel_8.setBackground(new Color(105, 105, 105));
		panel_8.setBounds(10, 10, 148, 39);
		panelImm.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblEtage_3 = new JLabel("Etage 4");
		lblEtage_3.setForeground(new Color(255, 255, 204));
		lblEtage_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblEtage_3.setBounds(36, 10, 102, 19);
		panel_8.add(lblEtage_3);
		
		JLabel per4 = new JLabel("");
		per4.setBounds(210, 10, 45, 41);
		ImageIcon image2 = new ImageIcon("src/icon/per5.png");
		per4.setIcon(image2);
		panelImm.add(per4);
		
		JLabel per3 = new JLabel("");
		per3.setBounds(210, 110, 45, 50);
		ImageIcon image9 = new ImageIcon("src/icon/per4.png");
		per3.setIcon(image9);
		panelImm.add(per3);
		
		JLabel per2 = new JLabel("");
		per2.setBounds(210, 210, 45, 41);
		ImageIcon image10 = new ImageIcon("src/icon/per3.png");
		per2.setIcon(image10);
		panelImm.add(per2);
		
		JLabel per1 = new JLabel("");
		per1.setBounds(210, 310, 45, 50);
		ImageIcon image11 = new ImageIcon("src/icon/per2.png");
		per1.setIcon(image11);
		panelImm.add(per1);
		
		JLabel per0 = new JLabel("");
		per0.setBounds(210, 410, 45, 50);
		ImageIcon image12 = new ImageIcon("src/icon/per1.png");
		per0.setIcon(image12);
		panelImm.add(per0);
		
		JLabel per5 = new JLabel("");
		ImageIcon image13 = new ImageIcon("src/icon/per.png");
		per5.setIcon(image13);
		per5.setBounds(210, 510, 45, 50);
		panelImm.add(per5);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 81, 322, 12);
		panelImm.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 173, 322, 12);
		panelImm.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(10, 277, 322, 12);
		panelImm.add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 370, 322, 12);
		panelImm.add(separator_3);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(10, 483, 322, 12);
		panelImm.add(separator_4);
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setToolTipText("Cliquer ici pour commencer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//--------------- Ascenseur 1 ---------------
				Personne person = new Personne(per0, "personne");
				ListPersonnes.add(person);
				
				Personne person1 = new Personne(per1, "personne1");
				ListPersonnes.add(person1);
				
				Personne person2 = new Personne(per2, "personne2");
				ListPersonnes.add(person2);
				
				Personne person3 = new Personne(per3, "personne3");
				ListPersonnes.add(person3);
				
				Personne person4 = new Personne(per4, "personne4");
				ListPersonnes.add(person4);
				
				Personne person5 = new Personne(per5, "personne5");
				ListPersonnes.add(person5);
				
			
				//--------------- Ascenseur 2 ---------------
				Personne person6 = new Personne(per0, "personne5");
				ListPersonnes.add(person6);
				
				Personne person7 = new Personne(per1, "personne6");
				ListPersonnes.add(person6);
				
				Personne person8 = new Personne(per2, "personne7");
				ListPersonnes.add(person8);
				
				Personne person9 = new Personne(per3, "personne8");
				ListPersonnes.add(person9);
				
				Personne person10 = new Personne(per4, "personne9");
				ListPersonnes.add(person10);
				
				Personne person11 = new Personne(per5, "personne10");
				ListPersonnes.add(person11);
				
				
				//----------- Destination -----------------
				person.setDestination(4);
				person6.setDestination(4);
				
				person1.setDestination(3);
				person7.setDestination(3);
			
				person2.setDestination(2);
				person8.setDestination(1);

				
				person3.setDestination(1);
				person9.setDestination(5);
				
				person4.setDestination(2);
				person10.setDestination(0);
				
				person5.setDestination(5);
				person11.setDestination(1);
				
				FastAscenseur asc1 = new FastAscenseur(ascenseur1, person);
				FastAscenseur as1 = new FastAscenseur(ascenseur2, person8);
				asc1.start();
				as1.start();
				
				ActionListener task = new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						i ++;
						if(i == 80)
						{
							System.out.println("personne   est sortie ! asc----------------------2");
							System.out.println("Personne2  est sortie ! asc----------------------1");
							
							FastAscenseur asc2 = new FastAscenseur(ascenseur1, person4);
							
							FastAscenseur as2 = new FastAscenseur(ascenseur2, person7);
							
							asc2.start();
							
							as2.start();
						}
						if(i == 160)
						{
							System.out.println("Personne4  est sortie ! asc ----------------------1");
							System.out.println("Personne10 est sortie ! asc-----------------------2");
							FastAscenseur asc3 = new FastAscenseur(ascenseur1, person3);
							FastAscenseur as3 = new FastAscenseur(ascenseur2, person2);
							
							asc3.start();
							as3.start();
						}
						if(i == 240)
						{
							System.out.println("Personne3  est sortie ! asc ----------------------1");
							System.out.println("Personne7  est sortie ! asc ----------------------2");
							FastAscenseur asc4 = new FastAscenseur(ascenseur1, person1);
							FastAscenseur as4 = new FastAscenseur(ascenseur2, person9);
							
							asc4.start();
							as4.start();
						}
						if(i == 300)
						{
							System.out.println("Personne6 est sortie  ! asc ----------------------1");
							System.out.println("Personne2  est sortie ! asc ----------------------2");
							FastAscenseur asc5 = new FastAscenseur(ascenseur1, person5);
							FastAscenseur as5 = new FastAscenseur(ascenseur2, person10);
							
							asc5.start();
							as5.start();
							
						}
						
						if(i==310)
						{
							System.out.println("------------------------ Fin --------------------------");
						}
					}
				};
				
				Timer timer = new Timer(50, task);
				timer.start();			
			}
		});
		
		btnNewButton.setBounds(5, 5, 50, 50);
		panel_10.add(btnNewButton);
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setIcon(image3);
		
		JLabel lblNewLabel_3 = new JLabel("Réalisé par : ZEROUALI Hajar");
		lblNewLabel_3.setForeground(new Color(255, 204, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_3.setBounds(25, 706, 252, 33);
		frameOfAscenseur.getContentPane().add(lblNewLabel_3);
		
	
		
		
		frameOfAscenseur.setBounds(100, 42, 610, 786);
		frameOfAscenseur.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
