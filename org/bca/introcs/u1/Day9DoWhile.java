package org.bca.introcs.u1;

import java.util.Random;
import java.util.Scanner;

public class Day9DoWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		String s;
		//this declares what they will enter in the do while loop.
		do{
			System.out.println(rand.nextInt(10));
			System.out.println("Do you want another?");
			s = input.next();
		} while(s.equals("y"));
		//this is what will keep the loop running

	}

}
