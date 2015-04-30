package org.bca.introcs.u3.ex;

import java.util.Scanner;

public class LinearSystemTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();

		LinearSystem x = new LinearSystem(a, b, c, d, e, f);

		if (x.isSolvable()) {
			System.out.println("x is " + x.getX() + " and y is " + x.getY());
		} else {
			System.out.println("The equation has no solution");
		}

	}

}
