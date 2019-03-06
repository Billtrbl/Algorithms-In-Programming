package chapter9;

public abstract class Ticket 
{
	int ticketNum;
	
	public Ticket(int ticketNumber)
	{
		this.ticketNum = ticketNumber;
	}
	
	public double getPrice() {
		return 0;
	}
	
	public String toString() {
		return null;
	}

}
