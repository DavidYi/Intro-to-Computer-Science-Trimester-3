package org.bca.introcs.u4.GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SelfDirected6 extends JFrame{
	public SelfDirected6(){
		//Create a panel to group three buttons
		JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 2, 2));
		JButton jbtLeft = new JButton("Left");
		JButton jbtCenter = new JButton("Center");
		JButton jbtRight = new JButton("Right");
		
		jbtLeft.setBackground(Color.WHITE);
		jbtCenter.setForeground(Color.GREEN);
		jbtRight.setToolTipText("This is te Right button");
		
		p1.add(jbtLeft);
		p1.add(jbtCenter);
		p1.add(jbtRight);
		p1.setBorder(new TitledBorder("Three Buttons"));
		
		//Create a font and a lone border
		Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
		Border lineBorder = new LineBorder(Color.BLACK, 2);
		
		//Create a panel to group two labels
		JPanel p2 = new JPanel(new GridLayout(1, 2, 5, 5));
		JLabel jlblRed = new JLabel("Red");
		JLabel jlblOrange = new JLabel("Orange");
		
		jlblRed.setForeground(Color.RED);
		jlblOrange.setForeground(Color.ORANGE);
		
		jlblRed.setFont(largeFont);;
		jlblOrange.setFont(largeFont);
		
		jlblRed.setBorder(lineBorder);
		jlblOrange.setBorder(lineBorder);
		
		p2.add(jlblRed);
		p2.add(jlblOrange);
		p2.setBorder(new TitledBorder("Two Labels"));
		
		//Add two panels to the frame
		setLayout(new GridLayout(2, 1, 5, 5));
		add(p1);
		add(p2);
	}
	
	public static void main(String[] args) {
		JFrame frame = new SelfDirected6();
		frame.setTitle("TestSwingCommonFeatures");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
