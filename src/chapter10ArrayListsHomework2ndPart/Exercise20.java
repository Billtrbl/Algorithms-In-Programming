package chapter10ArrayListsHomework2ndPart;
import java.lang.Comparable;

public abstract class Exercise20 implements Comparable
{
	int day;
	String month;
	int year;
	
	public Exercise20(String month, int day, int year)
	{
		setDate(day,month,year);
	}
	
	public void setDate(int day, String month, int year)
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getMonth(String month)
	{
		int monthIndex =-1;
		String[] months = {"January" , "February", "March", "April" , "May", "June", "July", "August", "September", "October", "November", "December"};
		
		for(int index = 0; index < months.length; index++)
			if(month == months[index])
			{
				monthIndex = index;
				break;
			}
		return monthIndex + 1;
	}
	
	public int compareTo(Exercise20 otherDate)
	{
		if(year!= otherDate.year)
			return year-otherDate.year;
		else if(getMonth(month)!=getMonth(otherDate.month))
			return getMonth(month) - getMonth(otherDate.month);
		else
			return day-otherDate.day;
	}
	
	public String toString()
	{
		return month+ " " + day + ", " + year;
	}
	
}
