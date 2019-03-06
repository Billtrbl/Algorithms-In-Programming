package chapter9;

public class MarketerTest {
	
	public static void main(String[] args)
	{
		Employee billy = new Employee();
		System.out.print("Billy : ");
		System.out.print(billy.getHours() + " , ");
		System.out.printf("$%.2f, " , billy.getSalary());
		System.out.print(billy.getVacationDays() + " , ");
		System.out.println(billy.getVacationForm() + " , ");
		
		Marketer william = new Marketer();
		System.out.print("William : ");
		System.out.print(william.getHours() + " , ");
		System.out.printf("$%.2f, " , william.getSalary());
		System.out.print(william.getVacationDays() + " , ");
		System.out.println(william.getVacationForm() + " , ");
		william.advertise();
	}

}
