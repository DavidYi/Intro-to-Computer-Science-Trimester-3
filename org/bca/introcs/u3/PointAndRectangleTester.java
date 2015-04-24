package org.bca.introcs.u3;

public class PointAndRectangleTester {

	public static void main(String[] args) {
		Point a = new Point(5, 3);
		Point b = new Point(10, 7);
		// this calls the point class

		System.out.println(a);
		System.out.println(b);

		Rectangle r = new Rectangle(a, b);
		System.out.println(r);

		// r.p2.x = 12;
		// the rectangle is an object and has all the properties in 'this' are
		// also in the r, but since it is private we cannot change it in another
		// class

		r.setPoint2(12, 7);
		//in order to access and change them, you have to call the class
		System.out.println(r);

	}
}
