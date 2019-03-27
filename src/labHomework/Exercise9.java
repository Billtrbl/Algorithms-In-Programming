package labHomework;
import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;


public class Exercise9 {
	
	public static void main(String[] args) throws FileNotFoundException
	{
		File fl = new File("C:\\CIS\\web.txt"); // a new file object
		Scanner sc = new Scanner(fl);           // a new scanner object
		
		stripHtmlTags(sc);
		
	}

	public static void stripHtmlTags(Scanner sc)
	{
		String x = "";
		
		while(sc.hasNext())
		{
			x = sc.nextLine();
			
			x = x.replaceAll("<[^>\r\n]*>", "");
			
			System.out.println(x);
		}
	}
	
}
