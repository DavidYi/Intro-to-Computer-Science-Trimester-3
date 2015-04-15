package org.bca.introcs.u2.ex;

public class Day5TextbookAssignmentCh6Exercise7 {

	public static void main(String[] args) {
		/*
		 * Write a program that generates 100 random integers between 0 and 9
		 * and displays the count for each number. (hint: use
		 * (int)(Math.Random() * 10) to generate a random integer between 0 and
		 * 9. Use an array of ten integers say counts, to store the counts for
		 * the number of 0s, 1s, ..., 9s)
		 */

		int[] nums = new int[100];
		int[] counts = new int[10];

		for (int i = 0; i < 100; i++) {
			nums[i] = (int) (Math.random() * 10);
		}

		for (int i = 0; i < 100; i++) {
			counts[nums[i]]++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("The number of " + (i + 1) + "s is " + counts[i] + ".");
		}

	}

}
