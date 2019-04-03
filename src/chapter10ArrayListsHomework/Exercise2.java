package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise2 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>(); // create an array list of type String

		arrayList.add("to"); // adding elements into the Array List
		arrayList.add("be");
		arrayList.add("or");
		arrayList.add("not");
		arrayList.add("to");
		arrayList.add("be");
		arrayList.add("hamlet");

		System.out.println("Before Swapping array list," + " elements are: "); // displaying the array list before
																				// swapping
		System.out.println(arrayList);

		swapPairs(arrayList);
		System.out.println("After swapping array list," + " elements are: "); // displaying the array list after
																				// swapping
		System.out.println(arrayList);
	}

	public static void swapPairs(ArrayList<String> list) {
		String first; // declaring two variables
		String second;

		for (int index = 0; index < list.size() - 2; index = index + 2) {
			first = list.get(index);
			second = list.get(index + 1);
			list.set(index, second);
			list.set(index + 1, first);
		}
	}

}
