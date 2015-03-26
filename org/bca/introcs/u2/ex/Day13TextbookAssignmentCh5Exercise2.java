package org.bca.introcs.u2.ex;

import java.util.Scanner;

public class Day13TextbookAssignmentCh5Exercise2 {

	public static void main(String[] args) {
		/* Write a method that computes the sum of the digits in an integer. Use the following method header:
		 * public static int sumDigits(long n)
		 * for example, sumDIgits(234) returns 9 (2 + 3 + 4)
		 */
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Please input a number.");
		long num = input.nextInt();
		
		System.out.println("The sum of the digits of " + num + " is " + sumDigits(num) + ".");

	}
	
	public static int sumDigits (long n){
		long sum = 0, cur;
		
		while (n > 0){
			cur = n % 10;
			
			n /= 10;
			
			sum += cur;		
		}
		
		return (int)sum;
	}

}
