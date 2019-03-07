package midTermCIS174;

public class IncreasedProduction 
{
	// Workers starts at 4,000 parts
	// Increase of 6% each month
	// Record data of output for 24 months
	// If production goes over 7,000 parts "Deserves a raise!"
	
	public double getProduction()
	{
		return 4000;
	}
	
	public double getIncrease()
	{
		return 4000 * 0.06;
	}
	
	public static void main(String[] args)
	{
		IncreasedProduction ip = new IncreasedProduction();
		int month;
		int MAX = 24;
		
		for(month = 1; month <= MAX; ++month)
		{
			System.out.println( month + " this month's output is " + (month + ip.getProduction()));
		}
		
	}

}
