package chapter9;

public class CashStockTest {
	
	public static void main(String[] args)
	{
		Stock stock1 = new Stock("$",40);
		Stock stock2 = new Stock("$",30);
		
		stock1.purchase(10, 40);
		stock2.purchase(10, 40);
		
		Cash cash = new Cash(10);
		
		if(cash.equals(stock1,stock2))
			System.out.println("Two stocks are equal");
		else
			System.out.println("Both of them are not equal");
		
		
	}

}
