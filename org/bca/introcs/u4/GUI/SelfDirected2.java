package org.bca.introcs.u4.GUI;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SelfDirected2 extends JFrame{
	public SelfDirected2(){
		//Set FlowLayout, aligned left with horizontal gap 10
		//and vertical gap 20 between components
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		//Add labels and text fields to the frame
		add(new JLabel("First Name"));
		add(new JTextField(8));//number of character able to enter
		
		add(new JLabel("MI"));
		add(new JTextField(1));
		
		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}
	
	public static void main(String[] args) {
		SelfDirected2 frame = new SelfDirected2();
		frame.setTitle("ShowFlowLayout");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);//center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
