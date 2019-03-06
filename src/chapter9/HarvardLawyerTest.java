package chapter9;

public class HarvardLawyerTest {

	public static void main(String[] args)
	{
		Employee billy = new Employee();
		System.out.print("Billy : ");
		System.out.print(billy.getHours() + " , ");
		System.out.printf("$%.2f, " , billy.getSalary());
		System.out.print(billy.getVacationDays() + " , ");
		System.out.println(billy.getVacationForm() + " , ");
		
		Lawyer muks = new Lawyer();
		System.out.print("Lawyer Muks : ");
		System.out.print(muks.getHours() + " , ");
		System.out.printf("$%.2f, " , muks.getSalary());
		System.out.print(muks.getVacationDays() + " , ");
		System.out.println(muks.getVacationForm() + " , ");
		
		HarvardLawyer lin = new HarvardLawyer();
		System.out.print("Harvard Lawyer Lin : ");
		System.out.print(lin.getHours() + " , ");
		System.out.printf("$%.2f, " , lin.getSalary());
		System.out.print(lin.getVacationDays() + " , ");
		System.out.println(lin.getVacationForm() + " , ");
	}
}
