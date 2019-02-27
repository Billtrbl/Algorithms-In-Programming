package HomeworkWeek5;

import HomeworkWeek5.exercise21.rectangle;

public class exercise22 {
	
	public class rectangle {

		private int width;
		private int height;
		public int x;
		public int y;


		public rectangle(int left, int top, int width2, int height2) {
			// TODO Auto-generated constructor stub
		}


		public rectangle intersection(rectangle rect) {
			int left = Math.min(this.x, rect.x);
			int top = Math.min(this.y, rect.y);
			int right = Math.max(this.x + this.width, rect.x + rect.width);
			int bottom = Math.max(this.y + this.height, rect.y + rect.height);
			int width = Math.max(0, right - left);
			int height = Math.max(0, bottom - top);
			
			return new rectangle(left, top, width, height);

		}
	}

}
