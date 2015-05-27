package org.bca.introcs.u4.GUI;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SelfDirected5 extends JFrame{
	public SelfDirected5(){
		//Create panel p1 for the buttons and set GridLayout
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4,3));
		
		//Add buttons to the panel
		for (int i = 1; i<= 9; i++){
			p1.add(new JButton("" + i));
		}
		
		p1.add(new JButton("" + 0));
		p1.add(new JButton("Start"));
		p1.add(new JButton("Stop"));
		
		//Create panel p2 to hold a text field and p1
		JPanel p2 = new JPanel(new BorderLayout());
		p2.add(new JTextField("Time to be displayed here"), BorderLayout.CENTER);
		p2.add(p1, BorderLayout.CENTER);
		
		//add contents into the frame
		add(p2, BorderLayout.EAST);
		add(new JButton("Food to be placed here"));
	}
	
	public static void main(String[] args){
		SelfDirected5 frame = new SelfDirected5();
		frame.setTitle("The Front View of a Microwave Oven");
		frame.setSize(400, 250);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
