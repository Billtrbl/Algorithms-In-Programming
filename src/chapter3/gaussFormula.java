package chapter3;

public class gaussFormula {

	public static int sum(int n) {
		return (n + 1) * n / 2;
	}
	
	public static void main(String[] args) {
		int answer = sum(100);
		
		System.out.println("The sum of 1 through 100 is " + answer);
	}
}
