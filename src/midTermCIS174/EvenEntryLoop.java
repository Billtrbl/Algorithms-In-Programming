package midTermCIS174;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;

		// obtain even or odd number
		while (num > 0) {
			System.out.println("Enter a number: ");
			num = sc.nextInt();
			if (num % 2 != 0) {
				System.out.println();
			} else if (num == 999) {
				break;
			} else {
				System.out.println("Good job!");
				break;
			}
		}

	}
}
