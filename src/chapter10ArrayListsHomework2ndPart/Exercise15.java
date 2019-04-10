package chapter10ArrayListsHomework2ndPart;
import java.util.*;

public class Exercise15 {

	public static void main(String[] args)
	{
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		intList.add(4);
		intList.add(7);
		intList.add(9);
		intList.add(2);
		intList.add(7);
		intList.add(7);
		intList.add(5);
		intList.add(3);
		intList.add(5);
		intList.add(1);
		intList.add(7);
		intList.add(8);
		intList.add(6);
		intList.add(7);
		
		System.out.println("List before being filtered: " + intList);
		filterRange(intList, 5, 7);
		System.out.println("List after being filtered: " + intList);
	}
	
	public static ArrayList<Integer> filterRange(ArrayList<Integer> list, int min, int max)
	{
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i) >= min && list.get(i) <= max)
			{
				list.remove(i);
				i--;
			}
		}
		return list;
	}
}
