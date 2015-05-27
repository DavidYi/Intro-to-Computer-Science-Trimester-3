package org.bca.introcs.u3.inheiritance;

public class Circle extends Shape {
	private Point c;
	private double r;

	public Circle(String name, Point c, double r) {
		super(name);
		this.c = c;
		this.r = r;
	}

	@Override
	public double getArea() {
		return Math.PI * r * r;
	}

	@Override
	public void move(double dx, double dy) {
		c.move(dx, dy);

	}
	
	public String toString(){
		return name + "; Centered at: " + c + "; Radius=" + r;
	}

}
