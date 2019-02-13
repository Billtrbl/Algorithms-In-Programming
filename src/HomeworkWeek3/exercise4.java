package HomeworkWeek3;

public class exercise4 {
	
	public static void main (String[] args) {
		
		double[] list1 = {1, 2, 3, 5, 7, 11, 13, 17, 19};
		double[] list2 = {1, 2, 3, 5, 7, 13, 11, 17, 19};
		
		if (isSorted(list1)) {
			System.out.println("list1 is increasing");
		}
		else {
			System.out.println("list1 isn't increasing");
		}
		
		if (isSorted(list2)) {
			System.out.println("list2 is increasing");
		}
		else {
			System.out.println("list2 isn't increasing");
		}
	}
	
	public static boolean isSorted(double[] list) {
		//checking if the list is in increasing order
		double lastValue = 0.0;
		int counter = 0;
		for (double d : list) {
			if (counter > 0)
			{
				if (lastValue > d) {
				//not increasing order
					return false;
				}
			}
			lastValue = d;
			counter ++;
		}
		return true;
	}

}
