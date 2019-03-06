package chapter9;

import java.util.Scanner;

public class Item 
{
	String itemName;
	double itemCost;
	double itemDiscount;
	
	Scanner in = new Scanner(System.in);
	
	public Item(String itemName, double itemCost, double itemDiscount)
	{
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.itemDiscount = itemDiscount;
	}
	
	public void setDiscount()
	{
		System.out.println("Enter discount: ");
		itemDiscount = in.nextDouble();
	}
	
	public String getItemName()
	{
		return itemName;
	}
	
	public double getPrice()
	{
		return itemCost - getDiscount();
	}
	
	public double getDiscount()
	{
		return itemCost*0.25;
	}
}
