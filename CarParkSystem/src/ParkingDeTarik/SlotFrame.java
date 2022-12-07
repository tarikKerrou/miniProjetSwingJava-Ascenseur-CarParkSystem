package ParkingDeTarik;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * @author Pratibha
 *
 * This class is the USer Interface to enter the ticket (slot) number.
 */
public class SlotFrame extends JFrame {

	private JPanel content;
	private JTextField textField;
	private JButton btunEnter;
	
	ParkingSystemApp app;
	private SlotFrame slotFrame = this;
	
	double totalFee = 0;

	/**
	 * Create the frame.
	 */
	public SlotFrame(ParkingSystemApp parkingApp) 
	{		
		this.app = parkingApp;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ticket!");
		setBounds(100, 100, 300, 200);
		content = new JPanel();
		content.setBorder(new EmptyBorder(5, 5, 5, 5));
		content.setLayout(new GridLayout(3, 3));
		setContentPane(content);
		
		JLabel lblEnterYourTicket = new JLabel("Enter your TICKET number: ");
		content.add(lblEnterYourTicket);
		
		textField = new JTextField();
		content.add(textField);
		textField.setColumns(2);
		
		btunEnter = new JButton("Enter");
		btunEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int ticketNumEntered = Integer.parseInt(textField.getText());
				
				boolean isValid = app.validateTicketNumber(ticketNumEntered);
			
				if (isValid) 
				{
				 	// hide current frame
					slotFrame.dispose();
					
					app.calculateTotalMinutes();
					
					totalFee = app.getTotalFee();
					
					int option = JOptionPane.showConfirmDialog(btunEnter, "Your total parking fee is: $" + totalFee + "\n" +
																	 "Continue with the payment? ");
					if (option != JOptionPane.YES_OPTION)
					{
						JOptionPane.showMessageDialog(btunEnter, "Please contact management for any issues!");
						ParkingSystemFrame.parkFrame = new ParkingSystemFrame();
						ParkingSystemFrame.parkFrame.setVisible(true);
						return;
					}
					else
					{
						// make the slot available
						app.makeSlotAvailable(ticketNumEntered);
						
						try{
							PaymentFrame paymentFrame = new PaymentFrame(app);
							paymentFrame.setVisible(true);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
				}	
				else
				{
					JOptionPane.showMessageDialog(btunEnter, "Wrong Ticket Number Entered!");
					textField.setText("");
					textField.requestFocus();
				}
			}
		});
		content.add(btunEnter);
	}
	
	
}
