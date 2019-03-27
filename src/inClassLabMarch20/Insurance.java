package inClassLabMarch20;
import java.util.Scanner;

public class Insurance {
	
	// the decade of the customer's age + 15 * 20 for the cost
	public static void main(String[] args) {
		
	int birthYear;
	int currentYear;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your birth year here >> ");
	birthYear = sc.nextInt();
	System.out.println("Enter your current year here >> ");
	currentYear = sc.nextInt();
	
	insuranceCost(currentYear, birthYear);
	}
	
	public static void insuranceCost(int currentYear, int birthYear) {
		System.out.println("Cost for insurance : $" + ((currentYear - birthYear)/10 + 15) * 20);
	}
}
