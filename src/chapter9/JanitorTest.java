package chapter9;

public class JanitorTest {
	
	public static void main(String[] args)
	{
		Employee billy = new Employee();
		System.out.print("Billy : ");
		System.out.print(billy.getHours() + " , ");
		System.out.printf("$%.2f, " , billy.getSalary());
		System.out.print(billy.getVacationDays() + " , ");
		System.out.println(billy.getVacationForm() + " , ");
		
		Janitor bruce = new Janitor();
		System.out.print("Bruce : ");
		System.out.print(bruce.getHours() + " , ");
		System.out.printf("$%.2f, " , bruce.getSalary());
		System.out.print(bruce.getVacationDays() + " , ");
		System.out.println(bruce.getVacationForm() + " , ");
		bruce.clean();
	}

}
