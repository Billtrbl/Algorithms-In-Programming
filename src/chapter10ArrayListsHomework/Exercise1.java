package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); // Declare an ArrayList of String type and create an array
															// list

		double avgNoVowels = averageVowels(list); // calling method averageVowels with empty list

		if (avgNoVowels == 0) // if the average number of vowels = 0, it will print out..
			System.out.println("Empty list");
		else // if it contains any number of vowels it will print out..
			System.out.println("Average number of vowels: " + avgNoVowels);

		list.add("pineapple"); // Adding strings to the list
		list.add("cactus");
		list.add("lamborghini");
		list.add("microsoft");

		avgNoVowels = averageVowels(list);
		if (avgNoVowels == 0)
			System.out.println("Empty List");
		else
			System.out.println("Average number of vowels: " + avgNoVowels);
	}

	public static double averageVowels(ArrayList<String> list) {
		String listElement; // a local string variable
		int numOfVowels = 0; // an integer variable
		if (list.size() == 0) // checking if the array list is empty
			return numOfVowels;
		else {
			for (int listCount = 0; listCount < list.size(); listCount++) {
				listElement = list.get(listCount); // takes one list element at listCount position
				for (int index = 0; index < listElement.length(); index++) {
					switch (listElement.charAt(index)) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						numOfVowels++;
					}
				}
			}
		}
		return (double) numOfVowels / list.size();
	}
}
