package chapter10ArrayListsHomework2ndPart;

import java.lang.Comparable;

public abstract class Exercise19 implements Comparable {

	private int hours;
	private int minutes;

	public Exercise19() {
		this(0, 0);
	}

	public Exercise19(int hours, int minutes) {
		setTimeSpan(hours, minutes);
	}

	public void setTimeSpan(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;
	}

	public int getTimeLength(int hours, int minutes)
	{
		if( hours < 0 || minutes < 0)
		{
			throw new IllegalArgumentException();
		}
		else
			return 60*hours+minutes;
		
		public int compareTo(Object other)
		{
			Exercise19 otherTimeSpan = (Exercise19) other;
			
			if(getTimeLength(hours,minutes) < otherTimeSpan.minutes)
				return -1;
			else
				return 1;
		}
		
	}
	
	public String toString()
	{
		return "Hours: minutes = " + hours + ":" + minutes;
	}
}
