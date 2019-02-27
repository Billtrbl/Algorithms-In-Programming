package HomeworkWeek5;

public class exercise18 {

	public class rectangle{
		
		private int x;
		private int y;
		private int width;
		private int height;
		
		public rectangle(int x, int y, int width, int height) {
			if (width > 0 && height > 0) {
				this.width = width;
				this.height = height;
			}
			else
			{
				throw new IllegalArgumentException();
			}
			this.x = x;
			this.y = y;
		}
		
		public int getHeight() {
			return height;
		}
		
		public int getWidth() {
			return width;
		}
		
		public int getX() {
			return x;
		}
		
		public int getY() {
			return y;
		}
		
		public String toString() {
			return "rectangle[x = " + x + ", y = " + y + ", width = " + width + ", height = " + height + "]";
		}
	}
}
