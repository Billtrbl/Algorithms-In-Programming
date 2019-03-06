package chapter9;

public class Hexagon implements Shape
{
	double side;
	
	public Hexagon(double side)
	{
		this.side = side;
	}
	
	public double getArea()
	{
		return (side * side) * ((3.0 * Math.sqrt(3.0)) / 2);
	}
	
	public double getPerimeter()
	{
		return 6 * side;
	}
}
