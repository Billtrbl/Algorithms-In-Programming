package labHomework;
import java.util.*;

public class Exercise7 { //reverseLines
	
	public static void main(String[] args)
	{
		String original;
		String reverse = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word to reverse: ");
		original = sc.nextLine();
		
		int length = original.length();
		
		for(int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		
		System.out.println("Reverse of entered word is: " + reverse);
	}
}
