package chapter9;

public class Lawyer extends Employee{
	
	public int getVacationDays() //override the parent method of getVacationDays
	{
		return 15;
	}
	
	public String getVacationForm() //override the parent method of getVacationForm
	{
		return "pink";
	}

}
