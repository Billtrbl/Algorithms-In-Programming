package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise7 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // creating an array list of type string

		list.add("be");
		list.add("be");
		list.add("is");
		list.add("not");
		list.add("or");
		list.add("question");
		list.add("that");
		list.add("the");
		list.add("to");
		list.add("to");

		System.out.println("Initial list is: " + list);

		removeDuplicates(list);

		System.out.println("Updated list is: " + list);

	}

	public static void removeDuplicates(ArrayList<String> aList) {
		if (aList.size() == 0) {
			System.out.println("Is an empty list");
			System.exit(0);
		} else {
			String element;
			int count = 0;
			for (int i = 0; i < aList.size(); i++) {
				element = aList.get(i);
				for (int index = 0; index < aList.size(); index++) {
					if (aList.get(index) == element)
						count++;
					if (count > 1) {
						aList.remove(element);
						count = 0;
					}
				}
				count = 0;
			}
		}
	}

}
