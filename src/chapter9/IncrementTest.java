package chapter9;

public class IncrementTest 
{
	public static void main(String[] args)
	{
		SequentialIncrementer sq = new SequentialIncrementer();
		
		System.out.println("Sequential Incrementer ");
		
		sq.increment();
		
		System.out.println(sq.getValue());
		
		sq.increment();
		
		System.out.println(sq.getValue());
		
		RandomIncrementer rdm = new RandomIncrementer();
		
		System.out.println("Random Incrementer ");
		
		rdm.increment();
		
		System.out.println(rdm.getValue());
		
		rdm.increment();
		
		System.out.println(rdm.getValue());
	}
}
