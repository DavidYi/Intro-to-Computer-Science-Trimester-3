package org.bca.introcs.u1;

import javax.swing.JOptionPane;

import java.util.Random;

public class Lab2RockPaperScissorsGUI {

	public static void main(String[] args) {
		Random rand = new Random();
		final String[] options = {"Rock", "Paper", "Scissors"};
		
		String message;
		int choice = JOptionPane.YES_OPTION;
		int win = 0, lose = 0;
		
		JOptionPane.showMessageDialog(null, "Let's play rock, paper, scissors!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
		//This is the format for message dialogue where there is an ok button. the 2nd is the main message, the 3rd is the title of the gui
		
		
		while((choice == JOptionPane.YES_OPTION) && (win != 5) && (lose != 5)){
			
			String player = (String) JOptionPane.showInputDialog(null, "Which option will you choose?", "Tiem to choose",
					JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			//input message and stores the reference in a variable
			//converts the object to a string
			
			int compChoice = rand.nextInt(2);
			String comp = options[compChoice];
			//gets the choice and converts it to the string version of option
			
			if (comp.equals(player)){
				message = "Tie!\n You both chose " + player;
			}
			else if ((comp.equals(options[0]) && player.equals(options[2])) || (comp.equals(options[1]) && player.equals(options[0])) || (comp.equals(options[2]) && player.equals(options[1]))){
				lose++;
				message = "The computer won!\n You chose " + player + ", the computer chose " + comp;
			}
			else{
				win++;
				message = "You won!\nYou chose " + player + ", the computer chose " + comp + "!";
			}
			
			JOptionPane.showMessageDialog(null, message + "\n Current score: You: " + win + "; Computer: " + lose, "Outcome", JOptionPane.INFORMATION_MESSAGE);
			if(win != 5 && lose  != 5)
				choice = JOptionPane.showConfirmDialog(null, "Would you like to continue playing?");
			
		}
		
		JOptionPane.showMessageDialog(null, "It has been fun. Here is the final score.\nYou: " + win + "; Computer: " + lose);
	}

}
