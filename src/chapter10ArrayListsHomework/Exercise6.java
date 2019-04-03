package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise6 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>(); // creating a new int array list

		intList.add(3); // adding integers to the array list
		intList.add(8);
		intList.add(92);
		intList.add(4);
		intList.add(2);
		intList.add(17);
		intList.add(9);

		System.out.println("Initial list: " + intList);

		minToFront(intList);

		System.out.println("Updated list: " + intList);
	}

	public static void minToFront(ArrayList<Integer> aList) {
		if (aList.isEmpty() || aList.size() == 1)
			return;

		int minPos = 0; // position of the min value

		int minValue = aList.get(0); // get the first value of the list

		for (int index = 1; index < aList.size(); index++) // finding the position of the min value of the list
		{
			if (aList.get(index) < minValue) {
				minValue = aList.get(index);
				minPos = index;
			}
		}

		aList.remove(minPos); // removing the value at the min position

		aList.add(0, minValue); // adding the min val at the first position
	}
}
