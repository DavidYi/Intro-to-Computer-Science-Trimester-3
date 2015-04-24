package org.bca.introcs.u3;

public class Rectangle {
	private Point p1, p2;
	private double width, height; // global variable

	public Rectangle(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		updateWidthAndHeight();

	}

	public Rectangle(double x1, double y1, double x2, double y2) {
		// called overloading - same class name, but different parameters
		p1 = new Point(x1, y1);
		p2 = new Point(x2, y2);
		updateWidthAndHeight();

	}

	private void updateWidthAndHeight() {
		width = Math.abs(p1.x - p2.x);
		height = Math.abs(p1.y - p2.y);
		//changes the global variable

	}

	public double getArea() {
		return width * height;
	}
	
	public void setPoint2(double x, double y){
		p2.x = x;
		p2.y = y;
		updateWidthAndHeight();
	
	}
	
	public String toString(){
		return "Rectangle: " + p1+ "; " + p2 + "; Area = " + getArea();
	}

}
