package org.bca.introcs.u3.ex;

import java.util.Scanner;

public class QuadraticTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c;

		System.out.print("Enter a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		Quadratic q = new Quadratic(a, b, c);

		if (q.getRoot1() == 0 & q.getRoot2() == 0) {
			System.out.println("The equation has no real roots.");
		} else if (q.getRoot1() == q.getRoot2()) {
			System.out.println("The root is " + q.getRoot1());
		} else {
			System.out.println("The root is " + q.getRoot1() + " and "
					+ q.getRoot2());
		}

	}

}
