package labHomework;
import java.util.Scanner;

public class Exercise8 {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sequence of real numbers: ");
		runningSum(sc);
	}
	
	public static void runningSum(Scanner sc)
	{
		String x = sc.nextLine();
		String nums[] = x.split(" ");
		double d[] = new double[nums.length];
		for(int i = 0; i <d.length; i++)
		{
			d[i] = Double.parseDouble(nums[i]);
		}
		
		double max = d[0];
		double sum = 0;
		for(int i = 0; i< d.length; i++)
		{
			sum = sum + d[i];
			
			if(max<d[i])
			{
				max = d[i];
			}
		}
		
		System.out.println("The running sum of the numbers: " + sum);
		System.out.println("The maximum runnig sum: " + max);
	}
	

}
