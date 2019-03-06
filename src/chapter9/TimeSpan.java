package chapter9;

public class TimeSpan 
{
	private int hours;
	private int minutes;
	private int totalMinutes;
	
	public TimeSpan(int hours, int minutes)
	{
		this.hours = hours;
		this.minutes = minutes;
		totalMinutes = 0;
		add(hours, minutes);
	}
	
	public void add(int hours, int minutes)
	{
		if(hours < 0 || minutes < 0)
			throw new IllegalArgumentException();
		totalMinutes += 60 * hours + minutes;
	}
	
	public boolean equals(TimeSpan otherSpan)
	{
		if(this.hours == otherSpan.hours)
		{
			if(this.minutes == otherSpan.minutes)
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	public String toString()
	{
		return "HH:MM " + (totalMinutes/60) + ": " + (totalMinutes%60);
	}

}
