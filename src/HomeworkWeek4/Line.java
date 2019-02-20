package HomeworkWeek4;

import HomeworkWeek4.linePoints.Point;

public class Line {
	
	Point p1;
	Point p2;
	
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public line(int x1, inty1, int x2, int y2) {
		p1 = new Point(x1,y1);
		p2 = new Point(x2,y2);
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
