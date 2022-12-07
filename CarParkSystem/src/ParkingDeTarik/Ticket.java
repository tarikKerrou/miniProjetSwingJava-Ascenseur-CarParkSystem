package ParkingDeTarik;

import java.sql.Date;

/**
 * @author Pratibha
 *
 * This class holds the ticket details generated by the system and displayed to the user
 */
public class Ticket 
{
	private int fenteNumber;
	private long startTime;
	private Date date;
	
	public Ticket(int slotNumber, long startTime, Date date)
	{
		this.fenteNumber = slotNumber;
		this.startTime = startTime;
		this.date = date;
	}

	public int getSlotNumber() {
		return fenteNumber;
	}

	public long getStartTime() {
		return startTime;
	}

	public Date getDate() {
		return date;
	}
}
