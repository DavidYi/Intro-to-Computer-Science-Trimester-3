package org.bca.introcs.u2.ex;

import java.util.Scanner;

public class Day2TextbookAssignmentCh6Exercise2 {

	public static void main(String[] args) {
		//Write a program that reads ten integers and displays them in reverse of the order in which they were read
		Scanner input = new Scanner(System.in);
		int[] integers = new int[10];
		
		System.out.println("Input ten integers:");
		for (int i = 0; i <= 9; i++){
			integers[i] = input.nextInt();
		}
		
		for (int i = 9; i >= 0; i--){
			System.out.printf(integers[i] + " ");
		}

	}

}
