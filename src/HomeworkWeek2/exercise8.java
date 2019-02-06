package HomeworkWeek2;

import java.util.Random;

public class exercise8 {
	public static void main(String[] args) {
		int steps = 0;
		int max = steps;
		for (int i = 0 ; i < 100 ; i ++) {
			steps += randomWalk(); 
			if (max < steps)
				max = steps;
			System.out.println("position" + i + " = " + steps);
		}
		System.out.println("max position = " + max);
	}
	
	public static int randomWalk() {
		Random r = new Random();
		//random number 1 or 2 
		int number = r.nextInt(2);
		if (number == 1) {
			//if number == 1 then decrease one step
			return -1;
		}
		//if number == 2 then increase one step
		return 1;
	}
}
