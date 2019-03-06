package chapter9;

public class MinMaxAccount extends BankAccount
{
	
	private int minBalance;
	
	private int maxBalance;
	
	public MinMaxAccount(Startup s)
	{
		super(s);
		
		minBalance = getBalance();
		maxBalance = getBalance();
	}
	
	public void credit(Credit c)
	{
		super.credit(c);
		if(getBalance() < minBalance)
		minBalance = getBalance();
	}
	
	public void debit(Debit d)
	{
		super.debit(d);
		if(getBalance() > maxBalance)
			maxBalance = getBalance();
	}
	
	public int getMin()
	{
		return minBalance;
	}
	
	public int getMax()
	{
		return maxBalance;
	}

}
