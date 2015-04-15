package org.bca.introcs.u2.ex;

import java.util.Scanner;

public class Day4TextbookAssignmentCh6Exercise5 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads 10 numbers and displays a distinct numbers
		 * (i.e. if a number appears multiple times, it is displayed only once)
		 * Hint: Read a number and store it to an array if it is new. If the
		 * number is already in the array, ignore it. After the input, the array
		 * contains the distinct numbers
		 */
		Scanner input = new Scanner(System.in);
		int[] distinct1 = new int[10];
		
		int count = 0;
		
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++) {
			int number = input.nextInt();
			boolean track = true;
			
			for (int j = 0; j <= i; j++) {
				if (number == distinct1[j]) {
					track = false;
					break;
				}
			}
			if (track == true){
				distinct1[count] = number;
				count++;
			}
			
		}
		
		int[] distinct2 = new int[count];
		
		for (int i = 0; i < distinct2.length; i++){
			distinct2[i] = distinct1[i];
		}
		
		for (int i = 0; i < distinct2.length; i++) {
			System.out.print(distinct2[i] + " ");
		}

	}

}
