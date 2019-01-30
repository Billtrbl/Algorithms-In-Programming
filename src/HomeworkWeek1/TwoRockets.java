package HomeworkWeek1;

public class TwoRockets {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		topRocket();
		bottomRocket();
		unitedStates();
		unitedStates();
		bottomRocket();
		topRocket();
		
		// The same structure is repeated -- top of the rocket and the body of the rocket
		
		
		
	}
	private static void topRocket() {
		System.out.println("     /\\                /\\       ");
		System.out.println("    /  \\              /  \\      ");
		System.out.println("   /    \\            /    \\     ");
	}
	private static void bottomRocket() {
		System.out.println("  +------+          +------+      ");
		System.out.println("  |      |          |      |      ");
		System.out.println("  |      |          |      |      ");
		System.out.println("  +------+          +------+      ");
	}
	private static void unitedStates() {
		System.out.println("  |United|          |States|      ");
	}
}
