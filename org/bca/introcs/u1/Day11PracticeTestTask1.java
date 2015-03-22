package org.bca.introcs.u1;

import java.util.Scanner;

public class Day11PracticeTestTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the lengths of the three side of a triangle.");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		if (a >= b && a >= c){
			if (a < b + c){
				System.out.println("Valid"); 
			}
			else{
				System.out.println("Invalid");
			}
		}
		else if (b >= a && b >= c){
			if (b < a + c){
				System.out.println("Valid");
			}
			else{
				System.out.println("Invalid");
			}
		}
		else{
			if (c < a + b){
				System.out.println("Valid");
			}
			else{
				System.out.println("Invalid");
			}
		}

	}

}
