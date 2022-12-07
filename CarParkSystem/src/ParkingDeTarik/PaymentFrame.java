package ParkingDeTarik;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * @author Pratibha
 *
 * This class is the User Interface for entering credit card details
 */
public class PaymentFrame extends JFrame {

	private JPanel contentPane;
	
	private JLabel ccLabel;
	private JLabel cvvLabel;
	private JLabel expiryLabel;
	
	private JTextField ccTextField;
	private JTextField cvvTextField;
	private JTextField expiryTextField;
	
	private JButton boutonPourPaye;
	
	//private String durationParked;
	   
	String ccNumber = "";
	String cvvNumber = "";
	String expiry = "";
	
	ParkingSystemApp app;

	PaymentFrame paymentFrame = this;
	
	double totalFee = 0;
	
	/**
	 * Create the frame.
	 */
	public PaymentFrame(ParkingSystemApp paymentApp) 
	{
		this.app = paymentApp;
	
		initComponents(); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pay & Exit");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new GridLayout(8, 2));

		contentPane.add(ccLabel);
		contentPane.add(ccTextField);
		
		contentPane.add(cvvLabel);
		contentPane.add(cvvTextField);
		
		contentPane.add(expiryLabel);
		contentPane.add(expiryTextField);
		
		contentPane.add(boutonPourPaye);
		
		setContentPane(contentPane);
	}
	
	private void initComponents()
	{
		ccLabel = new JLabel("Credit Card Number: ");
		ccTextField = new JTextField();
		
		cvvLabel = new JLabel("CVV Number: ");
		cvvTextField = new JTextField();
				
		expiryLabel = new JLabel("Expiry: ");
		expiryTextField = new JTextField();
		
		ccNumber = ccTextField.getText();
		cvvNumber = ccTextField.getText();
		expiry = expiryTextField.getText();
		
		app.setPaymentInformation(ccNumber, cvvNumber, expiry);
		
		boutonPourPaye = new JButton("Pay");
		boutonPourPaye.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				boolean isValid = app.validateCreditCard();
				
				if(isValid)
				{
					double totalFee = app.getTotalFee();
					JOptionPane.showMessageDialog(boutonPourPaye, "Thank You for the payment of: $" + totalFee + "\n" +
															 "Visit again! ");
										
					paymentFrame.dispose();
					ParkingSystemFrame.parkFrame.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(boutonPourPaye, "Invalid Credit Card! \nPlease re-enter the details again.");
					ccTextField.setText("");
					ccTextField.requestFocus();
					cvvTextField.setText("");
					expiryTextField.setText("");
				}
			}
		});
	}
	
	
	

}
