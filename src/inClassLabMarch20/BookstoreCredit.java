package inClassLabMarch20;

import java.util.Scanner;

public class BookstoreCredit {
	
	// 10 * gpa, 3.2 gpa = $32 credit
		
		public static void main(String[] args) {
			
			double gpa;
			String name;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your student name >> ");
			name = sc.nextLine();
			System.out.println("Enter your student GPA >> ");
			gpa = sc.nextDouble();
			
			
			
			
			getCredit(gpa, name);
			
		}
		
		public static void getCredit(double num, String nm) {
			System.out.println("Student name: " + nm + " has a GPA of " + num + " and will obtain a credit of $" + (num*10) );
		}
		
	}