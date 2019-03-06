package HomeworkWeek4;

import java.awt.Point;

public class homework20 {
	
	private double x;
	private double y;
	private int width;
	private int height;
	
	public boolean contains(double d, double e) {
	    return this.x <= d && d <= this.x + width && this.y <= e &&
	        e <= this.y + height;
	}

	public boolean contains(Point p) {
	    return contains(p.getX(), p.getY());
	}

}
