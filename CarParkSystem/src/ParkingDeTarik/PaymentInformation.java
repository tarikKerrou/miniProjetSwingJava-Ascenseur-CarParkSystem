package ParkingDeTarik;

/**
 * @author Pratibha
 *
 * This class contains all the payment information required to complete the payment transaction
 */
public class PaymentInformation 
{
	String creditCardNumber;
	String cvvNumber;
	String expiryDate;
	
	public PaymentInformation(String ccNumber, String cvvNumber, String expiry)
	{
		this.creditCardNumber = ccNumber;
		this.cvvNumber = cvvNumber;
		this.expiryDate = expiry;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public String getCvvNumber() {
		return cvvNumber;
	}

	public String getExpiryDate() {
		return expiryDate;
	}
}
