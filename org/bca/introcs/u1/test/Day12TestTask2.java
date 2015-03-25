package org.bca.introcs.u1.test;

import java.util.Scanner;

public class Day12TestTask2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number.");
		int num = input.nextInt();
		
		System.out.printf("Factors: ");
		
		for (int i = 1; i <= num; i++){
			if (num % i == 0){
				System.out.printf(i + " ");
			}
		}

	}

}
