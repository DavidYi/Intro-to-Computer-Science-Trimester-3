package org.bca.introcs.u1.ex;

public class Day7ForLoopPractice4 {

	public static void main(String[] args) {
		/* Write a program that displays all the numbers from 100 to 1,000, ten per line, that are divisible by 5 and 5. Numbers are separated by
		 exactly one space.
		 */
		int place = 0;
		for (int i = 100; i <= 1000; i += 5){
			if (place == 10){
				System.out.println();
				place = 0;
			}
			System.out.printf("%-4d", i);
			place += 1;
		}

	}

}
