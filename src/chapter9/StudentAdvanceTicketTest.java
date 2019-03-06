package chapter9;

public class StudentAdvanceTicketTest 
{
	public static void main(String[] args)
	{
		int ticketNumber = 16;
		int days = 21;
		
		StudentAdvanceTicket studentAdvanceTicket = new StudentAdvanceTicket(17,20);
		
		System.out.println("Student Advance Ticket Info: ");
		
		System.out.println(studentAdvanceTicket.toString());
	}

}
