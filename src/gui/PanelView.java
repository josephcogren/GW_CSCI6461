package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PanelView extends JFrame {

	private JPanel contentPane;
	private JTextField textGpr_0;
	private JTextField textGpr_1;
	private JTextField textGpr_2;
	private JTextField textGpr_3;
	private JTextField textIxr_1;
	private JTextField textIxr_2;
	private JTextField textIxr_3;
	private JTextField textPC;
	private JTextField textMAR;
	private JTextField textMBR;
	private JTextField textIR;
	private JTextField textMFR;
	private JTextField textPriv;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelView frame = new PanelView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PanelView() {
		setTitle("Machine Simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblGpr_0 = new JLabel("GPR 0");
		lblGpr_0.setBounds(20, 20, 41, 16);
		contentPane.add(lblGpr_0);
		
		JLabel lblGpr_1 = new JLabel("GPR 1");
		lblGpr_1.setBounds(20, 40, 41, 16);
		contentPane.add(lblGpr_1);
		
		JLabel lblGpr_2 = new JLabel("GPR 2");
		lblGpr_2.setBounds(20, 60, 41, 16);
		contentPane.add(lblGpr_2);
		
		JLabel lblGpr_3 = new JLabel("GPR 3");
		lblGpr_3.setBounds(20, 80, 41, 16);
		contentPane.add(lblGpr_3);
		
		JLabel lblIxr_1 = new JLabel("IXR 1");
		lblIxr_1.setBounds(20, 120, 41, 16);
		contentPane.add(lblIxr_1);
		
		JLabel lblIxr_2 = new JLabel("IXR 2");
		lblIxr_2.setBounds(20, 140, 41, 16);
		contentPane.add(lblIxr_2);
		
		JLabel lblIxr_3 = new JLabel("IXR 3");
		lblIxr_3.setBounds(20, 160, 41, 16);
		contentPane.add(lblIxr_3);
		
		textGpr_0 = new JTextField();
		textGpr_0.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textGpr_0.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<16) {
						textGpr_0.setEditable(true);
					} else {
						textGpr_0.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textGpr_0.setEditable(true);
					} else {
						textGpr_0.setEditable(false);
					}
					}
			}
		});
		textGpr_0.setBounds(70, 20, 160, 16);
		contentPane.add(textGpr_0);
		textGpr_0.setColumns(10);
		
		textGpr_1 = new JTextField();
		textGpr_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
				}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textGpr_1.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<16) {
						textGpr_1.setEditable(true);
					} else {
						textGpr_1.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textGpr_1.setEditable(true);
					} else {
						textGpr_1.setEditable(false);
					}
					}
			}
		});
		textGpr_1.setColumns(10);
		textGpr_1.setBounds(70, 40, 160, 16);
		contentPane.add(textGpr_1);
		
		textGpr_2 = new JTextField();
		textGpr_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textGpr_2.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<16) {
						textGpr_2.setEditable(true);
					} else {
						textGpr_2.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textGpr_2.setEditable(true);
					} else {
						textGpr_2.setEditable(false);
					}
					}
			}
		});
		textGpr_2.setColumns(10);
		textGpr_2.setBounds(70, 60, 160, 16);
		contentPane.add(textGpr_2);
		
		textGpr_3 = new JTextField();
		textGpr_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textGpr_3.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<16) {
						textGpr_3.setEditable(true);
					} else {
						textGpr_3.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textGpr_3.setEditable(true);
					} else {
						textGpr_3.setEditable(false);
					}
					}
			}
		});
		textGpr_3.setColumns(10);
		textGpr_3.setBounds(70, 80, 160, 16);
		contentPane.add(textGpr_3);
		
		textIxr_1 = new JTextField();
		textIxr_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textIxr_1.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<16) {
						textIxr_1.setEditable(true);
					} else {
						textIxr_1.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textIxr_1.setEditable(true);
					} else {
						textIxr_1.setEditable(false);
					}
					}
			}
		});
		textIxr_1.setColumns(10);
		textIxr_1.setBounds(70, 120, 160, 16);
		contentPane.add(textIxr_1);
		
		textIxr_2 = new JTextField();
		textIxr_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textIxr_2.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<16) {
						textIxr_2.setEditable(true);
					} else {
						textIxr_2.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textIxr_2.setEditable(true);
					} else {
						textIxr_2.setEditable(false);
					}
					}
			}
		});
		textIxr_2.setColumns(10);
		textIxr_2.setBounds(70, 140, 160, 16);
		contentPane.add(textIxr_2);
		
		textIxr_3 = new JTextField();
		textIxr_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textIxr_3.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<16) {
						textIxr_3.setEditable(true);
					} else {
						textIxr_3.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textIxr_3.setEditable(true);
					} else {
						textIxr_3.setEditable(false);
					}
					}
			}
		});
		textIxr_3.setColumns(10);
		textIxr_3.setBounds(70, 160, 160, 16);
		contentPane.add(textIxr_3);
		
		JButton btnGpr_0 = new JButton("LD");
		btnGpr_0.setBounds(240, 20, 25, 15);
		contentPane.add(btnGpr_0);
		
		JButton btnGpr_1 = new JButton("LD");
		btnGpr_1.setBounds(240, 41, 25, 15);
		contentPane.add(btnGpr_1);
		
		JButton btnGpr_2 = new JButton("LD");
		btnGpr_2.setBounds(240, 60, 25, 15);
		contentPane.add(btnGpr_2);
		
		JButton btnGpr_3 = new JButton("LD");
		btnGpr_3.setBounds(240, 80, 25, 15);
		contentPane.add(btnGpr_3);
		
		JButton btnIxr_1 = new JButton("LD");
		btnIxr_1.setBounds(240, 121, 25, 15);
		contentPane.add(btnIxr_1);
		
		JButton btnIxr_2 = new JButton("LD");
		btnIxr_2.setBounds(240, 141, 25, 15);
		contentPane.add(btnIxr_2);
		
		JButton btnIxr_3 = new JButton("LD");
		btnIxr_3.setBounds(240, 161, 25, 15);
		contentPane.add(btnIxr_3);
		
		JLabel lblPC = new JLabel("PC");
		lblPC.setBounds(335, 20, 25, 16);
		contentPane.add(lblPC);
		
		JLabel lblMAR = new JLabel("MAR");
		lblMAR.setBounds(335, 40, 30, 16);
		contentPane.add(lblMAR);
		
		JLabel lblMBR = new JLabel("MBR");
		lblMBR.setBounds(335, 61, 30, 15);
		contentPane.add(lblMBR);
		
		JLabel lblIR = new JLabel("IR");
		lblIR.setBounds(335, 80, 25, 16);
		contentPane.add(lblIR);
		
		JLabel lblMFR = new JLabel("MFR");
		lblMFR.setBounds(443, 101, 30, 16);
		contentPane.add(lblMFR);
		
		JLabel lblPriv = new JLabel("Privileged");
		lblPriv.setBounds(407, 120, 66, 16);
		contentPane.add(lblPriv);
		
		textPC = new JTextField();
		textPC.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textPC.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<12) {
						textPC.setEditable(true);
					} else {
						textPC.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textPC.setEditable(true);
					} else {
						textPC.setEditable(false);
					}
					}
			}
		});
		textPC.setColumns(10);
		textPC.setBounds(415, 20, 120, 16);
		contentPane.add(textPC);
		
		textMAR = new JTextField();
		textMAR.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textMAR.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<12) {
						textMAR.setEditable(true);
					} else {
						textMAR.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textMAR.setEditable(true);
					} else {
						textMAR.setEditable(false);
					}
					}
			}
		});
		textMAR.setColumns(10);
		textMAR.setBounds(415, 40, 120, 16);
		contentPane.add(textMAR);
		
		textMBR = new JTextField();
		textMBR.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
			@Override
			public void keyPressed(KeyEvent e) {
				String input = textMBR.getText();
				int length = input.length();
				char c = e.getKeyChar();
				if(e.getKeyChar()>= '0' && e.getKeyChar()<='1') {
					if(length<16) {
						textMBR.setEditable(true);
					} else {
						textMBR.setEditable(false);
					} 
				} else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || e.getExtendedKeyCode()==KeyEvent.VK_DELETE) {
						textMBR.setEditable(true);
					} else {
						textMBR.setEditable(false);
					}
					}
			}
		});
		textMBR.setColumns(10);
		textMBR.setBounds(377, 60, 160, 16);
		contentPane.add(textMBR);
		
		textIR = new JTextField();
		textIR.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
		});
		textIR.setColumns(10);
		textIR.setBounds(375, 80, 160, 16);
		contentPane.add(textIR);
		
		textMFR = new JTextField();
		textMFR.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
		});
		textMFR.setColumns(10);
		textMFR.setBounds(485, 101, 50, 16);
		contentPane.add(textMFR);
		
		textPriv = new JTextField();
		textPriv.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if(!Character.isDigit(c)) {
					e.consume();
					}
			}
		});
		textPriv.setColumns(10);
		textPriv.setBounds(515, 120, 20, 16);
		contentPane.add(textPriv);
		
		JButton btnPC = new JButton("LD");
		btnPC.setBounds(545, 20, 25, 15);
		contentPane.add(btnPC);
		
		JButton btnMAR = new JButton("LD");
		btnMAR.setBounds(545, 40, 25, 15);
		contentPane.add(btnMAR);
		
		JButton btnMBR = new JButton("LD");
		btnMBR.setBounds(545, 60, 25, 15);
		contentPane.add(btnMBR);
		
		JButton btnNewButton = new JButton("15");
		btnNewButton.setBounds(20, 250, 30, 45);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("14");
		btnNewButton_1.setBounds(50, 250, 30, 45);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("13");
		btnNewButton_2.setBounds(80, 250, 30, 45);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("12");
		btnNewButton_3.setBounds(110, 250, 30, 45);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("11");
		btnNewButton_4.setBounds(140, 250, 30, 45);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("10");
		btnNewButton_5.setBounds(170, 250, 30, 45);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_5_1 = new JButton("9");
		btnNewButton_5_1.setBounds(215, 250, 30, 45);
		contentPane.add(btnNewButton_5_1);
		
		JButton btnNewButton_5_2 = new JButton("8");
		btnNewButton_5_2.setBounds(245, 250, 30, 45);
		contentPane.add(btnNewButton_5_2);
		
		JButton btnNewButton_5_2_1 = new JButton("7");
		btnNewButton_5_2_1.setBounds(290, 250, 30, 45);
		contentPane.add(btnNewButton_5_2_1);
		
		JButton btnNewButton_5_2_2 = new JButton("6");
		btnNewButton_5_2_2.setBounds(320, 250, 30, 45);
		contentPane.add(btnNewButton_5_2_2);
		
		JButton btnNewButton_5_2_3 = new JButton("5");
		btnNewButton_5_2_3.setBounds(365, 250, 30, 45);
		contentPane.add(btnNewButton_5_2_3);
		
		JButton btnNewButton_5_2_4 = new JButton("4");
		btnNewButton_5_2_4.setBounds(410, 250, 30, 45);
		contentPane.add(btnNewButton_5_2_4);
		
		JButton btnNewButton_5_2_4_1 = new JButton("3");
		btnNewButton_5_2_4_1.setBounds(440, 250, 30, 45);
		contentPane.add(btnNewButton_5_2_4_1);
		
		JButton btnNewButton_5_2_4_2 = new JButton("2");
		btnNewButton_5_2_4_2.setBounds(470, 250, 30, 45);
		contentPane.add(btnNewButton_5_2_4_2);
		
		JButton btnNewButton_5_2_4_3 = new JButton("1");
		btnNewButton_5_2_4_3.setBounds(500, 250, 30, 45);
		contentPane.add(btnNewButton_5_2_4_3);
		
		JButton btnNewButton_5_2_4_4 = new JButton("0");
		btnNewButton_5_2_4_4.setBounds(530, 250, 30, 45);
		contentPane.add(btnNewButton_5_2_4_4);
		
		JLabel lblNewLabel = new JLabel("Operation");
		lblNewLabel.setBounds(79, 307, 66, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("GPR");
		lblNewLabel_1.setBounds(235, 307, 30, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("IXR");
		lblNewLabel_2.setBounds(310, 307, 25, 16);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("I");
		lblNewLabel_3.setBounds(380, 307, 9, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setBounds(460, 307, 65, 16);
		contentPane.add(lblNewLabel_4);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(377, 362, 75, 30);
		contentPane.add(btnLoad);
		
		JButton btnStore = new JButton("Store");
		btnStore.setBounds(290, 362, 75, 30);
		contentPane.add(btnStore);
		
		JButton btnNewButton_6 = new JButton("IPL");
		btnNewButton_6.setBounds(470, 362, 65, 30);
		contentPane.add(btnNewButton_6);
	
		
	}
}
