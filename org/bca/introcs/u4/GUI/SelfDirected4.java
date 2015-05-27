package org.bca.introcs.u4.GUI;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SelfDirected4 extends JFrame{
	public SelfDirected4(){
		//Set BorderLayout with horizontal gap 5 and vertical gap 10
		setLayout(new BorderLayout(5, 10));
		
		//Add buttons to the frame
		add(new JButton("East"), BorderLayout.EAST);
		add(new JButton("South"), BorderLayout.SOUTH);
		add(new JButton("West"), BorderLayout.WEST);
		add(new JButton("North"), BorderLayout.NORTH);
		add(new JButton("Center"), BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		SelfDirected4 frame = new SelfDirected4();
		frame.setTitle("ShowBorderLayout");
		frame.setSize(300, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
