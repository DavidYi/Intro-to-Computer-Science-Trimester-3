package org.bca.introcs.u4.Graphics.ex;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex15_10 extends JFrame {
	public Ex15_10() {
		add(new Cylinder());
	}

	public static void main(String[] args) {
		Ex15_10 frame = new Ex15_10();
		frame.setTitle("Exercise15_10");
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Cylinder extends JPanel {
	protected void paintComponent(Graphics g) {
		int x = getWidth();
		int y = getHeight();

		g.drawOval(x / 6, y / 6, 4 * x / 6, y / 6);
		g.drawLine(x / 6, y / 4, x / 6, 3 * y / 4);
		g.drawLine(5 * x / 6, y / 4, 5 * x / 6, 3 * y / 4);
		g.drawArc(x / 6, 2*y / 3, 4 * x / 6, y / 6, 0, -180);
		g.drawArc(x / 6, 2*y / 3, 4 * x / 6, y / 6, 0, 20);
		g.drawArc(x / 6, 2*y / 3, 4 * x / 6, y / 6, 40, 20);
		g.drawArc(x / 6, 2*y / 3, 4 * x / 6, y / 6, 80, 20);
		g.drawArc(x / 6, 2*y / 3, 4 * x / 6, y / 6, 120, 20);
		g.drawArc(x / 6, 2*y / 3, 4 * x / 6, y / 6, 160, 20);
	}
}
