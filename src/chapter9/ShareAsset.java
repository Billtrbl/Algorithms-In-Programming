package chapter9;

public class ShareAsset 
{
	private String symbol;
	private double totalCost;
	private double currentPrice;
	
	public ShareAsset(String symbol, double currentPrice)
	{
		this.symbol = symbol;
		this.currentPrice = currentPrice;
		totalCost = 0.0;
	}
	
	public void addCost(double cost)
	{
		totalCost += cost;
	}
	
	public void setCurrentPrice(double currentPrice)
	{
		this.currentPrice = currentPrice;
	}
	
	public double getCurrentPrice()
	{
		return currentPrice;
	}
	
	public double getTotalCost()
	{
		return totalCost;
	}
}
