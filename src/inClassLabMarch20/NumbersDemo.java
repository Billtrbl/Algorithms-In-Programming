package inClassLabMarch20;

public class NumbersDemo {

	
	public static void main(String[] args) {
		
		int x = 4;
		int y = 10;
		
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
