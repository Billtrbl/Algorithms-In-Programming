package labHomework;
import java.util.Scanner;
import java.io.*;


public class Exercise3 { //frequentFlier
	
	public static int frequentFlier(Scanner s)
	{
		String ticketType;
		int points = 0;
		int miles = 0;
		
		while(s.hasNext())
		{
			ticketType = s.next();
			points = s.nextInt();
			System.out.println(ticketType + " " + points);
			
			if(ticketType.contentEquals("coach"))
				miles += points;
			else if(ticketType.contentEquals("firstclass"))
				miles += points * 2;
		}
		
		return miles;
	}
	
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(new File("input1"));
		int miles = frequentFlier(sc);
		System.out.println("Total miles: " + miles);
	}

}
