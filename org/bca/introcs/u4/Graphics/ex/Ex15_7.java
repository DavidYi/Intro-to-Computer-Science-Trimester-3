package org.bca.introcs.u4.Graphics.ex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import org.bca.introcs.u4.GUI.ex.Ex12_7;

public class Ex15_7 extends JFrame {
	public Ex15_7() {
		setLayout(new GridLayout(3, 3));
		for (int i = 0; i < 9; i++) {
			add(new TTT());
		}

	}

	public static void main(String[] args) {
		Ex15_7 frame = new Ex15_7();
		frame.setTitle("Exercise15_7");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class TTT extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);

		Random rand = new Random();
		int x = getWidth();
		int y = getHeight();
		int r;

		int i = rand.nextInt();

		if (i == 2) {
			r = (x-10)/2;
			
			g.drawOval(x/2, y/2, r, r);
		}
		
		if (i==1){
			g.drawLine();
		}

	}
}