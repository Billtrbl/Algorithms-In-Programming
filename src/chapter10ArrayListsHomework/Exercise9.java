package chapter10ArrayListsHomework;

import java.util.ArrayList;

public class Exercise9 {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(7);
		intList.add(2);
		intList.add(0);
		intList.add(0);
		intList.add(4);
		intList.add(0);
		intList.add(9);
		intList.add(0);
		intList.add(6);
		intList.add(4);
		intList.add(8);

		System.out.println("Initial list: " + intList);

		int range = rangeBetweenZeros(intList);

		System.out.println("Range between zero's: " + range);
	}

	public static int rangeBetweenZeros(ArrayList<Integer> iList) {
		int firstIndex = -1;
		int lastIndex = 0;
		int count = -1;

		for (int index = 0; index < iList.size(); index++) {
			if (iList.get(index) == 0) // getting the first occurrence of zero
			{
				firstIndex = index;
				count = 1;
				break;
			}
		}

		if (firstIndex != -1)
			for (int index = firstIndex; index < iList.size(); index++) {
				if (iList.get(index) == 0) // getting the last occurrence of zero
				{
					lastIndex = index;
					count++;
				}
			}
		if (count == 1)
			return 1;
		else if (count == 0)
			return 0;
		else
			return lastIndex - firstIndex + 1;
	}

}
