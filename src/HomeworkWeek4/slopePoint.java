package HomeworkWeek4;

public class slopePoint {
	
	public class Point{
		private int x;
		private int y;
		
		public double slopePoint(Point p) {
			if (this.x == p.x) {
				throw new IllegalArgumentException();
			}
			else {
				double dx = (double)(this.x - p.x);
				double dy = (double)(this.y - p.y);
				return dy / dx;
			}
		}
	}

}
