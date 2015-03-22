package org.bca.introcs.u1;

import java.util.Random;
import java.util.Scanner;

public class Day11PracticeTestTask2 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		boolean play = true;
		int correct = 0;
		
		while(play == true){
			int a = rand.nextInt(100);
			int b = rand.nextInt(100);
			
			System.out.println("Please enter the sum of " + a + " + " + b + ".");
			int c = input.nextInt();
			
			if (c == a + b){
				System.out.println("The answer is correct.");
				correct++;
			}
			else{
				System.out.println("The answer is incorrect. You got " + correct + " correct answers in a row.");
				play = false;
			}
	
		}
	}

}
