package labHomework;
import java.util.Scanner;


public class Exercise1 {
	
	public static void coinFlip(Scanner sc) 
	{
		while(sc.hasNextLine()) 
		{
			Scanner ln = new Scanner(sc.nextLine()); // scanner
			
			int h = 0;
			int t = 0;
			
			while(ln.hasNext())
			{
				String c = sc.next().toLowerCase(); // convert to lower case
				if(c.equals("h")) 
				{
					h++;
				}
				else
				{
					t++;
				}
			}
			
			double percent = (double) (h * 100) / (h + t);
			
			System.out.println(h + " heads (" + String.format("%.1f", percent) + "%)");
			
			if (h > t)
				System.out.println("You win!");
			
			System.out.println();
		}
	}
	
	
}
