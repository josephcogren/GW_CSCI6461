package gui;

import javax.swing.JFrame;

public class PanelView {
	private static JFrame frame; 
	
	public static void main(String args[]) {	
		frame = new JFrame();
		frame.setSize(500,500);
		R0Input r0 = new R0Input();
		R1Input r1 = new R1Input();
		
		r0.addR0(frame);
		r1.addR1(frame);
	
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("GUI");
		frame.pack();
		frame.setVisible(true);
	}
}
