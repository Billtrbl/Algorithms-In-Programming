package HomeworkWeek3;

public class exercise9 {
	
	public static int minGap(int[] arr) {
		
	    if (arr.length < 2) {
	        return 0;
	    } else {
	        int min = arr[1] - arr[0];
	        
	        for (int i = 1; i < arr.length - 1; i++) {
	            int difference = arr[i + 1] - arr[i];
	            if (difference < min) {
	                min = difference;
	            }
	        }
	        
	        return min;
	    }
	}

}
