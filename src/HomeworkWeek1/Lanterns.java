package HomeworkWeek1;

public class Lanterns {
	public static void main(String[] args) {
		setOne();
		fiveLines();
		thirteenStars();
		setOne();
		fiveStars();
		setTwo();
		setThree();
	}
	private static void fiveStars() {
		System.out.println("    *****       ");
	}
	private static void nineStars() {
		System.out.println("  *********     ");
	}
	private static void thirteenStars() {
		System.out.println("*************   ");
	}
	private static void fiveLines() {
		System.out.println("* | | | | | *   ");
	}
	private static void starsOne() {
		fiveStars();
		nineStars();
		thirteenStars();
	}
	private static void setOne() {
		starsOne();
		starsOne();
	}
	private static void setTwo() {
		fiveLines();
		fiveLines();
	}
	private static void setThree() {
		fiveStars();
		fiveStars();
	}
}
