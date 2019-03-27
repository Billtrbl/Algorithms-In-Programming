package inClassLabMarch20;

public class Percentages {
	
	public static void main(String[] args) {
		
		double num1 = 2.0;
		double num2 = 10.0;
		
		computePercent(num1, num2); // displays two values and the value of the first number as a percentage of the second one.
		computePercent(num2, num1); // reverse
		
	}
	
	public static void computePercent(double num1, double num2) {
		
		System.out.println(num1 + " is " + ((num1 / num2)*100) +"% of " + num2 );
		
	}

}
