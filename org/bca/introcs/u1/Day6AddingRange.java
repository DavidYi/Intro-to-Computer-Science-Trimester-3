package org.bca.introcs.u1;

import java.util.Scanner;

public class Day6AddingRange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers.");
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int sum = 0;
		
		for (int i = a; i <= b; i++){
			sum += 1;
		}
		
		System.out.println("The sum is " + sum + ".");

	}

}
