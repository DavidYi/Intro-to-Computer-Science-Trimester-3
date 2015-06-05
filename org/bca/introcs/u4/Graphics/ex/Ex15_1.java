package org.bca.introcs.u4.Graphics.ex;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex15_1 extends JFrame {
	public Ex15_1() {
		newLines line = new newLines();
		add(new newLines());
	}

	public static void main(String[] args) {
		Ex15_1 frame = new Ex15_1();
		frame.setTitle("Example15_1");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class newLines extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		int w3 = (int) getWidth() / 3;
		int h3 = (int) getHeight() / 3;

		g.setColor(Color.blue);
		g.drawLine(0, h3, getWidth(), h3);
		g.drawLine(0, 2 * h3, getWidth(), 2 * h3);

		g.setColor(Color.red);
		g.drawLine(w3, 0, w3, getHeight());
		g.drawLine(2 * w3, 0, w3 * 2, getHeight());
	}
}
