package org.bca.introcs.u3;

public class Point {
	public double x, y;

	public Point(double x, double y) {
		// typically no main in object classes, the class name is the replacer
		// for main
		this.x = x;
		this.y = y;
		// like self in python, but in java
		// only use this because there is already something called x, so using
		// this it shows that it is from this class

	}

	public String toString() {
		// no static because we are using objects
		return "(" + x + "," + y + ")";

	}

}
