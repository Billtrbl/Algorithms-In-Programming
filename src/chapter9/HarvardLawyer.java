package chapter9;

public class HarvardLawyer extends Lawyer{
	
	public double getSalary() //more salary for Harvard Lawyer
	{
		return super.getSalary() + super.getSalary()*0.2;
	}
	
	public int getVacationDays() //more vacation days
	{
		return super.getVacationDays()+3;
	}
	
	public String getVacationForm()
	{
		return super.getVacationForm() + super.getVacationForm() + super.getVacationForm() + super.getVacationForm();
	}

}
