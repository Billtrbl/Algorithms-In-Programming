package HomeworkWeek2;

import java.util.Random;

public class exercise6 {
	
	public static void main(String[] args) {
		makeGuesses();
	}

	public static void makeGuesses() {
	    int numOfGuesses = 1;
	    Random r = new Random();
	    int guess = r.nextInt(50) + 1;
	    System.out.println("guess = " + guess);
	    
	    while (guess < 48) {
	        guess = r.nextInt(50) + 1;
	        numOfGuesses++;
	        System.out.println("guess = " + guess);   
	    }
	    
	    System.out.println("total guesses = " + numOfGuesses);
	}
}
