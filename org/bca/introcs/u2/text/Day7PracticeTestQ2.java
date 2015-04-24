package org.bca.introcs.u2.text;

public class Day7PracticeTestQ2 {

	public static int indexOfSmallestElement(int[] nums){
		int smallest = 0;
		for (int i = 0; i < nums.length; i++){
			if (nums[i] < nums[smallest]){
				smallest = i;
			}
		}
		return smallest;
	
	}
	
	public static void main(String[] args) {
		/*
		 * Write a method that returns the index of the smallest element in an
		 * array of integers. If there are more than one such element, return the
		 * smallest index
		 * Test these inputs in indexOfSmallestElement
		 * new int[] {7, 12, 5, 9, 17, 5, 12} --> returns 2
		 * new int[] {12, 14, 3, 7, 1} --> returns 4
		 */
		System.out.println(indexOfSmallestElement(new int[] {7, 12, 5, 9, 17, 5, 12}) );
		System.out.println(indexOfSmallestElement(new int[] {12, 14, 3, 7, 1}) );

	}

}
