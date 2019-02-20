package HomeworkWeek4;

import java.io.*;
import java.util.Scanner;

class timeSpan {
	private int hours;
	private int minutes;
	
	public timeSpan(int hours, int minutes) {
		this.hours = 0;
		this.minutes = 0;
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
	
	public void add(timeSpan span) {
		this.hours += span.hours;
		this.minutes += span.minutes;
		this.hours += this.minutes / 60;
		this.minutes = this.minutes % 60;
	}
}