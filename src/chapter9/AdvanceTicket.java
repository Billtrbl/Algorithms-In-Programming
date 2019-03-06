package chapter9;

public class AdvanceTicket extends Ticket
{
	int ticketNumber;
	int days;
	double cost;
	
	public AdvanceTicket(int ticketNumber, int days)
	{
		super(ticketNumber);
		this.days = days;
		if (days >= 10)
			cost = 30;
		if (days <= 10)
			cost = 40;
	}
	
	public double getPrice()
	{
		return cost;
	}
	
	public String toString()
	{
		String advanceTicket;
		advanceTicket = "Number: " + ticketNum + ",Price: " + getPrice();
		return advanceTicket;
	}
}
