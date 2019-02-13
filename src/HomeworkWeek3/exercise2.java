package HomeworkWeek3;

public class exercise2 {
	
	public static int range(int num[]) {
		
		int maximum;
		int minimum;
		
		maximum = num[0];
		minimum = num[0];
		
		for(int i = 1; i<num.length; i++) {
			if(num[i] > maximum)
				maximum = num[i];
			if(num[i] < minimum)
				minimum = num[i];
		}
		return (maximum - minimum + 1);
	}

}
