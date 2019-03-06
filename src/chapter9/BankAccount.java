package chapter9;

public class BankAccount 
{
	private int balance;
	
	public BankAccount(Startup s)
	{
		balance = s.getInitialBalance();
	}
	
	public void debit(Debit d)
	{
		if(balance - d.getDebitAmount() >= 0)
			balance = balance - d.getDebitAmount();
	}
	
	public void credit(Credit c)
	{
		balance = balance + c.getCreditAmount();
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	
}
