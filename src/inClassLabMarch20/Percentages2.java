package inClassLabMarch20;
import java.util.Scanner;

public class Percentages2 {
	
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		double num1;
		double num2;
		
		System.out.println("Enter a number here >>");
		num1 = sc.nextDouble();
		
		System.out.println("enter a number here >>");
		num2 = sc.nextDouble();
		
		computePercent(num1, num2); // displays two values and the value of the first number as a percentage of the second one.
		computePercent(num2, num1); // reverse
		
	}
	
	public static void computePercent(double num1, double num2) {
		
		System.out.println(num1 + " is " + ((num1 / num2)*100) +"% of " + num2 );
		
	}

}
