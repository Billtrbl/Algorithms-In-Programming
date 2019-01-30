package HomeworkWeek1;

public class StarFigures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		comboOne();
		comboOne();
		doubleFives();
		threeOnes();
		comboOne();
	}
	private static void fiveStars() {
		System.out.println("*****");
	}
	private static void twoStars() {
		System.out.println(" * *");
	}
	private static void oneStar() {
		System.out.println("  *");
	}
	private static void doubleFives() {
		fiveStars();
		fiveStars();
	}
	private static void twoOneTwo() {
		twoStars();
		oneStar();
		twoStars();
	}
	private static void threeOnes() {
		oneStar();
		oneStar();
		oneStar();
	}
	private static void comboOne() {
		doubleFives();
		twoOneTwo();
	}
}
