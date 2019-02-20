package HomeworkWeek4;

public class isCollinearPoint17 {
	
	public boolean isCollinear(Point p) {
		
	    double slopex = (double)(p1.getY() - p.getY()) / (p1.getX() - p.getX());
	    double slopey = (double)(p2.getY() - p.getY()) / (p2.getX() - p.getX());
	    return slopex == slopey;
	}

}
