package HomeworkWeek4;

import HomeworkWeek4.linePoints.Point;

public class Line {
	
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private Point p1;
	private Point p2;
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public int line(int x1, int y1, int x2, int y2) {
		Point p1 = new Point(x1,y1);
		Point p2 = new Point(x2,y2);
	}
	
	public Point getP1() {
		return p1;
	}
	
	public Point getP2() {
		return p2;
	}
	
	public String toString() {
		return "Line points [ (" + p1.getX() + ", " + p1.getY() + ") , ( " + p2.getX()	+ ", " + p2.getY() + ")]";
	}
}
