package chapter10ArrayListsHomework2ndPart;
import java.util.*;

public class Exercise14 {

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
		
		System.out.println("Before removing the shorter strings: " + strList);
		
		removeShortStrings(strList);
		
		System.out.println("After removing the shorter strings: " + strList);
		
	}
	
	public static void removeShortStrings(ArrayList<String> list)
	{
		String first;
		String second;
		
		int count = list.size(); // Counting the size of the string list
		
		ArrayList<String> temp = new ArrayList<String>(); // A temporary Array List
		
		if(list.size()%2 == 0)
		{
			for(int index = 0; index < list.size(); index += 2)
			{
				first = list.get(index);
				second = list.get(index + 1);
				
				if(first.length() == second.length()); // If the two strings are equal
					temp.add(second);
					
				if(first.length() < second.length()) // Comparing the two strings
					temp.add(second);
				else
					temp.add(first);
			}
			
			list.clear();
			for(int index = 0; index < temp.size(); index++)
			
				list.add(index, temp.get(index));
			}
			else
			{
				for(int index = 0; index < list.size() - 1; index += 2)
				{
					first = list.get(index);
					second = list.get(index + 1);
					
					if(first.length() == second.length()) // If the two strings are equal
						temp.add(second);
					if(first.length() < second.length()) // Comparing the two strings
						temp.add(second);
					else
						temp.add(first);
				}
				
				temp.add(list.get(count - 1)); // Taking the last string in the list array list
				list.clear();
				
				for(int index = 0; index < temp.size(); index++)
					list.add(index, temp.get(index));
			}
		}
		
	}

