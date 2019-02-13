package HomeworkWeek3;

public class exercise8 {
	
	public static int median(int[] arr) {
	    int[] countArr = new int[100];
	    
	    for (int i = 0; i < arr.length; i++) {
	    	countArr[arr[i]]++;
	    }
	    int sum = 0;
	    int median = -1;
	    
	    for (int i = 0; i < countArr.length; i++) {
	        sum += countArr[i];
	        if (sum == arr.length / 2 + 1) {
	            return i;
	        }
	    }
	    
	    return -1;
	}
}
