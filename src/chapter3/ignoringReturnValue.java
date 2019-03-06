package chapter3;

public class ignoringReturnValue {
	

	public static int sum(int n) {
		return (n + 1) * n / 2;
	}
	
	/*
	 *      sum(1000); // doesn't do anything
	 *
	 *
	 *      public static void main(String[] args) {                // void = no return 
	 *      int answer = sum(1000);                                 // better use of sum(int n)
	 *      System.out.println("Sum up to 1000 is " + answer);      // execute program
	 */
	
		public static void main(String[] args) {
			System.out.println("Sum up to 1000 is " + sum(1000));   // shorter code
	}
}
