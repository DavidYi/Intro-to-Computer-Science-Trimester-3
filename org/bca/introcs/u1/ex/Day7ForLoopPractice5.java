package org.bca.introcs.u1.ex;

public class Day7ForLoopPractice5 {

	public static void main(String[] args) {
		/* Write a program that prints the characters in ASCII table from ! to ~. Display ten characters per line. Characters are separated by
		 exactly  one space.*/
		int place = 0;
		
		for (int i = 33; i <= 126; i += 1){
			if (place == 10){
				place = 0;
				System.out.println();
			}
			System.out.printf( "%-2c", (char)i );
			//character count as a space so instead of 1, you need 2
			place += 1;
		}

	}

}
