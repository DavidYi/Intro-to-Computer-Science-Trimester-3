package org.bca.introcs.u2.ex;

import java.util.Scanner;

public class Day2TextbookAssignmentCh6Exercise3 {

	public static void main(String[] args) {
		//Write a program that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.
		Scanner input = new Scanner(System.in);
		int[] integers = new int[100];
		int current = 1;
		
		System.out.println("Enter the integers between 1 and 100: ");
		
		while (current != 0){
			current = input.nextInt();
			if (current != 0){
				integers[current]++;
			}
		}
		
		for (int i = 0; i < 100; i++){
			if (integers[i] != 0){
				if (integers[i] == 1){
					System.out.println(i + " occurs " + 1 + " time.");
				}
				else{
					System.out.println(i + " occurs " + integers[i] + " times.");
				}
			}
		}
		
		

	}

}
