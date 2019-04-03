package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise11 {

	public static void main(String[] args) {
		int i = 0;
		int k = 4;

		ArrayList<String> list = new ArrayList<String>();

		list.add("how");
		list.add("are");
		list.add("you?");

		System.out.println("Initial list: " + list);

		stutter(list, k);

		System.out.println("Stuttering list: " + list);
	}

	public static void stutter(ArrayList<String> list, int k) {
		int size = list.size(); // declaring a variable to hold the size of the array list

		if (k == 0) // if k is zero then the set is empty
		{
			list.clear();
		} else {
			for (int i = 0; i < size * (k - 1); i++) // separating the strings in an ArrayList
			{
				list.add("");
			}
			for (int i = size - 1; i >= 0; i--) {
				for (int j = k - 1; j > 0; j--) {
					list.set(k * i + j, list.get(i));
				}
			}
		}
	}

}
