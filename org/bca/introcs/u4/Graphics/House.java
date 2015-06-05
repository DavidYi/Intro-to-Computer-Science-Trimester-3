package org.bca.introcs.u4.Graphics;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class House extends JFrame {
	public House() {
		setTitle("Our House");
		add(new HousePanel());
	}

	public static void main(String[] args) {
		House frame = new House();
		frame.setSize(350, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}

class HousePanel extends JPanel {
	protected void paintComponent(Graphics g) {
		int x = getWidth();
		int y = getHeight();

		g.drawRect(x / 4, y / 2, x / 2, y / 4);
		g.drawLine(x / 4, y / 2, x / 2, y / 4);
		g.drawLine(3 * x / 4, y / 2, x / 2, y / 4);

		g.drawRect(7 * x / 16, 2 * y / 3, x / 8, y / 12);
	}
}
