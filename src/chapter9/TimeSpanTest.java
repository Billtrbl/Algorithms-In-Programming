package chapter9;

public class TimeSpanTest 
{
	public static void main(String[] args)
	{
		TimeSpan morning = new TimeSpan(07,49);
		TimeSpan afternoon = new TimeSpan(12, 31);
		
		System.out.println("Morning time: " + morning);
		
		System.out.println("Afternoon time: " + afternoon);
		
		if(morning.equals(afternoon))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
