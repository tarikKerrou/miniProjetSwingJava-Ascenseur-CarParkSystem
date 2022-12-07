package ParkingDeTarik;

/**
 * @author Pratibha
 * This class simulates a Bank which would validate the credit card
 * Here we are making an assumption that the credit card validation is always successful.
 */
public class Bank 
{
	String creditCardNumber;
	String cvvNumber;
	String expiryDate;
	
	public Bank(PaymentInformation paymentInformation) 
	{
		this.creditCardNumber = paymentInformation.getCreditCardNumber();
		this.cvvNumber = paymentInformation.getCvvNumber();
		this.expiryDate = paymentInformation.getExpiryDate();
	}
	
	// simulating credit card validation done by back.
	// Assuming the credit card validation is successful always.
	public boolean validateCreditCard()
	{
		return true;
	}
}
