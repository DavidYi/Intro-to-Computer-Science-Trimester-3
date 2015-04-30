package org.bca.introcs.u3;

public class CircleTester {

	public static void main(String[] args) {
		System.out.println(Circle.circleCount);
		
		Circle c1 = new Circle(15);
		Circle c2 = new Circle(3);
		
		
		System.out.println(Circle.circleCount);
		
		System.out.println(c1.getArea());
		
		System.out.println(Circle.getArea(5));

	}

}
