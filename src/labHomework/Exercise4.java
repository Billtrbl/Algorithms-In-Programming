package labHomework;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Exercise4 {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("C:\\CIS\\names.txt"); // created a text file with the names inside
		
		Scanner sc = new Scanner(file); // scanner object to read the names in the file
		
		mostCommonNames(sc); 
		
	}

	public static void mostCommonNames(Scanner sc) throws FileNotFoundException
	{
		while(sc.hasNextLine())
		{
			String line = sc.nextLine(); 
			Scanner sc1 = new Scanner(line); // scanner to read each line
			int maxCount = 0;
			String mostCommon = " ";
			
			while(sc1.hasNext()) 
			{
				String name = sc1.next();
				int countOfName = 0;
				Scanner sc2 = new Scanner(line);
				
				while(sc2.hasNext())
				{
					if(name.contentEquals(sc2.next()))
					{
						countOfName++;
					}
				}
				
				if(countOfName > maxCount)
				{
					maxCount = countOfName;
					mostCommon = name;
				}
			}
			
			System.out.println("Most common name is: " + mostCommon);
		}
	}
	
}
