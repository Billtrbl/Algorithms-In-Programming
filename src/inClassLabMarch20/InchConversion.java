package inClassLabMarch20;
import java.util.Scanner;


public class InchConversion {
	
	// 12 inches in a foot
	// 3 feet in a yard
	
	public static void main(String[] args) {
		
		double num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number in inches here >>");
		num = sc.nextDouble();
		
		convertToFeet(num);
		convertToYards(num);
	}
	
	public static void convertToFeet(double num) {
		System.out.println(num + " is " + (num/12) + " feet");
	}
	
	public static void convertToYards(double num) {
		System.out.println(num + " is " + ((num/12)/3) + " yards");
	}

}
