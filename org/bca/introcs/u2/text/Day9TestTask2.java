package org.bca.introcs.u2.text;

public class Day9TestTask2 {

	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();

	}

	public static void rotateRight(int[] nums) {
		for (int i = nums.length - 2; i >= 0; i--) {
			nums[i + 1] = nums[i];
		}
		
		nums[0] = 0;

	}

	public static void main(String[] args) {
		/*
		 * Given an array of ints, move every int one position right in the
		 * array. Fill the left most position in the array with “0”. (The number
		 * on the right side of the array is lost during this operation.)
		 */

		int[] test1 = { 1, 2, 3 };
		int[] test2 = { 1, 2, 3, 4 };
		rotateRight(test1);
		rotateRight(test2);
		printArray(test1);
		printArray(test2);

	}

}
