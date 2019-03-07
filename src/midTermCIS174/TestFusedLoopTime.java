package midTermCIS174;
import java.time.*;

public class TestFusedLoopTime 
{
	public static void main(String[] args)
	{
		int startTime, endTime;
		int x;
		final int REPEAT = 8_000_000;
		final int FACTOR = 1_000_000;
		
		LocalDateTime now;
		now = LocalDateTime.now();
		startTime = now.getNano();
		
		for(x = 0; x < REPEAT; ++x)
			method1();
		for(x = 0; x < REPEAT; ++x)
			method2();
		
		now = LocalDateTime.now();
		endTime = now.getNano();
		System.out.println("Time for loops executed separately: " + ((endTime - startTime) / FACTOR) + " milliseconds");
		
		now = LocalDateTime.now();
		startTime = now.getNano();
		for(x = 0; x < REPEAT; ++x)
		{
			method1();
			method2();
		}
		
		now = LocalDateTime.now();
		endTime = now.getNano();
		System.out.println("Time for loops executed in a block: " + ((endTime - startTime) / FACTOR) + " milliseconds");
	}

	private static void method2() {
		// TODO Auto-generated method stub
		int number;
	}

	private static void method1() 
	{
		// TODO Auto-generated method stub
		int number;
	}
}
