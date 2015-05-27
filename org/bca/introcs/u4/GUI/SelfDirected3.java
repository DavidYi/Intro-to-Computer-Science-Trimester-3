package org.bca.introcs.u4.GUI;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SelfDirected3 extends JFrame{
	public SelfDirected3(){
		//Set GridLayout, 3 rows, 2 columns, and gaps 5 between
		//components horizontally and vertically
		setLayout(new GridLayout(3, 2, 5, 5));
		
		//Add labels and text fields to the frame
		add(new JLabel("First Name"));
		add(new JTextField(8));
		
		add(new JLabel("MI"));
		add(new JTextField(1));
		
		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}
	
	public static void main(String[] args) {
		SelfDirected3 frame = new SelfDirected3();
		frame.setTitle("ShowGridLayout");
		frame.setSize(200, 125);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
