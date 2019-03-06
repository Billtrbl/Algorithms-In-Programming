package chapter9;

public class StudentAdvanceTicket extends Ticket 
{
	int ticketNumber;
	int days;
	double cost;
	
	public StudentAdvanceTicket(int ticketNumber, int days)
	{
		super(ticketNumber);
		this.days = days;
		if (days >= 10)
			cost = 15;
		if (days <= 10)
			cost = 20;
	}
	
	public double getPrice() {
		return cost;
	}
	
	public String toString()
	{
		String studentAdvanceTicket;
		studentAdvanceTicket = "Number: " + ticketNum + ",Price: " + getPrice() + " (ID required please!)";
		return studentAdvanceTicket;
	}
}
