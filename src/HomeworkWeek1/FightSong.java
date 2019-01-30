package HomeworkWeek1;

public class FightSong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		verseFour();
		verseFour();
		verseThree();
	}
	private static void verseOne() {
		System.out.println("Go, team, go!");
		System.out.println("You can do it.");
	}
	private static void VerseTwo() {
		System.out.println("You're the best,");
		System.out.println("In the West.");
	}
	private static void verseThree() {
		verseOne();
		verseOne();
	}
	private static void verseFour() {
		verseThree();
		VerseTwo();
	}
	

}
