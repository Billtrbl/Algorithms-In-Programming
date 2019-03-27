package inClassLabMarch20;
import java.util.Scanner;


public class NumbersDemo2 {
	
public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int x;
		int y;
		
		System.out.println("Enter an integer >> ");
		x = s.nextInt();
		System.out.println("Enter a different integer >>");
		y = s.nextInt();
		
		displayTwiceTheNumber(x);
		displayNumberPlusFive(x);
		displayNumberSquared(x);
		System.out.println("");
		displayTwiceTheNumber(y);
		displayNumberPlusFive(y);
		displayNumberSquared(y);
		
	}
	
	public static void displayTwiceTheNumber(int x) {
		System.out.println(x * 2);
	}
	
	public static void displayNumberPlusFive(int x) {
		System.out.println(x + 5);
	}
	
	public static void displayNumberSquared(int x) {
		System.out.println(x * x);
	}

}
