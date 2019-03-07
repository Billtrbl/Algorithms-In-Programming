package midTermCIS174;

public class Perfect 
{
	public static void main(String[] args)
	{
	final int MAX = 1000;
	int x;
	int number;
	
	
	for(number = 1; number <= MAX; ++number)
	{
		System.out.print(number + " is a perfect number");
		for(x = 1; x <= number; ++x)
			if(number % x == 0 && x < number)
					System.out.print(x + " ");
		System.out.println();
	}
}
}