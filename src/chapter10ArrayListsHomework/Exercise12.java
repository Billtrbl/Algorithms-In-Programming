package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise12 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("this");
		list.add("is");
		list.add("lots");
		list.add("of");
		list.add("fun");
		list.add("for");
		list.add("java");
		list.add("coders");

		System.out.println("Initial list: " + list);

		markLength4(list);

		System.out.println("Updated list with asterisks " + list);
	}

	public static void markLength4(ArrayList<String> strList) {

		ArrayList<String> tempList = new ArrayList<String>();

		for (int index = 0; index < strList.size(); index++) {
			if (strList.get(index).length() == 4) {
				tempList.add("****");
				tempList.add(strList.get(index));
			} else
				tempList.add(strList.get(index));
		}
		strList.clear();
		for (int i = 0; i < tempList.size(); i++)
			strList.add(i, tempList.get(i));
	}

}
