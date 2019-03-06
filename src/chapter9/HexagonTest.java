package chapter9;

public class HexagonTest 
{
	public static void main(String[] args)
	{
		double side = 6;
		
		Hexagon h6 = new Hexagon(side);
		
		System.out.println("Area of Hexagon: " + h6.getArea());
		
		System.out.println("Perimeter of Hexagon: " + h6.getPerimeter());
	}
}
