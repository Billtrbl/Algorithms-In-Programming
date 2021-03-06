package chapter3;

public class conciseHypotenuse {
	
	public static void main(String[] args) {
		System.out.println("Hypotenuse 1 = " + hypotenuse(5,12));
		System.out.println("Hypotenuse 2 = " + hypotenuse(3,4));
	}
	
	public static double hypotenuse(double a, double b) {
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
		
		// return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));  --- ALTERNATIVE SOLUTION
		
		// or
		
		// return Math.sqrt(a * a + b * b); --- AVOIDING ---> Math.pow
	}
	
}
