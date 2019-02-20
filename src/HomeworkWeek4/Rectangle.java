package HomeworkWeek4;

import java.awt.Point;

import java.io.*;

class Rectangle {

	private int x;
	private int y;
	private int width;
	private int height;

	public Rectangle(int x, int y, int width, int height) {

		if (width < 0 || height < 0) {

			throw new IllegalArgumentException();

		}

		this.x = x;

		this.y = y;

		this.width = width;

		this.height = height;

	}

	public Rectangle(Point p, int width, int height) {

		this.contains(width, height);

	}

	public boolean contains(int x, int y) {

		return this.x <= x && x < this.x + this.width &&

				this.y <= y && y < this.y + this.height;

	}

	public boolean contains(Point p) {

		return this.contains(p);

	}

	public boolean equals(Object o) {

		Rectangle other = (Rectangle) o;

		return other.x == this.x && other.y == this.y &&

				other.width == this.width && other.height == this.height;

	}

	public int getHeight() {

		return this.height;

	}

	public int getWidth() {

		return this.width;

	}

	public int getX() {

		return this.x;

	}

	public int getY() {

		return this.y;

	}

	public Rectangle intersection(Rectangle rect) {

		int left = Math.max(this.x, rect.x);

		int top = Math.max(this.y, rect.y);

		int right = Math.min(this.x + this.width, rect.x + rect.width);

		int bottom = Math.min(this.y + this.height, rect.y + rect.height);

		int width = Math.max(0, right - left);

		int height = Math.max(0, bottom - top);

		return new Rectangle(left, top, width, height);

	}

	public String toString() {

		return "Rectangle[x=" + this.x + ",y=" + this.y +

				",width=" + this.width + ",height=" + this.height + "]";

	}

	public Rectangle union(Rectangle rect) {

		int left = Math.min(this.x, rect.x);

		int top = Math.min(this.y, rect.y);

		int right = Math.max(this.x + this.width, rect.x + rect.width);

		int bottom = Math.max(this.y + this.height, rect.y + rect.height);

		return new Rectangle(left, top, right - left, bottom - top);

	}

}