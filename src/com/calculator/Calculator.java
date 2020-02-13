package com.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField output;
	double first, second, res;
	String ope, ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Segoe UI", Font.BOLD, 16));
		frame.setBounds(100, 100, 324, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Calculator");
		
		output = new JTextField();
		output.setHorizontalAlignment(SwingConstants.TRAILING);
		output.setFont(new Font("Segoe UI", Font.BOLD, 20));
		output.setBounds(10, 11, 290, 69);
		frame.getContentPane().add(output);
		output.setColumns(10);
		
		JButton button_mod = new JButton("%");
		button_mod.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_mod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				first = Double.parseDouble(output.getText());
				output.setText("");
				ope= "%";
			}
		});
		button_mod.setBounds(10, 91, 65, 45);
		frame.getContentPane().add(button_mod);
		
		JButton button_root = new JButton("\u221A");
		button_root.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(output.getText());
				res = Math.sqrt(second);
				ans = String.format("%.2f", res);
				output.setText(ans);
			}
		});
		button_root.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_root.setBounds(85, 91, 65, 45);
		frame.getContentPane().add(button_root);
		
		JButton button_square = new JButton("x\u00B2");
		button_square.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(output.getText());
				res = second *second;
				ans = String.format("%.2f", res);
				output.setText(ans);
				
			}
		});
		button_square.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_square.setBounds(160, 91, 65, 45);
		frame.getContentPane().add(button_square);
		
		JButton button_byx = new JButton("1/x");
		button_byx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second = Double.parseDouble(output.getText());
				res = 1/second;
				ans = String.format("%.2f", res);
				output.setText(ans);
			}
		});
		button_byx.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_byx.setBounds(235, 91, 65, 45);
		frame.getContentPane().add(button_byx);
		
		JButton button_CE = new JButton("CE");
		button_CE.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_CE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(null);
			}
		});
		button_CE.setBounds(10, 147, 65, 45);
		frame.getContentPane().add(button_CE);
		
		JButton button_C = new JButton("C");
		button_C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				output.setText(null);
			}
		});
		button_C.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_C.setBounds(85, 147, 65, 45);
		frame.getContentPane().add(button_C);
		
		JButton button_del = new JButton("\uF0E7");
		button_del.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backs=null;
				if(output.getText().length() > 0)
				{
					StringBuilder strB = new StringBuilder(output.getText());
					strB.deleteCharAt(output.getText().length()-1);
					backs = strB.toString();
					output.setText(backs);
				
			}
			}
		});
		button_del.setFont(new Font("Wingdings", Font.BOLD, 16));
		button_del.setBounds(160, 147, 65, 45);
		frame.getContentPane().add(button_del);
		
		JButton button_devide = new JButton("/");
		button_devide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(output.getText());
				output.setText("");
				ope= "/";
			}
		});
		button_devide.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_devide.setBounds(235, 147, 65, 45);
		frame.getContentPane().add(button_devide);
		
		JButton button_n7 = new JButton("7");
		button_n7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n7.getText();
				output.setText(input);
			}
		});
		button_n7.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n7.setBounds(10, 203, 65, 45);
		frame.getContentPane().add(button_n7);
		
		JButton button_n8 = new JButton("8");
		button_n8.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n8.getText();
				output.setText(input);
			}
		});
		button_n8.setBounds(85, 203, 65, 45);
		frame.getContentPane().add(button_n8);
		
		JButton button_n9 = new JButton("9");
		button_n9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n9.getText();
				output.setText(input);
			}
		});
		button_n9.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n9.setBounds(160, 203, 65, 45);
		frame.getContentPane().add(button_n9);
		
		JButton btnX = new JButton("x");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(output.getText());
				output.setText("");
				ope= "*";
			}
		});
		btnX.setFont(new Font("Segoe UI", Font.BOLD, 16));
		btnX.setBounds(235, 203, 65, 45);
		frame.getContentPane().add(btnX);
		
		JButton button_n4 = new JButton("4");
		button_n4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n4.getText();
				output.setText(input);
			}
		});
		button_n4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n4.setBounds(10, 259, 65, 45);
		frame.getContentPane().add(button_n4);
		
		JButton button_n1 = new JButton("1");
		button_n1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n1.getText();
				output.setText(input);
			}
		});
		button_n1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n1.setBounds(10, 315, 65, 45);
		frame.getContentPane().add(button_n1);
		
		JButton button_pm = new JButton("\u00B1");
		button_pm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(output.getText()));
				ops = ops * (-1);
				output.setText(String.valueOf(ops));
			}
		});
		button_pm.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_pm.setBounds(10, 371, 65, 45);
		frame.getContentPane().add(button_pm);
		
		JButton button_n5 = new JButton("5");
		button_n5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n5.getText();
				output.setText(input);
			}
		});
		button_n5.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n5.setBounds(85, 259, 65, 45);
		frame.getContentPane().add(button_n5);
		
		JButton button_n6 = new JButton("6");
		button_n6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n6.getText();
				output.setText(input);
			}
		});
		button_n6.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n6.setBounds(160, 259, 65, 45);
		frame.getContentPane().add(button_n6);
		
		JButton button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(output.getText());
				output.setText("");
				ope= "-";
			}
		});
		button_minus.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_minus.setBounds(235, 259, 65, 45);
		frame.getContentPane().add(button_minus);
		
		JButton button_n2 = new JButton("2");
		button_n2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n2.getText();
				output.setText(input);
			}
		});
		button_n2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n2.setBounds(85, 315, 65, 45);
		frame.getContentPane().add(button_n2);
		
		JButton button_n3 = new JButton("3");
		button_n3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n3.getText();
				output.setText(input);
			}
		});
		button_n3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n3.setBounds(160, 315, 65, 45);
		frame.getContentPane().add(button_n3);
		
		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(output.getText());
				output.setText("");
				ope= "+";
				
			}
		});
		button_plus.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_plus.setBounds(233, 315, 65, 45);
		frame.getContentPane().add(button_plus);
		
		JButton button_n0 = new JButton("0");
		button_n0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_n0.getText();
				output.setText(input);
			}
		});
		button_n0.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_n0.setBounds(85, 371, 65, 45);
		frame.getContentPane().add(button_n0);
		
		JButton button_dot = new JButton(".");
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input = output.getText() + button_dot.getText();
				output.setText(input);
			}
		});
		button_dot.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_dot.setBounds(160, 371, 65, 45);
		frame.getContentPane().add(button_dot);
		
		JButton button_eql = new JButton("=");
		button_eql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(output.getText());
				if(ope.equals("+"))
				{
					res = first + second;
					answer = String.format("%.2f", res);
					output.setText(answer);
				}
				
				else if(ope.equals("-"))
				{
					res = first - second;
					answer = String.format("%.2f", res);
					output.setText(answer);
				}
				
				else if(ope.equals("*"))
				{
					res = first * second;
					answer = String.format("%.2f", res);
					output.setText(answer);
				}
				else if(ope.equals("/"))
				{
					res = first / second;
					answer = String.format("%.2f", res);
					output.setText(answer);
				}
				else if(ope.equals("%"))
				{
					res = first % second;
					answer = String.format("%.2f", res);
					output.setText(answer);
				}
			}
		});
		button_eql.setFont(new Font("Segoe UI", Font.BOLD, 16));
		button_eql.setBounds(235, 371, 65, 45);
		frame.getContentPane().add(button_eql);
		
		JLabel test = new JLabel("for educational purposes only! :v");
		test.setHorizontalAlignment(SwingConstants.TRAILING);
		test.setFont(new Font("Segoe UI", Font.PLAIN, 9));
		test.setVerticalAlignment(SwingConstants.TOP);
		test.setBounds(54, 427, 244, 14);
		frame.getContentPane().add(test);
	}
}
