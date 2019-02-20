package HomeworkWeek4;

import java.util.Scanner;

public class linePoints {
	class Point {
		int x;
		int y;

		public Point() {
			x = 0;
			y = 0;
		}

		public Point(int a, int b) {
			x = a;
			y = b;
		}

		public void setX(int a) {
			x = a;
		}

		public void setY(int a) {
			y = a;
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public void flip() {
			x = -x;
			y = -y;
			int temp = x;
			x = y;
			y = temp;
		}

		public boolean isVertical(Point other) {
			if (x == other.x) {
				return true;
			} else {
				return false;
			}
		}

		public double slope(Point other) {
			if (x == other.x) {
				throw new IllegalArgumentException();
			} else {
				return (y - other.y) / (x - other.x);
			}
		}

		public int manhattanDistance(Point other) {
			return Math.abs(x - other.x) + Math.abs(y - other.y);
		}

		public void display() {
			System.out.println("(" + x + "," + y + ")");
		}
	}

	class Line
	{
	   Point p1;
	   Point p2;
	  
	   public Line(Point p_1, Point p_2)
	   {
	       p1=p_1;
	       p2=p_2;
	   }
	  
	   public Point getP1()
	   {
	       return p1;
	   }
	   public Point getP2()
	   {
	       return p2;
	   }
	  
	   public String toString()
	   {
	       return "[("+p1.getX()+", "+p1.getY()+"), ("+p2.getX()+", "+p2.getY()+")]";
	   }
}
}