package chapter9;

public class Cash implements Asset
{
	private double amount;
	
	public Cash(double amount)
	{
		this.amount = amount;
	}
	
	public double getMarketValue()
	{
		return amount;
	}
	
	public double getProfit()
	{
		return 0.0;
	}
	
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	
	public boolean equals(Stock stock1, Stock stock2)
	{
		if(stock1.getMarketValue() == stock2.getMarketValue())
			return true;
		else
			return false;
	}
}
