package org.bca.introcs.u3.inheiritance;

public class Rectangle extends Shape {
	private Point p1, p2;

	public Rectangle(String name, Point p1, Point p2) {
		super(name);
		this.p1 = p1;
		this.p2 = p2;
	}

	@Override
	public double getArea() {
		return Math.abs((p1.getX() - p2.getX())
				* (p1.getY() - p2.getY()));
	}

	@Override
	public void move(double dx, double dy) {
		p1.move(dx, dy);
		p2.move(dx, dy);
	}

	public String toString() {
		return name + "; p1 = " + p1 + "p2 " + p2;
	}

}
