package org.bca.introcs.u4.GUI;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SelfDirected7 extends JFrame{
	private ImageIcon usIcon = new ImageIcon("us.gif");
	private ImageIcon myIcon = new ImageIcon("my.jpg");
	private ImageIcon frIcon = new ImageIcon("fr.gif");
	private ImageIcon ukIcon = new ImageIcon("uk.gif");
	
	public SelfDirected7(){
		setLayout(new GridLayout(1, 4, 5, 5));
		add(new JLabel(usIcon));
		add(new JLabel(myIcon));
		add(new JButton(frIcon));
		add(new JButton(ukIcon));
	}
	
	public static void main(String[] args) {
		SelfDirected7 frame = new SelfDirected7();
		frame.setTitle("TestImageIcon");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
