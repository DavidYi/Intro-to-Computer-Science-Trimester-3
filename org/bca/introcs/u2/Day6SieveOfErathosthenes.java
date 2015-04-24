package org.bca.introcs.u2;

public class Day6SieveOfErathosthenes {
	public static boolean[] createArray(int iSize) {
		/*
		 * Create and initializes the array of booleans returns an array of
		 * boolean of length iSize and initializes all elements in the array to
		 * be true
		 */

		boolean[] array = new boolean[iSize];

		for (int i = 0; i < array.length; i++) {
			array[i] = true;
		}

		return array;
	}

	public static void printPrimes(boolean[] primes, int numsPerLine) {
		/*
		 * prints a list of prime numbers, as identified by the arrays "primes".
		 * The method prints "numPerLine" primes per line in the output
		 * Parameters: primes - Array in which primes are indicated to by
		 * "true". numsPerLine - Number of primes to print per line
		 */
		int count = 0;

		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.printf("%5d", i + 1);
				count++;
			}
			if (count == numsPerLine) {
				count = 0;
				System.out.println();
			}
		}
	}

	public static void calculatePrimes(boolean[] primes) {
		/*
		 * Implements the Sieve of Eratosthenes algorithm to determine a list of
		 * primes. This method uses the length of the variable primes to
		 * determine its range of calculation. This method assumes the array has
		 * been initialized to all "trues". Parameters: primes - Array for
		 * returning the list of primes. Must already be initialized to all
		 * "true".
		 */
		primes[0] = false;
		
		for (int i = 2; i < primes.length; i++) {
			int num = i + 1;
			for (int j = 2; j <= num / 2; j++) {
				if (num % j == 0){
					primes[i] = false;
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		/*
		 * Implement a program that will calculate and print the prime numbers
		 * from 2 to n using the algorithm called the Sieve of Eratosthenes. Use
		 * the following code for your main function.
		 * 
		 * public static void main(String[] args) { boolean[] array =
		 * createArray(10000); calculatePrimes(array); printPrimes(array, 10); }
		 */
		boolean[] array = createArray(10000);
		calculatePrimes(array);
		printPrimes(array, 10);

	}
}
