package org.bca.introcs.u1;

public class Day6AcsiiTable {

	public static void main(String[] args) {		
		
		for (int i = 32; i < 127; i++){
			char c = (char)i ;
			System.out.printf("%4d: %c\n", i, c);
		}
		

	}

}
