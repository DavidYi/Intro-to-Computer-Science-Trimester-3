package org.bca.introcs.u2.ex;

import java.util.Scanner;

public class Day13TextbookAssignmentCh5Exercise12 {

	public static void main(String[] args) {
		/*Write a method that prints characters using the following header:
		 * public static void printChars(char ch1, char ch2, int numberPerLine)
		 * this method prints the characters between ch1 and ch2 with the specific numbers per line.
		 * Write a test program that prints ten characters per line from '1' to 'Z'.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the two characters in separate lines:");
		char ch1 = input.next().charAt(0);
		char ch2 = input.next().charAt(0);
		
		System.out.println("Please input the number of character per line:");
		int num = input.nextInt();
		
		printChars(ch1, ch2, num);

	}
	

	public static void printChars(char ch1, char ch2, int numberPerLine){		
		int count = 0;
		
		for (int i = (int)ch1; i <= (int)ch2; i++){
			System.out.printf( (char)i + " ");
			count++;
			
			if (count == numberPerLine){
				System.out.println();
				count = 0;
			}	
		}
	
	}

}
