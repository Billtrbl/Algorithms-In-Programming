package HomeworkWeek5;

import java.awt.Rectangle;

public class exercise21 {

	public class rectangle {

		private int width;
		private int height;
		public int x;
		public int y;

		public rectangle(int left, int top, int i2, int j2) {
			// TODO Auto-generated constructor stub
		}

		public rectangle Union(rectangle rect) {
			int left = Math.min(this.x, rect.x);
			int top = Math.min(this.y, rect.y);
			int right = Math.max(this.x + this.width, rect.x + rect.width);
			int bottom = Math.max(this.y + this.height, rect.y + rect.height);

			return new rectangle(left, top, right - left, bottom - top);

		}
	}
}