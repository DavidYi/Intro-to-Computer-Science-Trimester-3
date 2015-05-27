package org.bca.introcs.u3.inheiritance;

public class ShapeTest {

	public static void main(String[] args) {
		Point p1 = new Point(10, 5);
		Point p2 = new Point(7, 14);
		Point p3 = new Point(-5, 12);
		
		Circle c = new Circle("C1", p1, 14);
		Rectangle r = new Rectangle("R1", p2, p3);
		
		System.out.println(c);
		System.out.println(r);
		
		Shape[] shapes = {c, r};
		
		for (int i = 0; i <shapes.length;i++){
			System.out.println(i + " " + shapes[i].getArea());
			shapes[i].move(5, 3);
		}
		System.out.println(c);
		System.out.println(r);
	}

}
