package org.bca.introcs.u1.test;

import java.util.Scanner;

public class Day12TestTask1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int count = 0, cur = 1;
		
		System.out.println("Enter the list of numbers.");
		int max = input.nextInt();
		while (cur != 0){
			cur = input.nextInt();
			
			if (max < cur){
				max = cur;
				count = 1;
			}
			else if(max == cur){
				count += 1;
			}
			
		}
		
		System.out.println("The largest number is " + max + ".\nIt occurs " + count + " times.");

	}

}
