package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextField {
	public void addText(JPanel p, int a, int b, int c, int d) {
		JTextField t = new JTextField("");
		p.add(t);
		t.setBounds(a, b, c, d);
	}
}
