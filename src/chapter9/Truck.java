package chapter9;

public class Truck extends Car
{

	public void m1() //calling method m1 from parent class
	{
		System.out.println("m2 truck 1");
	}

	public void m2() //calling method m2 from parent class
	{
		super.m1(); //uses the parent class method first
	}
	
	public String toString()
	{
		return super.toString() + super.toString();
	}
	
}
