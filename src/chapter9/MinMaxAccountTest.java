package chapter9;

public class MinMaxAccountTest 
{
	public static void main(String[] args)
	{
		Startup s = new Startup(2000);
		
		Credit c1 = new Credit(4000);
		Credit c2 = new Credit(1000);
		
		Debit d1 = new Debit(1500);
		Debit d2 = new Debit(3000);
		
		MinMaxAccount mmAccount = new MinMaxAccount(s);
		
		mmAccount.credit(c1);
		
		mmAccount.debit(d1);
		
		mmAccount.credit(c2);
		
		mmAccount.debit(d2);
		
		System.out.println("Minimum balance in the account: $ " + mmAccount.getMin());
		
		System.out.println("Maximum balance in the account: $ " + mmAccount.getMax());
		
		System.out.println("Current balance in the account: $ " + mmAccount.getBalance());
	}
}
