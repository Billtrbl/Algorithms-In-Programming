package HomeworkWeek5;

public class bankAccount {

	String name;
	double balance;

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdrawl(double amount) {
		balance = balance - amount;
	}

}
