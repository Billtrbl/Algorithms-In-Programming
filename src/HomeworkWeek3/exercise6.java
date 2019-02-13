package HomeworkWeek3;

public class exercise6 {
	
	public static double stdev(int[] arr) {
	    int sum = 0;
	    
	    for (int i = 0; i < arr.length; i++) {
	        sum += arr[i];
	    }
	    
	    double average = (double)sum / arr.length;
	    double top = 0;
	    
	    for (int i = 0; i < arr.length; i++) {
	        top += Math.pow(arr[i] - average, 2);
	    }
	    
	    return Math.sqrt(top / (arr.length - 1));
	}

}
