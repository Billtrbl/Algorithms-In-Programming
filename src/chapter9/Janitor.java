package chapter9;

public class Janitor extends Employee
{
	
	public int getHours() //override parent method of getHours
	{
		return 80;
	}
	
	public double getSalary() //override parent method of getSalary
	{
		return 30000.0;
	}
	
	public int getVacationDays() //override parent method of getVacationDays
	{
		return 5;
	}
	
	public void clean()
	{
		System.out.println("Workin' for the man");
	}

	public String getVacationForm()
	{
		return "Yellow";
	}
}
