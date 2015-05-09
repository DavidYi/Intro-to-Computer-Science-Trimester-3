package org.bca.introcs.u3;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class StateCapitalQuiz {

	public static void main(String[] args) throws FileNotFoundException {
		String[] quizNames = { "states_all.txt", "states_central.txt",
				"states_east.txt", "states_west.txt", "states_small_test.txt",
				"states_south.txt"};
		int correct = 0, guesses = 0;

		JOptionPane.showMessageDialog(null,
				"Welcome to the State Quiz Challenge!");

		String choice = (String) JOptionPane.showInputDialog(null,
				"Which quiz file would you like to use?", "Quiz",
				JOptionPane.QUESTION_MESSAGE, null, quizNames, quizNames[0]);
		
		StateCapitalList scl = new StateCapitalList(choice);
		
		String answer = "";
		
		
		while(scl.statesRemaining() != 0 || answer != null){
			StateCapital temp = scl.getRandomState();
			answer = JOptionPane.showInputDialog("What is the capital of " + temp.state);
			if (answer.toUpperCase().equals(temp.capital.toUpperCase())){
				scl.remove(temp);
				JOptionPane.showMessageDialog(null,
						"Correct!");
				correct++;
			}
			else{
				JOptionPane.showMessageDialog(null,
						"Incorrect. The capital is " + temp.capital);
			}
			guesses++;
		}
		

		JOptionPane.showMessageDialog(null,
				"You named " + correct + " correct capitals in " + guesses + " guesses.");

	}

}
