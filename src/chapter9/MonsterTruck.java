package chapter9;

public class MonsterTruck extends Truck{
	
	public void m1()
	{
		System.out.println("m1 monster 1"); //calling method from parent class
	}

	public void m2()
	{
		super.m1(); //calling parent class method m1
		super.m2(); //calling parent class method m2
	}
	
	public String toString()
	{
		return " monster " + super.toString();
	}
}
