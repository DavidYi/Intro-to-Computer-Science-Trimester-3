package org.bca.introcs.u2.ex;

import java.util.Scanner;

public class Day13TextbookAssignmentCh5Exercise4 {

	public static void main(String[] args) {
		/* Write the following method to display an integer in reverse order:
		 * public static void reverse(int number)
		 * for example reverse(3456) displays 6543. Write a test program that prompts the user to enter an integer and displays its reversal
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input a number: ");
		int num = input.nextInt();
		
		reverse(num);
	}
	
	public static void reverse (int number){
		int rev = 0, factor = 1, c = number, cur;
		for (int a = 10; c > 10; a += 10){
			factor *= 10;
			c /= 10;
		}
		
		c = number;
		
		while (c > 0){
			cur = c % 10;
			c /= 10;
			
			rev += cur * factor;
			
			factor /= 10;
		}

		System.out.println("The reversal of the number " + number + " is " + rev + ".");
	
	}

}
