package org.bca.introcs.u4.GUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SelfDirected1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("MyFrameWithComponents");//makes the frame, which is the container
		
		//Adds a button into the frame
		JButton jbtOK = new JButton("OK");
		frame.add(jbtOK);//adds an instance of Component to the container
		
		frame.setSize(400,300); //sets the size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when you click on the x it makes it so the program exits
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setVisible(true); //Makes the frame visible

	}
}
