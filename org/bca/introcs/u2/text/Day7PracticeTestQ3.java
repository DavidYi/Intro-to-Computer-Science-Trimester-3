package org.bca.introcs.u2.text;

import java.util.Arrays;

public class Day7PracticeTestQ3 {

	public static void reverse(int[] nums){
		int temp;
		for (int i = 0; i < nums.length/2 + 1; i++){
			if (i == nums.length/2 || i == nums.length/2 + 1){
				break;
			}
			temp = nums[i];
			nums[i] = nums[nums.length - i - 1];
			nums[nums.length - i - 1] = temp;
		}
	
	}
	
	public static void main(String[] args) {
		/* Write a method that will reverse the order of the elements of array, in place
		 * test method:
		 * int[] a = new int[] {7, 12, 5, 9};
		 * int[] b = new int[] {18, 3, 6};
		 * 
		 * reverse(a);
		 * reverse(b);
		 * 
		 * then print it out
		 */
		
		int[] a = new int[] {7, 12, 5, 9};
		int[] b = new int[] {18, 3, 6};
		
		reverse(a);
		reverse(b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

	}

}
