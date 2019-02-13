package HomeworkWeek2;

public class exercise3 {
	public static void main(String[] args) {
		toBinary(40);
	}
	
	public static String toBinary(int num) {
		if (num == 0)
			return "0";

		int mask = 0x80000;
		StringBuilder bin = new StringBuilder();

		while (mask != 0 && (num & mask) == 0) {
			mask >>>= 1;
		}

		while (mask != 0) {
			if ((num & mask) != 0) {
				bin.append('1');
			} else {
				bin.append('0');
			}
			mask >>>= 1;
		}

		return bin.toString();
	}
	
}
