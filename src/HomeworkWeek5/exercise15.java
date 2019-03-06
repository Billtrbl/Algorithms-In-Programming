package HomeworkWeek5;

import java.awt.Point;

public class exercise15 {

	public class Line {
		private Point p1;
		private Point p2;

		public Line(Point p1, Point p2) {
			this.p1 = p1;
			this.p2 = p2;
		}

		public double getSlope() {
			double x1 = p1.getX(); // get value of x1
			double x2 = p2.getX(); // get value of x2
			double y1 = p1.getY(); // get value of y1
			double y2 = p2.getY(); // get value of y2
			if (x1 == x2) {
				throw new IllegalStateException();
			} else if (y1 == y2) { // if the denominator is 0 then it is undefined
				return 0;
			} else {
				return (y2 - y1) / (x2 - x1);
			}
		}
	}
}