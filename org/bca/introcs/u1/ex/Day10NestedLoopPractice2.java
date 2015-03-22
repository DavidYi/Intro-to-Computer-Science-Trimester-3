package org.bca.introcs.u1.ex;

import java.util.Scanner;

public class Day10NestedLoopPractice2 {

	public static void main(String[] args) {
		// Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of lines: ");
		int line = input.nextInt();
		
		for (int i = 1; i <= line; i++){
			for (int x = 1; x <= line - i; x++){
				System.out.printf("   ");
			}
			
			for (int j = i; j >= 1; j--){
				System.out.printf("%3d", j);
			}
			
			for (int r = 2; r <= i; r++){
				System.out.printf("%3d", r);
			}
			
			System.out.println();
		}
		

	}

}
