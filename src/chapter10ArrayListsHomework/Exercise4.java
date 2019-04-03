package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // creating an array list of type String

		list.add("how"); // adding elements to the array list
		list.add("are");
		list.add("you?");

		doubleList(list);
		System.out.println(list);
	}

	public static void doubleList(ArrayList<String> aList) {
		ArrayList<String> tempList = new ArrayList<String>(); // creating a temp array list type String

		for (int i = 0; i < aList.size(); i++)
			tempList.add(i, aList.get(i));

		for (int index = 0; index < tempList.size(); index++)
			aList.add(1 + index * 2, tempList.get(index)); // multiply the elements inside an array list by 2
	}

}
