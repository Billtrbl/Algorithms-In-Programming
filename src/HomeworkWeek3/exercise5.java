package HomeworkWeek3;

public class exercise5 {
	
	public static int mode(int[] array) {
		
	    int[] countArray = new int[101];
	    
	    for (int i = 0; i < array.length; i++) {
	    	countArray[array[i]]++;
	    }
	    
	    int mode = 101;
	    int count = 0;
	    
	    for (int i = 0; i < countArray.length; i++) {
	        if (countArray[i] > count) {
	            count = countArray[i];
	            mode = i;
	        }
	    }
	    
	    return mode;
}
}
