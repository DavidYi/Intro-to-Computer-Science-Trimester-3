package org.bca.introcs.u1;

import java.util.Scanner;

public class Day1RegularPolygon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the name of the shape?");
		String name = input.nextLine();
		
		System.out.println("How many sides are there?");
		int sides = input.nextInt();
		
		System.out.println("How long is each side?");
		double length = input.nextDouble();
		
		double perimeter = sides * length;
		
		System.out.println("Your " + name + " has a perimeter of " + perimeter);

	}

}
