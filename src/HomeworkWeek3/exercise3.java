package HomeworkWeek3;
import java.io.*;

public class exercise3 {
	
	public static int countInRange(int[] arr, int min, int max) {
	    int count = 0;
	    
	    for (int i = 0; i < arr.length; i++) {
	        int num = arr[i];
	        if (num >= min && num <= max) {
	            count++;
	        }
	    }   
	    return count;
	}

}
