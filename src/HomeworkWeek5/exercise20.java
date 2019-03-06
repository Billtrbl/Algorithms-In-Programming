package HomeworkWeek5;

import java.awt.Point;

public class exercise20 {

	private int x;
	private int y;
	private int width;
	private int height;

	public boolean contains(int x, int y) {
		return (x <= this.x + width && x >= this.x) && (y <= this.y + height && y >= this.y);
	}

	public boolean contains(Point p) {
		return (p.getX() <= this.x + width && p.getX() >= this.x)
				&& (p.getY() <= this.y + height && p.getY() >= this.y);
	}

}
