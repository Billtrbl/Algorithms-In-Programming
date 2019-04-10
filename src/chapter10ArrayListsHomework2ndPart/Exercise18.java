package chapter10ArrayListsHomework2ndPart;
import java.lang.Comparable;

public class Exercise18 implements Comparable
{
	
	private int x;
	private int y;
	
	public Exercise18()
	{
		this(0,0);
	}
	
	public Exercise18(int x, int y)
	{
		setLocation(x,y);
	}
	
	public void setLocation(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int compareTo(Object other)
	{
		Exercise18 otherPoint = (Exercise18)other;
		
		if(y < otherPoint.y || y == otherPoint.y)
		{
			setLocation(x,y);
			return 1;
		}
		else
		{
			setLocation(otherPoint.x, otherPoint.y);
			return -1;
		}
	}
	
	public String toString()
	{
		return "Point (x,y) = " + " (" + x + ", " + y + ") ";
	}
	

}
