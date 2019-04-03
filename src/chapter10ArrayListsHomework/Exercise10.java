package chapter10ArrayListsHomework;
import java.util.ArrayList;

public class Exercise10 {
	
	public static void main(String[] args)
	{
		ArrayList<String> strList = new ArrayList<String>();
		
		String startStr = "free";
		String endStr = "rich";
		
		strList.add("to");
		strList.add("be");
		
		strList.add("or");
		strList.add("not");
		
		strList.add("to");
		strList.add("be");
		
		strList.add("that");
		strList.add("is");
		
		strList.add("the");
		strList.add("question");
		
		System.out.println("Before removing elements that fall between " + startStr + " and" + endStr);
		
		System.out.println(strList);
		
		removeInRange(strList, startStr, endStr);
		
		System.out.println("After removing elements: ");
		System.out.println(strList);
		
	}
	
	public static void removeInRange(ArrayList<String> sList, String start, String end)
	{
		for(int index = 0; index < sList.size(); index++)
			if(sList.get(index).compareTo(start) > 0 && sList.get(index).compareTo(end) < 0)
			{
				sList.remove(index); // removing an element at the index
				index = 0; // making the index to be zero
			}
	}

}
