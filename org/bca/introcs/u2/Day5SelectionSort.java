package org.bca.introcs.u2;

import java.util.Random;

public class Day5SelectionSort {
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
		for (int i = 0; i < a.length; i++) {
			if (a.length - 1 == i) {
				System.out.println(a[i]);
			} else {
				System.out.print(a[i] + ", ");
			}
		}
	}

	public static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int smallest = i; // smallest numbers position... Assume that i is
								// the smallest position

			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[smallest]) {
					smallest = j;
				}
			}
			// swap the position
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;

			// selectionsort process
			System.out.print("\ni=" + i + " : ");
			printArray(a);
		}

		printArray(a);
	}

	public static void main(String[] args) {
		int[] nums = getRandomArray(10);

		printArray(nums);

		selectionSort(nums);

	}

}
