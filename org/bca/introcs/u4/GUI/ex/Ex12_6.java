package org.bca.introcs.u4.GUI.ex;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Ex12_6 extends JFrame {
	private ImageIcon usIcon = new ImageIcon("us.gif");
	private ImageIcon myIcon = new ImageIcon("my.jpg");
	private ImageIcon frIcon = new ImageIcon("fr.gif");
	private ImageIcon ukIcon = new ImageIcon("uk.gif");

	public Ex12_6() {
		JLabel us = new JLabel(usIcon);
		JLabel my = new JLabel(myIcon);
		JLabel fr = new JLabel(frIcon);
		JLabel uk = new JLabel(ukIcon);

		Border lineBorder = new LineBorder(Color.BLACK);

		us.setBorder(lineBorder);
		my.setBorder(lineBorder);
		fr.setBorder(lineBorder);
		uk.setBorder(lineBorder);

		setLayout(new GridLayout(2, 2));
		add(us);
		add(my);
		add(fr);
		add(uk);
	}

	public static void main(String[] args) {
		Ex12_6 frame = new Ex12_6();
		frame.setTitle("Excercise12_6");
		frame.setSize(250, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
