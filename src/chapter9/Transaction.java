package chapter9;

public class Transaction 
{
	boolean transactionStatus;
	int pennies;
	
	public Transaction(boolean transactionStatus, int pennies)
	{
		this.transactionStatus = transactionStatus;
		this.pennies = pennies;
		
		if(transactionStatus == true)
			value();
	}
	
	public int value()
	{
		return pennies*100;
	}
}
