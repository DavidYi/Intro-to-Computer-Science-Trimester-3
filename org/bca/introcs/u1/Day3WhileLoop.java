package org.bca.introcs.u1;

import java.util.Random;

public class Day3WhileLoop {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int i = rand.nextInt(10);
		
		
		while (i != 9) {
			//syntax for while if/else if/ else statement
			if  (i < 5)
				System.out.println("Less than 5!");
			else if (i == 5)
				System.out.println("Equals 5");
			else
				System.out.println("Greater than 5");
			//don't need curly bracket if it is one line
			
			i = rand.nextInt(10);
		}
		
		System.out.println("Done!");
		
	}

}
