package org.bca.introcs.u1.ex;

import java.util.Scanner;

public class Day7ForLoopPractice3 {

	public static void main(String[] args) {
		/*write a program that prompts the user to enter the number of students and each student's name and score, and finally displays the student
		with the highest score and the student with the second-highest score.
		*/
		
		int first = -10000, second = -10000;
		String firstn = "--", secondn = "--";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please input the number of students");
		int num =  input.nextInt();
		
		for (int i = 0; i < num; i++){
			System.out.println("\n\nPlease input the student's name.");
			input.nextLine();
			String tempn = input.nextLine(); 
			
			System.out.println("Please input the score of " + tempn + ".");
			int temp = input.nextInt();
			
			if (temp > second){
				if (temp > first){
					first = temp;
					firstn = tempn;
				}
				else{
					second = temp;
					secondn = tempn;
				}
			}
		}
		
		System.out.println("\n\nHighest score is " + firstn + " with the score of " + first + ".");
		System.out.println("Second highest score is " + secondn + " with the score of " + second + ".");
		

	}

}
