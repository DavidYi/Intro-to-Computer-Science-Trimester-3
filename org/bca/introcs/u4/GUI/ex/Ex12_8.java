package org.bca.introcs.u4.GUI.ex;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Ex12_8 extends JFrame {
	public Ex12_8() {
		Font largeFont = new Font("TimesRoman", Font.BOLD, 20);
		Border lineBorder = new LineBorder(Color.BLACK);
		setLayout(new GridLayout(2, 3));

		JLabel l1 = new JLabel("black");
		JLabel l2 = new JLabel("blue");
		JLabel l3 = new JLabel("cyan");
		JLabel l4 = new JLabel("green");
		JLabel l5 = new JLabel("magenta");
		JLabel l6 = new JLabel("orange");

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		JPanel p6 = new JPanel();

		JLabel[] labels = { l1, l2, l3, l4, l5, l6 };
		Color[] color = { Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN,
				Color.MAGENTA, Color.ORANGE };
		JPanel[] panels = { p1, p2, p3, p4, p5, p6 };

		for (int i = 0; i < 6; i++) {
			labels[i].setBackground(Color.WHITE);
			labels[i].setForeground(color[i]);
			labels[i].setFont(largeFont);
			panels[i].add(labels[i]);
			panels[i].setBorder(lineBorder);
			add(panels[i]);
		}
	}

	public static void main(String[] args) {
		Ex12_8 frame = new Ex12_8();
		frame.setTitle("Example12_8");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
