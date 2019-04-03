package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise8 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(0);
		intList.add(7);
		intList.add(2);
		intList.add(0);
		intList.add(0);
		intList.add(4);
		intList.add(0);

		System.out.println("Initial list: " + intList);

		removeZeros(intList);

		System.out.println("Updated list: " + intList);
	}

	public static void removeZeros(ArrayList<Integer> iList) {
		if (iList.size() == 0) {
			System.out.println("An empty list");
			System.exit(0);
		} else {
			int size = iList.size(); // getting the size of the int array
			for (int index = 0; index < size; index++)
				if (iList.get(index) == 0) {
					iList.remove(index); // removing an element if it is matched with zero
					size = size - 1; // decreasing size by one
					index = 0; // making index as zero
				}
		}
	}

}
