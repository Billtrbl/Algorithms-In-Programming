package HomeworkWeek3;

public class exercise10 {
	
	public static void main (String[] args) {
		
		int[] list1 = {32, 46, 52, 20, 8, 16, 91, 99, 4, 12};
		int[] list2 = {12, 8, 4, 6, 98, 96, 90, 88, 89, 97};
		
		System.out.println("the percentage of numbers in list1 is " + percentNum(list1));
		
		System.out.println("the percentage of numbers in list2 is " + percentNum(list2));
	}
	
	public static double percentNum(int[] values) {
		int evenNum = 0;
		for (int i : values) {
			if (i % 2 == 0) {
				evenNum ++;
				//eventHit = eventHit + 1
			}
		}
		double percentage = ((double)evenNum / values.length) * 100;
		
		return percentage;
	}

}
