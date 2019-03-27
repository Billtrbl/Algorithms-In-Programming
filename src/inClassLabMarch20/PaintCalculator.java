package inClassLabMarch20;
import java.util.Scanner;

public class PaintCalculator {
	
	// a gallon of paint covers about 350 square feet of wall space

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double length;
		double width;
		double height;
		
		System.out.println("Enter the lenght of the room in feet >>");
		length = sc.nextDouble();
		System.out.println("Enter the width of the room in feet >>");
		width = sc.nextDouble();
		System.out.println("Enter the height of the room in feet >>");
		height = sc.nextDouble();
		
		areaOfRoom(length, width, height);
		gallonOfPaintNeeded(length, width, height);
		totalCostOfPaint(length, width, height);
		
	}

	public static void areaOfRoom(double length,double width,double height) {
		System.out.println("The area of the room is " + (2 * ((length * height) + (width * height))) + " square feet");
	}
	
	public static void gallonOfPaintNeeded(double length,double width,double height) {
		double area = ((2 * ((length * height) + (width * height)))/350);
		System.out.println("The number of gallons needed to paint the room is " + area);
	}
	
	public static void totalCostOfPaint(double length,double width,double height) {
	double area = ((2 * ((length * height) + (width * height)))/350);
		System.out.println("The total cost to paint the room is $" + (area*32));
	}
}
