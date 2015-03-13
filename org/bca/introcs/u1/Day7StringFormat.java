package org.bca.introcs.u1;

public class Day7StringFormat {

	public static void main(String[] args) {
		double a = 19.34512;
		double b = 4.9981;
		
		String s = String.format("%4.2f %5.1f", a, b);
		//this formats and makes a string from the parameter and is the same thing as the system.out.printf, but this doesn't print itz
		
		System.out.println(s);

	}

}
