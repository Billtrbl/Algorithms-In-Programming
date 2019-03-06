package chapter9;

public class Octagon implements Shape 
{
	double side;
	
	public Octagon(double side)
	{
		this.side = side;
	}
	
	public double getArea()
	{
		return (side * side) * (2.0 + 2 * Math.sqrt(2.0));
	}
	
	public double getPerimeter()
	{
		return 8 * side;
	}
	
}
