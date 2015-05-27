package org.bca.introcs.u4.GUI.ex;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Ex12_7 extends JFrame {
	private ImageIcon x = new ImageIcon("x.gif");
	private ImageIcon o = new ImageIcon("o.gif");
	private ImageIcon[] shape = { x, o };

	public Ex12_7(){
		Random rand = new Random();
		
		setLayout(new GridLayout(3,3));

		Border lineBorder = new LineBorder(Color.BLACK);
		
		for(int i = 0; i < 9; i++){
			int j = rand.nextInt(3);
			
			if (j < 2){
				JLabel temp  = new JLabel(shape[j]);
				temp.setBorder(lineBorder);
				add(temp);
			}
			else{
				JLabel blank = new JLabel();
				blank.setBorder(lineBorder);
				add(blank);
			}
		}		
	}

	public static void main(String[] args) {
		Ex12_7 frame = new Ex12_7();
		frame.setTitle("Exercise12_7");
		frame.setSize(200, 200);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
