package chapter10ArrayListsHomework2ndPart;
import java.util.*;

public class Exercise13 { // Reverse3

	public static void main(String[] args)
	{
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(3);
		intList.add(8);
		intList.add(19);
		intList.add(42);
		intList.add(7);
		intList.add(26);
		intList.add(19);
		intList.add(-8);
		
		System.out.println("Before Reverse3: " + intList);
		reverse3(intList);
		System.out.println("After Reverse3: " + intList);
		
	}
	
	public static void reverse3(ArrayList<Integer> list)
	{
		for(int i = 2; i < list.size(); i += 3)
		{
			int temp = list.get(i);
			list.set(i,  list.get(i - 2));
			list.set(i - 2, temp);
		}
	}
}
