package org.bca.introcs.u1;

public class Day9Multiplication {

	public static void main(String[] args) {

		System.out.print("      ");
		for (int x = 1; x <= 9; x++){
			System.out.printf("%5d", x);
		}
		System.out.println();
		System.out.println("      _____________________________________________");
		for (int i = 1; i <= 9; i++){
			
			System.out.printf("%5d|", i);
			for (int j = 1; j <= 9; j++){
				System.out.printf("%5d", (i * j));
			}
			
			System.out.println();
			//prints a new line after it has finished the multiplication of one number.
		
		}

	}

}
