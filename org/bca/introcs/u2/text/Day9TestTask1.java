package org.bca.introcs.u2.text;

public class Day9TestTask1 {

	public static void printArray(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			System.out.print(nums[i] + " ");
		System.out.println();
	}
	
	public static int[] makeEnds(int[] nums){
		int[] array = new int[2];
		array[0] = nums[0];
		array[1] = nums[nums.length - 1];
		
		return array;
	
	}

	public static void main(String[] args) {
		/*
		 * Given an array of ints, return a new array length 2 containing the
		 * first and last elements from the original array. The original array
		 * will be length 1 or more.
		 */
		printArray(makeEnds(new int[] { 1, 2, 3 }));
		printArray(makeEnds(new int[] { 1, 2, 3, 4 }));
		printArray(makeEnds(new int[] { 7, 4, 8, 3, 1 }));

	}

}
