package chapter10ArrayListsHomework2ndPart;
import java.util.*;

public class Exercise16 {
	public static void main(String[] args)
	{
		ArrayList<String> strList = new ArrayList<String>();
		
		strList.add("four");
		strList.add("score");
		strList.add("and");
		strList.add("seven");
		strList.add("years");
		strList.add("ago");
		strList.add("our");
		
		System.out.println("Before clump: " + strList);
		clump(strList);
		System.out.println("After clump: " + strList);
	}
	
	public static void clump(ArrayList<String> list)
	{
		String first, second, third;
		
		int count = list.size(); // count the size of the list
		
		ArrayList<String> temp = new ArrayList<String>(); // Temporary array list
		
		int mod = list.size()%2;
		if(mod == 0)
		{
			for(int index = 0; index < list.size(); index += 2)
			{
				first = list.get(index);
				second = list.get(index + 1);
				third = " (" + first + " " + second + ") ";
				temp.add(third);
			}
			
			list.clear(); // removing elements in the list
			
			for(int index = 0; index < temp.size(); index++) // adding elements in the temp to list
				list.add(index, temp.get(index));
		}
		else
		{
			for(int index = 0; index < list.size() -1; index += 2)
			{
				first = list.get(index);
				second = list.get(index + 1);
				third = " (" + first + " " + second + ") ";
				temp.add(third);
			}
			
			temp.add(list.get(count - 1)); // add last element to the temp array list
			
			list.clear(); // removing elements in the list
			
			for(int index = 0; index < temp.size(); index++)
				list.add(index, temp.get(index));
		}
	}

}
