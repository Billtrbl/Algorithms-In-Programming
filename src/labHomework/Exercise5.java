package labHomework;
import java.io.*;
import java.util.*;

public class Exercise5 {
	
	public static void printDuplicates(Scanner s)
	{
		while(s.hasNext())
		{
			String line = s.nextLine();
			StringTokenizer words = new StringTokenizer(line);
			String previousWord = words.nextToken();
			int count = 1;
			
			while(words.hasMoreElements())
			{
				String currentWord = words.nextToken();
				
				//System.out.print(previousWord + currentWord + count + " ");
				
				if(previousWord.contentEquals(currentWord))
					count++;
				else if(count != 1)
				{
					System.out.print(previousWord + "*" + count + " ");
					count = 1;
				}
				
				previousWord = currentWord;
			}
			
			if(count != 1)
				System.out.println(previousWord + "*" + count);
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner s = new Scanner(new File("C:\\CIS\\duplicates.txt"));
		printDuplicates(s);
	}
	

}
