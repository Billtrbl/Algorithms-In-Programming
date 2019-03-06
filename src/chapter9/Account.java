package chapter9;

public class Account
{
	String accountType;
	
	public Account(Client c)
	{
		this.accountType = c.clientType;
	}
	
	public boolean process(Transaction t)
	{
		if(t.transactionStatus==true)
			return true;
		else
			return false;
	}
	
	public String getClient()
	{
		return accountType;
	}
}
