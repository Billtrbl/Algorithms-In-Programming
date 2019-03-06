package chapter9;

public class WalkupTest {

	public static void main(String[] args)
	{
		int ticketNumber = 14;
		
		WalkupTicket wut = new WalkupTicket(ticketNumber);
		
		System.out.println("Walkup Ticket Info: ");
		
		System.out.println(wut.toString());
	}
}
