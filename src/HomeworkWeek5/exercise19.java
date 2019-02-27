package HomeworkWeek5;

import java.awt.Point;

public class exercise19 {
		
public class rectangle{
		
		private int x;
		private int y;
		private int width;
		private int height;
	
		public rectangle(double x, double y, int width, int height) {
			// TODO Auto-generated constructor stub
		}
	public rectangle(Point p, int width, int height) {
		this(p.getX(), p.getY(), width, height);
	}


}
}