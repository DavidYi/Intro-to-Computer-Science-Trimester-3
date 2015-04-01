package org.bca.introcs.u2.ex;

import java.util.Scanner;

public class Day2AveragingNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter?");
		int nums = input.nextInt();
		
		int[] array = new int[nums];
		//creates an array with nums number of integer available.
		
		System.out.println("Enter the numbers:");
		int sum = 0;
		
		for (int i = 0; i < array.length; i++){
			//array.length gets the number of integer available, which is nums
			array[i] = input.nextInt();
			sum += array[i];
		}
		
		double average = (double)sum / array.length;
		
		int counter = 0;
		
		for (int i = 0; i < array.length; i++){
			if(array[i] > average){
				counter++;
			}
		}
		
		System.out.println("The average of your number is " + average + ".\nThe number above the average is " + counter + ".");

	}

}
