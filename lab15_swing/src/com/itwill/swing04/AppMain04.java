package com.itwill.swing04;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;

public class AppMain04 {

	private JFrame frame;
	private JTextField num1textField;
	private JTextField num2textField;
	private JButton btnNewButton_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JLabel num2Label;
	private JLabel num1Label;
	
	private JTextArea textResult;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain04 window = new AppMain04();
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
	public AppMain04() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 793, 651);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		num1Label = new JLabel("num1");

		num1Label.setBounds(12, 9, 96, 52);
		num1Label.setHorizontalAlignment(SwingConstants.LEFT);
		frame.getContentPane().add(num1Label);

		num2Label = new JLabel("num2");
		num2Label.setBounds(12, 62, 96, 57);
		frame.getContentPane().add(num2Label);

		num1textField = new JTextField();
		num1textField.setBounds(201, 16, 288, 40);
		frame.getContentPane().add(num1textField);
		num1textField.setColumns(10);

		num2textField = new JTextField();
		num2textField.setBounds(201, 68, 288, 46);
		frame.getContentPane().add(num2textField);
		num2textField.setColumns(10);

		textResult = new JTextArea();
		textResult.setBounds(31, 334, 669, 256);
		frame.getContentPane().add(textResult);

		btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);
				
			}
//				int x = 0;
//				int y = 0;
//				try {
//			 x =	Integer.parseInt(num1textField.getText());
//			 y =	Integer.parseInt(num2textField.getText());
//				} catch (NumberFormatException ex) {
//					textResult.setText("숫자를 적으세요");
//					return;
//				}
//				
//			int result =  x + y;
//			
//			String msg = String.format("%d + %d = %d", x ,y, result);
//			textResult.setText(msg);
//			}
			
			
			
		});
		btnNewButton.setBounds(12, 245, 158, 67);
		frame.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				handleButtonClick(e);				
			}
		});

		btnNewButton_1.setBounds(205, 245, 158, 67);
		frame.getContentPane().add(btnNewButton_1);
		
		

		btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener((e) ->  handleButtonClick(e));
		btnNewButton_2.addActionListener(this::handleButtonClick);
		
		btnNewButton_2.setBounds(396, 245, 158, 67);
		frame.getContentPane().add(btnNewButton_2);
		
		

		btnNewButton_3 = new JButton("/");
	
			btnNewButton_3.addActionListener((e) ->  handleButtonClick(e));
		btnNewButton_3.setBounds(580, 245, 158, 67);
		frame.getContentPane().add(btnNewButton_3);
		
		
		
		textResult = new JTextArea();
		textResult.setBounds(62, 357, 504, 200);
		frame.getContentPane().add(textResult);
	}
	
	
//	private void gggggggg (String s) {
//		int x = 0;
//		int y = 0;
//		int result = 0;
//		x =	Integer.parseInt(num1textField.getText());
//		 y =	Integer.parseInt(num2textField.getText());
//		switch (s) {
//		case "*" :
//			result = x * y;
//			
//			break;
//		case "/" :
//			result = x / y;
//			break;
//		case "-" :
//			
//			result = x - y;
//			
//		}
//	
//	
//		String msg = Integer.toString(result);
//		textResult.setText(msg);
//	}
	
	
	private void handleButtonClick(ActionEvent event) {
		double x = 0. ;
		double y = 0. ;
		try {
			
			x = Double.parseDouble(num1textField.getText());
			y = Double.parseDouble(num2textField.getText());
			
		} catch (NumberFormatException ex) {
			textResult.setText("Number1 또는 Number2에는 숫자로 입력하삼 ");
			return;
		}
		
		
	 double result = 0; //사칙연산 결과를 저장할 변수
	 String operator = ""; // 사칙연산 기호(+_*/)를 저장할 변수
	 
	 Object source = event.getSource();
	 if (source == btnNewButton) {
		 result = x + y;
		 operator = "+";
	 } else if(source == btnNewButton_1) {
		 result = x - y;
		 operator = "-";
	 } else if(source == btnNewButton_2) {
		 result = x * y;
		 operator = "x";
	 } else if(source == btnNewButton_3) {
		 result = x / y;
		 operator = "/";
	 } 
		String msg = String.format("%f %s %f = %f", x, operator, y , result);
		textResult.setText(msg);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}
	
	
	
	
	
	
	

