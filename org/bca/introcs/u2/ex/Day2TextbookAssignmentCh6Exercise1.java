package org.bca.introcs.u2.ex;

import java.util.Scanner;

public class Day2TextbookAssignmentCh6Exercise1 {

	public static void main(String[] args) {
		/*Write a program that reads student scores, get the best score, and then assigns grades based on tHE following scheme:
		 * Grade is A if score is >= best - 10;
		 * Grade is B if score is >= best - 20;
		 * ...
		 * Grade is F otherwise
		 * The program prompts the user to enter the total number of students, then prompts the user to enter all of te scores, and concludes
		 * by displaying the grades. 
		 */
		Scanner input = new Scanner(System.in);
		int best = 0;
		char grade = 'F';
		
		
		System.out.println("Enter the number of students: ");
		int stud = input.nextInt();
		int[] score = new int[stud];
		
		System.out.println("Enter " + stud + " scores:");
		
		for (int i = 0; i < stud; i++){
			score[i] =  input.nextInt();
		}
		
		for (int i = 0; i < stud; i ++){
			if(score[i] > best){
				best = score[i];
			}
		}
			
		
		for (int i = 0; i < stud; i++){
			if (score[i] >= (best - 10)){
				grade = 'A';
			}
			
			else if (score[i] >= (best - 20)){
				grade = 'B';
			}
			
			else if (score[i] >= (best - 30)){
				grade = 'C';
			} 
			
			else if (score[i] >= (best - 10)){
				grade = 'D';
			}
			
			else{
				grade = 'F';
			}
			

			System.out.println("Student " + i + "'s score is " + score[i] + " and grade is " + grade);
		}
	
	}

}
