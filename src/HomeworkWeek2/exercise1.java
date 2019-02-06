package HomeworkWeek2;

public class exercise1 {
	public static void main(String[] args) {
		showTwos(7);
		showTwos(18);
		showTwos(68);
		showTwos(120);
	}
	
	public static void showTwos(int number) {
		System.out.print(number + " = ");
		int mod = 0, n = number;
		while(true) {
			mod = n % 2;
			if (mod == 0) {
				n = n / 2;
				System.out.print("2");
			} else {
				System.out.print(n);
				break;
			}
			System.out.print(" * ");
		}
		System.out.println(" ");
	}
}
