package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise5 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>(); // creating an array list of type integer

		intList.add(4); // adding values to the array list
		intList.add(1);
		intList.add(2);
		intList.add(0);
		intList.add(3);

		scaleByK(intList);
		System.out.println(intList);
	}

	public static void scaleByK(ArrayList<Integer> aList) {
		int temp; // declaring an int temp
		int pos = 0; // declaring an int value

		ArrayList<Integer> tempList = new ArrayList<Integer>(); // creating a temp array list

		for (int i = 0; i < aList.size(); i++) // copying the elements from the original array list to temp array list
			tempList.add(i, aList.get(i));

		aList.clear(); // removing all int from the list

		for (int index = 0; index < tempList.size(); index++) {
			temp = tempList.get(index); // getting an int value from temp array list at index position

			if (temp != 0 && temp > 0)
				for (int i = 0; i < temp; i++, pos++)
					aList.add(pos, temp);
		}
	}

}
