package org.bca.introcs.u2;

import java.util.Random;
import java.util.Scanner;

public class Day4SortingAndSearching {

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

	public static void selectionSort(int[] a) {
		System.out.println("\n\n\n\nSelection Sort");
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

	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a.length - 1 == i) {
				System.out.println(a[i]);
			} else {
				System.out.print(a[i] + ", ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] nums = getRandomArray(10);

		System.out
				.println("Would you like to see the 1)Selection Sorting Process or 2)Insertion Sorting Process?");
		int decision = input.nextInt();

		printArray(nums);

		if (decision == 1) {
			selectionSort(nums);
		} else if (decision == 2) {
			insertionSort(nums);
		}

	}

}
