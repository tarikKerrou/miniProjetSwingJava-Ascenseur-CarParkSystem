package ParkingDeTarik;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author Pratibha
 * 
 * This is the User Interface which allows user to Park and Pay for the parking slot
 */
public class ParkingSystemFrame extends JFrame {

	private JPanel contentPane;
	JButton btnPark;
	
	private static ParkingSystemApp app = new ParkingSystemApp();

	static ParkingSystemFrame parkFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					parkFrame = new ParkingSystemFrame();
					parkFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ParkingSystemFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Welcome to the Automated Parking System!");
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(1, 2));
		setContentPane(contentPane);
		
		btnPark = new JButton("Park");
		btnPark.setBackground(new Color(240, 240, 240));
		btnPark.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{				
				Ticket ticket = app.park();
				
				if (ticket == null)
				{
					JOptionPane.showMessageDialog(btnPark, "Parking full!");
				}
				else
				{
					Date date = ticket.getDate();
					int ticketNumber = ticket.getSlotNumber();
					long time = ticket.getStartTime();
					
					DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
					DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
					date = new Date(time);
					dateFormat.setTimeZone(TimeZone.getTimeZone("PST"));
										
					JOptionPane.showMessageDialog(btnPark, "Today's Date: " + dateFormat.format(date) + "\n" +
														   "Your parking ticket number: " + ticketNumber + "\n" +
														   "Start Time: " + timeFormat.format(date));
				}
			}
		});
		contentPane.add(btnPark, BorderLayout.CENTER);
		
		JButton btnPayExit = new JButton("Pay & Exit");
		btnPayExit.setForeground(new Color(0, 0, 0));
		btnPayExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				app.captureEndTime(); 
				
				SlotFrame slotFrame = null;
				
				try {
					slotFrame = new SlotFrame(app); // display new frame for entering ticket number
				} 
				catch (Exception e1) {
					e1.printStackTrace();
				}
				
				parkFrame.setVisible(false); // hide the first frame
				slotFrame.setVisible(true);
			}
		});
		contentPane.add(btnPayExit, BorderLayout.EAST);
	}
	

}
