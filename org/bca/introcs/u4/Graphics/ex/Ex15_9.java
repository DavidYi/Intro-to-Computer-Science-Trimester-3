package org.bca.introcs.u4.Graphics.ex;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex15_9 extends JFrame {
	public Ex15_9() {
		setLayout(new GridLayout(2, 2));
		for (int i = 0; i < 4; i++) {
			add(new Fan());
		}
	}

	public static void main(String[] args) {
		Ex15_9 frame = new Ex15_9();
		frame.setTitle("Example15_9");
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Fan extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);

		int x = getWidth() - 10;
		int y = getHeight() - 10;
		
		g.drawOval(5, 5, x, y);
		x -= 10;
		y -= 10;
		g.fillArc(10, 10, x, y, 0, 30);
		g.fillArc(10, 10, x, y, 90, 30);
		g.fillArc(10, 10, x, y, 180, 30);
		g.fillArc(10, 10, x, y, 270, 30);
	}
}