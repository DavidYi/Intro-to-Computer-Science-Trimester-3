package org.bca.introcs.u1;

import java.util.Random;
import java.util.Scanner;

public class Lab2RockPaperScissorsConsole {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int wins = 0, lose = 0;
		String choicename, compname, play = "y";
		
		
		System.out.println("Let's play Rock, Paper, Scissors!");
		
		while ((play.equals("y")) && (wins != 5) && (lose != 5)){	
			System.out.println("Enter your turn: (r)ock, (p)aper, (s)cissors.");
			String turn = input.next();
			//gets the input
			
			while (!turn.equals("r") && !turn.equals("p") && !turn.equals("s")){
				System.out.println(turn + " is not a valid input. Please re-enter your turn: (r)ock, (p)aper, (s)cissors");
				turn = input.next();
			}
			int comp = rand.nextInt(3);
			//0 is rock, 1 is paper, 2 is scissors
			
			if (turn.equals("r")){
				choicename = "rock";
			}
			else if (turn.equals("p")){
				choicename = "paper";
			}
			else{
				choicename = "scissors";
			}
			
			if ((comp == 0 && turn.equals("s")) || (comp == 1 && turn.equals("r")) || (comp == 2 && turn.equals("p"))){
				if (turn.equals("r")) {
					compname = "paper";	
				}
				else if (turn.equals("p")) {
					compname = "scissors";
				}
				else{
					compname = "rock";
				}
				
				++lose;
				System.out.println("The computer won!\nYou chose " + choicename + ", the computer chose " + compname + "!");
			
			}
			else if ((comp == 0 && turn.equals("r")) || (comp == 1 && turn.equals("p")) || (comp == 2 && turn.equals("s"))){			
				if (turn.equals("r")) {
					compname = "rock";	
				}
				else if (turn.equals("p")) {
					compname = "paper";
				}
				else{
					compname = "scissors";
				}
				
				System.out.println("Tie! You both chose " + choicename);
				
			
			}
			else if ((comp == 0 && turn.equals("p")) || (comp == 1 && turn.equals("s")) || (comp == 2 && turn.equals("r"))){
				if (turn == "r") {
					compname = "scissors";	
				}
				else if (turn.equals("p")) {
					compname = "rock";
				}
				else{
					compname = "paper";
				}
				
				wins++;
				System.out.println("You won!\nYou chose " + choicename + ", the computer chose " + compname + "!");
			}
						
			System.out.println("Current score is: You: " + wins + "; Computer: " + lose);
			if (wins != 5 && lose != 5){
				System.out.println("Would you like to continue playing? (y/n)");
				play = input.next();
			}
			else{
				if (wins == 5){
					System.out.println("You won! It has been fun, play again next time.");
				}
				else{
					System.out.println("You lost! It has been fun, play again next time.");
				}
			}
			//input if he wants to continue playing
			
			if(play.equals("n")) {
				System.out.println("It has been fun. Here is the final score.\nYou: " + wins + "; Computer: " + lose);
			}
			while (!play.equals("y") && !play.equals("n")){
				System.out.println(play + " is not a valid choice. Please choose (y)es or (n)o.");
				play = input.next();
			}
			
			
		}		
		

	}

}
