package chapter9;

public class AdvanceTicketTest 
{
	public static void main(String[] args)
	{
		int ticketNumber = 24;
		int days = 1;
		
		AdvanceTicket advanceTicket = new AdvanceTicket(ticketNumber,days);
		
		System.out.println("Advance Ticket Info: ");
		
		System.out.println(advanceTicket.toString());
	}
}
