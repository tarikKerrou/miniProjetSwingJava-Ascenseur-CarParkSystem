package ParkingDeTarik;

import java.util.ArrayList;

/**
 * @author Pratibha
 * 
 * This class has count of parking slots list of all parking slots 
 */
public class ParkingLot 
{
	private static final int nombreDeFentes = 5;
	
	private ArrayList<ParkingFente> listesDeFentes = null;
	
	public ParkingLot()
	{
		listesDeFentes = new ArrayList<>();
	}
	
	/**
	 * This method returns list of all the parking slots 
	 * 
	 * @return list of the slots in the parking lot
	 */
	public ArrayList<ParkingFente> getParkingSlots()
	{
		for (int i = 1; i <= nombreDeFentes; i++)
		{
			ParkingFente slot = new ParkingFente(i, true);
			listesDeFentes.add(slot);
		}
		return listesDeFentes;
	}
	
}
