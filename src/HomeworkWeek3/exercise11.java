package HomeworkWeek3;

public class exercise11 {
	
	public static boolean isUnique(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        int min = arr[i];
	        
	        for (int j = i + 1; j < arr.length; j++) {
	            if (min > arr[j]) {
	            	arr[i] = arr[j];
	            	arr[j] = min;
	                min = arr[i];
	            }
	        }
	        
	    }
	    
	    for (int i = 0; i < arr.length - 1; i++) {
	        if (arr[i] == arr[i + 1]) {
	            return false;
	        }
	    }
	    
	    return true;
	}

}
