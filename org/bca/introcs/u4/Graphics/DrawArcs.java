package org.bca.introcs.u4.Graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawArcs extends JFrame {
	public DrawArcs() {
		setTitle("DrawArcs");
		add(new ArcsPanel());
	}

	public static void main(String[] args) {
		DrawArcs frame = new DrawArcs();
		frame.setSize(250, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class ArcsPanel extends JPanel {
	// draw four blades of a fan
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;
		int radius = (int) (Math.min(getWidth(), getHeight()) * 0.4);
		int x = xCenter - radius;
		int y = yCenter - radius;

		g.fillArc(x, y, 2 * radius, 2 * radius, 0, 30); //30 arc from 0
		g.fillArc(x, y, 2 * radius, 2 * radius, 90, 30);//30 arc from 90
		g.fillArc(x, y, 2 * radius, 2 * radius, 180, 30);//30 arc from 180
		g.fillArc(x, y, 2 * radius, 2 * radius, 270, 30);//30 arc from 270
	}
}