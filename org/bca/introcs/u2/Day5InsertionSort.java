package org.bca.introcs.u2;

import java.util.Random;

public class Day5InsertionSort {
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

	public static void insertionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print("\ni=" + i + " : ");

			int num = a[i]; // the number that we are currently working on

			int j = i - 1; //
			while ((j >= 0) && (a[j] > num)) {
				a[j + 1] = a[j];
				j--;
				printArray(a);
			}
			a[j + 1] = num;

		}
	}

	public static void main(String[] args) {
		int[] nums = getRandomArray(10);

		printArray(nums);
		insertionSort(nums);

	}

}
