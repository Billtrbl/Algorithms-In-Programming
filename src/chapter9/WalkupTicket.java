package chapter9;
import java.util.Scanner;

public class WalkupTicket extends Ticket
{
	int ticketNumber;
	double ticketPrice;
	
	Scanner in = new Scanner(System.in);
	
	public WalkupTicket(int ticketNumber)
	{
		super(ticketNumber);
		
		ticketPrice = 50;
	}
	
	public double getPrice()
	{
		return ticketPrice;
	}
	
	public String toString()
	{
		String WalkupTicket;
		WalkupTicket = "Number: " + ticketNum + ",Price: " + getPrice();
		return WalkupTicket;
	}
	
}
