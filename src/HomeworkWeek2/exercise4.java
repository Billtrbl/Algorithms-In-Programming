package HomeworkWeek2;

import java.util.Random;

public class exercise4 {
	
	public static void main(String[] args) {
		randomX();
	}
	// randomX
	public static void randomX() {
	    Random random = new Random();
	    int x = random.nextInt(15) + 5;
	    
	    while (x < 15) {
	    
	        for (int i = 0; i < x; i++) {
	            System.out.print("x");
	        }
	        
	        System.out.println();
	        x = random.nextInt(15) + 5;
	    }
	    
	    for (int i = 0; i < x; i++) {
	        System.out.print("x");
	    }
	    
	    System.out.println();
	}
}