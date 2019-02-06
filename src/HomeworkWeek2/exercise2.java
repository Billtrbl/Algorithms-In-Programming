package HomeworkWeek2;

public class exercise2 {
	public static int gcd(int a, int b) {
		while (b != 0) {
			int c = a % b;
			a = b;
			b = c;
		}
		return Math.abs(a);
	}
}
