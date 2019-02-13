package HomeworkWeek3;

public class exercise1 {
	
	public static void main(String[] args) {
		
		int[] values = {99, 27, 86, 33, 85, 42, 59, 78, 85, 81, 85};
		
		int value = 85;
		int index = lastIndexOf(values,value);
		
		System.out.println("The last index of the value " + value + " is " + index);
	}
	
	public static int lastIndexOf(int[] values, int value) {
		int index = -1;
		int counter = 0;
		for (int i : values) {
			if (i == value) {
				index = counter;
			}
			counter++;
		}
		return index;
	}

}
