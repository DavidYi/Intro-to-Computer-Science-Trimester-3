package org.bca.introcs.u4.Graphics.ex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex15_3 extends JFrame {
	boolean filled = true;

	public Ex15_3() {
		add(new Checker());

	}

	public static void main(String[] args) {
		Ex15_3 frame = new Ex15_3();
		frame.setTitle("Example15_3");
		frame.setSize(300, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class Checker extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);

		int x = getWidth();
		int y = getHeight();

		int w = x / 8;
		int h = y / 8;

		for (int i = 0; i < 8; i += 1) {
			for (int j = 0; j < 8; j += 1) {
				if ((j + i) % 2 == 0) {
					g.setColor(Color.WHITE);
				} else {
					g.setColor(Color.BLACK);
				}
				int xCoord = j * w;
				int yCoord = i * h;

				g.fillRect(xCoord, yCoord, w, h);

			}
		}
	}
}