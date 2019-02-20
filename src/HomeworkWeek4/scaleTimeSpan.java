package HomeworkWeek4;

public class scaleTimeSpan {
	
	class timeSpan{
		private int hours;
		private int minutes;
		
		public timeSpan(int hours, int minutes) {
			add(hours,minutes);
		}
		
		public String toString() {
			return hours + "h " + minutes + " m";
		}
		
		public void add(int hours, int minutes) {
			this.hours += hours;
			this.minutes += minutes;
			this.hours += this.minutes / 60;
			this.minutes = this.minutes % 60;
		}
		
		public void scale(int factor) {
			int temHour = (minutes*factor)/60;
			int temMin = (minutes*factor)%60;
			this.hours = hours*factor + temHour;
			this.minutes = temMin;
		}
	}
}
