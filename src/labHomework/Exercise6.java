package labHomework;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise6 {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File fl = new File("C:\\CIS\\exercise6.txt");         // a new file object
		Scanner sc = new Scanner(fl);                         // a new scanner object
		printStrings(sc);                                     // calling the printStrings method
	}
	
	public static void printStrings(Scanner sc)
	{
		while(sc.hasNextLine())
		{
			int n = sc.nextInt();                             // to read times in the line
			String str = sc.next();                           // to read string in the line

			for(int i = 0; i < n; i++)                        // prints out the string for the number amount of times
				System.out.println(str + " ");
			System.out.println();
		}
	}
	
	// I created a text file, "exercise6.txt" in C drive
	// I wrote the following:
	/*
	 * 5 hello
	 * 2 world
	 */
	
	// It printed out:
	/* hello
	 * hello
	 * hello
	 * hello
	 * hello
	 * 
	 * world
	 * world
	 */

}
