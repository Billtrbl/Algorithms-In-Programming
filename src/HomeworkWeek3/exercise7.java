package HomeworkWeek3;

public class exercise7 {
	
	public static int kthLargest(int k, int[] arr) {

	    for (int i = 0; i < arr.length; i++) {
	        int min = arr[i];
	        
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[j] < min) {
	                int temp = min;
	                arr[i] = arr[j];
	                arr[j] = temp;
	                min = arr[i];
	            }
	        }
	    }    
	    return arr[arr.length - 1 - k];
	}
}
