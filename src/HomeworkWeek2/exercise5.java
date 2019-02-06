package HomeworkWeek2;

import java.util.Random;

public class exercise5 {

		public static void main(String[] args) {
			randomLines(10);
		}
		
		public static void randomLines( int numberOfLines) {
			String pool = "abcdefghijklmnopqrstuvwxyz";
			Random r = new Random();
			String sb = "";
				for(int i = 0 ; i < numberOfLines; i++)
				{
					sb += pool.charAt(r.nextInt(pool.length()));
				}
				System.out.println("Random Letters : " + sb);
		}
	}

