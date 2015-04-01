package org.bca.introcs.u2.ex;

public class Day1TextbookAssignmentCh5Exercise1 {

	public static void main(String[] args) {
		/*A pentagonal number is defined as n(3n-1)/2 for n = 1,2,3, and so on. SO, the first few umbers are 1, 5, 12, 22, ... Write the 
		 * following metod that returns a pentagonalnumber:
		 * public static int getPEntagonalNumber (int n)
		 * write a test program that displays the first 100 pentagonal numbers with 10 numbers on each line
		 */
		int count = 0;
		
		for (int i = 1; i <=100; i++){	
			System.out.printf("%6d", getPentagonalNumber(i));
			count++;
			
			if (count == 10){
				System.out.println();
				count = 0;
			}
		}

	}

	public static int getPentagonalNumber (int n){
		return (n * (3*n - 1)) / 2;
	
	}
	

}
