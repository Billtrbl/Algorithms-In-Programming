package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("Banana");
		list.add("apple");
		list.add("orange");
		list.add("pineapple");

		removeEvenLength(list);
		System.out.println(list);
	}

	public static void removeEvenLength(ArrayList<String> aList) {
		String listElement;

		for (int index = 1; index < aList.size(); index++) {
			listElement = aList.get(index);
			if (listElement.length() % 2 == 0)
				aList.remove(index);
		}
	}

}
