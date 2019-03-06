package chapter9;

public class OctagonTest {
	
	public static void main(String[] args)
	{
		double side = 7.0;
		
		Octagon o8 = new Octagon(side);
		
		System.out.println("Area of Octagon: " + o8.getArea());
		
		System.out.println("Perimeter of Octagon: " + o8.getPerimeter());
	}

}
