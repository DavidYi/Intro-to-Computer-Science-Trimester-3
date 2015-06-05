package org.bca.introcs.u4.Graphics.ex;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex15_9 extends JFrame{
	public Ex15_9(){
		setLayout(new GridLayout(2,2));
		add(new Fan());
	}
	public static void main(String[] args) {
		
	}

}

class Fan extends JPanel {
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);

		Random rand = new Random();
		int x = getWidth();
		int y = getHeight() ;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; i++) {
				int r = rand.nextInt(3);
				
				if (r < 2){
					
				}
				else{
					
				}
			}
		}
	}
}