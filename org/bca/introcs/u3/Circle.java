package org.bca.introcs.u3;

public class Circle {
	//final means that you can't touch it
	public static final double PI = 3.1415927;
	public static int circleCount = 0;
	public final double radius; // instance variable //is like private but it is visible

	public Circle(double r) {
		radius = r;
	}

	public double getArea() {
		return PI * radius * radius;
	}

	public static double getArea(double r1) {
		//we can call this at anytime, no need to put Circle var = new Circle(Radius);
		//we can do Circle.getArea(radius);
		//cuz of static
		return PI * r1 * r1;
	}

}
