package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class R1Input {
	public void addR1(JFrame f) {
		
		JLabel l = new JLabel("R1");
		JPanel panel = new JPanel();

//		panel.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
		panel.setBounds(100,100,150,150);
		panel.setLayout(new GridLayout(1, 1));
		panel.add(l);
		
		TextField t = new TextField();
		LoadButton lb = new LoadButton();
		
		t.addText(panel ,50, 100, 200, 30);
		lb.addLdBtn(panel,260,100,30,30);
		
		f.add(panel, BorderLayout.CENTER);
		
	}

}
