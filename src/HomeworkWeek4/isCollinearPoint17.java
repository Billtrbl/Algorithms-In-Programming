package HomeworkWeek4;

import java.awt.Point;

public class isCollinearPoint17 {
	
	private Point p1;
	private Point p2;
	
	public boolean isCollinear(Point p) {
		
	    double slopex = (double)(p1.getY() - p.getY()) / (p1.getX() - p.getX());
	    double slopey = (double)(p2.getY() - p.getY()) / (p2.getX() - p.getX());
	    return slopex == slopey;
	}

}
