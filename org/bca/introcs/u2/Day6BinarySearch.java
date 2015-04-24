package org.bca.introcs.u2;

import java.util.Random;
import java.util.Scanner;

public class Day6BinarySearch {
	public static int[] getRandomArray(int size) {
		int[] array = new int[size];
		Random rand = new Random(14);
		// everyone with the same seed, which is 14 in this case, all get the
		// same random numbers

		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt(100);
		}

		return array;

	}

	public static void printArray(int[] a) {
		System.out.println("The array is ...");
		for (int i = 0; i < a.length; i++) {
			if (a.length - 1 == i) {
				System.out.println(a[i]);
			} else {
				System.out.print(a[i] + ", ");
			}
		}
	}

	public static int binarySearch(int[] a, int num) {
		int low = 0;
		int high = a.length - 1;

		while (high >= low) {
			int mid = (high + low)/ 2;
			if (a[mid] == num) {
				return mid;
			} else if (a[mid] < num) {
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = getRandomArray(10);
		
		printArray(nums);
		System.out.println("What number do you want to find the position of?");
		int a = input.nextInt();
		
		System.out.println(a + " is at " + binarySearch(nums , a));

	}

}
