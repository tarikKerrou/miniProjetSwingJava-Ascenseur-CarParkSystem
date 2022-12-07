package ParkingDeTarik;

/**
 * @author Pratibha
 * 
 * This class represents individual parking slot and stores slot number and its availability status
 */
public class ParkingFente 
{
	private int FenteNumber;
	private boolean desponibility;
	
	public ParkingFente(int slotNumber, boolean availability)
	{
		this.FenteNumber = slotNumber;
		this.desponibility = availability;
	}

	public int getSlotNumber() {
		return FenteNumber;
	}

	public void setSlotNumber(int slotNumber) {
		this.FenteNumber = slotNumber;
	}

	public boolean getAvailability() {
		return desponibility;
	}

	public void setAvailability(boolean availability) {
		this.desponibility = availability;
	}
	
	
}
