package org.bca.introcs.u4.GUI.ex;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Ex12_5 extends JFrame {
	public Ex12_5() {
		JLabel dep = new JLabel("Department of Computer Science");
		JLabel sc = new JLabel("School of Computing");
		JLabel univ = new JLabel("Armstrong Alantic State University");
		JLabel tel = new JLabel("Tel: (912) 921-6440");

		Border lineBorder = new LineBorder(Color.BLACK);
		
		dep.setBorder(lineBorder);
		sc.setBorder(lineBorder);
		univ.setBorder(lineBorder);
		tel.setBorder(lineBorder);
		
		setLayout(new GridLayout(4, 1));
		add(dep);
		add(sc);
		add(univ);
		add(tel);

	}

	public static void main(String[] args) {
		Ex12_5 frame = new Ex12_5();
		frame.setTitle("Excercise12_5");
		frame.setSize(250, 150);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
