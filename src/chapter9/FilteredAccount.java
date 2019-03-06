package chapter9;

public class FilteredAccount extends Account
{
	double zero;
	double transactionCount;
	
	public FilteredAccount(Client c)
	{
		super(c);
		zero = 0;
		transactionCount = 0;
	}
	
	public boolean process(Transaction t)
	{
		if(t.value() == 0)
		{
			zero++;
			return false;
		}
		
		else if(t.value() > 0 && t.transactionStatus == true)
		{
			transactionCount++;
			super.process(t);
			return true;
		}
		else
			return false;
	}
	
	public double percentFiltered()
	{
		if(transactionCount == 0)
			return 0.0;
		else
			return (transactionCount / (zero + transactionCount)) * 100;
		
	}
}
