package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class LoadButton {
	public void addLdBtn(JPanel p, int a, int b, int c, int d) {
		JButton btn = new JButton("Ld");
		btn.setBounds(a,b,c,d);
		btn.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		
		}
		});
		p.add(btn);
	}
}
