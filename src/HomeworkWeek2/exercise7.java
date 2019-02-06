package HomeworkWeek2;

import java.util.Random;
import java.util.Scanner;

public class exercise7 {

	public static void main(String[] args) {

		diceSum();
	}

	public static void diceSum() {
		Scanner n = new Scanner(System.in);
		System.out.print("Desired dice sum: ");
		int sum = n.nextInt();
		Random r = new Random();
		int dice1 = r.nextInt(6) + 1;
		int dice2 = r.nextInt(6) + 1;
		int diceSum = dice1 + dice2;
		System.out.println(dice1 + " and " + dice2 + " = " + diceSum);

		while (diceSum != sum) {
			dice1 = r.nextInt(6) + 1;
			dice2 = r.nextInt(6) + 1;
			diceSum = dice1 + dice2;
			System.out.println(dice1 + " and " + dice2 + " = " + diceSum);
		}
	}

}
