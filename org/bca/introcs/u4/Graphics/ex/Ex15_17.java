package org.bca.introcs.u4.Graphics.ex;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex15_17 extends JFrame {
	public Ex15_17() {
		add(new Person());
	}

	public static void main(String[] args) {
		Ex15_17 frame = new Ex15_17();
		frame.setTitle("Exercise15_17");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class Person extends JPanel {
	protected void paintComponent(Graphics g) {
		int x = getWidth();
		int y = getHeight();

		g.drawLine(7 * x / 10, y / 5, 7 * x / 10, y / 10);
		g.drawLine(7 * x / 10, y / 10, 3 * x / 10, y / 10);
		g.drawLine(3 * x / 10, 9 * y / 10, 3 * x / 10, y / 10);
		g.drawArc(x / 10, 9 * y / 10, 2 * x / 5, y / 10, 0, 180);
		// hanger
		g.drawOval(3 * x / 5, y / 5, x / 5, y / 5);
		// person's head
		g.drawLine(7 * x / 10, 2 * y / 5, 7 * x / 10, 7 * y / 10);
		// person's body
		g.drawLine(7 * x / 10, 21 * y / 50, 11 * x / 20, 11 * y / 20);
		// person's left arm
		g.drawLine(7 * x / 10, 21 * y / 50, 17 * x / 20, 11 * y / 20);
		// person's right arm
		g.drawLine(7 * x / 10, 7 * y / 10, 3 * x / 5, 9 * y / 10);
		//person's left leg
		g.drawLine(7 * x / 10, 7 * y / 10, 8 * x / 10, 9 * y / 10);
		//person's right leg
	}
}