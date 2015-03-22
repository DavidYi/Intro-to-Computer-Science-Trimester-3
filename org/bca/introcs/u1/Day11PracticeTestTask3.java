package org.bca.introcs.u1;

import java.util.Scanner;

public class Day11PracticeTestTask3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input an interger that you would like to find the number factorial of.");
		int a = input.nextInt();
		int b = 1;
		
		for (int i = a; i >= 1; i--){
			b *= i;
		}
		
		System.out.println(a + "! is equal to " + b);

	}

}
