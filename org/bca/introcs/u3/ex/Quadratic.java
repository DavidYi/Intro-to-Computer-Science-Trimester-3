package org.bca.introcs.u3.ex;

public class Quadratic {
	private double a, b, c;

	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getDiscriminant() {
		return Math.pow(b, 2) - (4 * a * c);
	}

	public double getRoot1() {
		double d = getDiscriminant();
		if (d >= 0) {
			return ((-1 * b) + Math.pow(d, 0.5)) / (2 * a);
		}
		return 0;
	}

	public double getRoot2() {
		double d = getDiscriminant();
		if (d >= 0) {
			return ((-1 * b) - Math.pow(d, 0.5)) / (2 * a);
		}
		return 0;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

}
