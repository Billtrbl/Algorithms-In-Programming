package HomeworkWeek1;

public class EggStop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fullEgg();
		bottomEgg();
		lines();
		topEgg();
		stop();
		bottomEgg();
		topEgg();
		lines();
	}
		private static void lines() {
		System.out.println("   +--------+");
		}
		private static void topEgg() {
		System.out.println("    ________");
		System.out.println("   /        \\");
		System.out.println("  /          \\");
		}
		private static void stop() {
		System.out.println("  |   STOP   |");
		}
		private static void bottomEgg() {
		System.out.println("  \\          /");
		System.out.println("   \\________/");
		}
		private static void fullEgg() {
			topEgg();
			bottomEgg();
		}
	}
