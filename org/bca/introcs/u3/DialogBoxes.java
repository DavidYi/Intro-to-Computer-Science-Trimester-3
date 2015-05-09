package org.bca.introcs.u3;

import javax.swing.JOptionPane;

public class DialogBoxes {

	public static void main(String[] args) {
		String[] choices = { "Friend", "Foe" };

		String choice = (String) JOptionPane.showInputDialog(null,
				"Are you a friend or a foe?", "Input",
				JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
		
		String name = JOptionPane.showInputDialog(choice
				+ " - what is your name?");

		if (name != null)
			JOptionPane.showMessageDialog(null,  "Hello" + name);
		else
			JOptionPane.showMessageDialog(null, "You pressed cancel!");	

	}

}
