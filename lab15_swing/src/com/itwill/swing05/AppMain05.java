package com.itwill.swing05;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;


public class AppMain05 {

	private JFrame frame;
	private JTextField textField_number;
	private JTextField textField_email;
	private JTextField textField_name;
	private JLabel lblNewLabel_name;
	private JLabel lblNewLabel_number;
	private JLabel lblNewLabel_email;
	private JButton btnNewButton;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain05 window = new AppMain05();
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
	public AppMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 819, 608);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblNewLabel_name = new JLabel("이름");
		lblNewLabel_name.setBounds(38, 59, 170, 37);
		frame.getContentPane().add(lblNewLabel_name);

		lblNewLabel_number = new JLabel("전화번호");
		lblNewLabel_number.setBounds(38, 106, 170, 37);
		frame.getContentPane().add(lblNewLabel_number);

		lblNewLabel_email = new JLabel("이메일");
		lblNewLabel_email.setBounds(38, 171, 170, 37);
		frame.getContentPane().add(lblNewLabel_email);

		textField_name = new JTextField();
		textField_name.setBounds(234, 67, 299, 37);
		frame.getContentPane().add(textField_name);
		textField_name.setColumns(10);
		textField_name.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                textField_number.requestFocus();
	            }
	        }
	    });

		textField_number = new JTextField();
		textField_number.setColumns(10);
		textField_number.setBounds(234, 114, 299, 37);
		frame.getContentPane().add(textField_number);
		 textField_number.addKeyListener(new KeyAdapter() {
		        @Override
		        public void keyPressed(KeyEvent e) {
		            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		                textField_email.requestFocus();
		            }
		        }
		    });

		textField_email = new JTextField();
		textField_email.setColumns(10);
		textField_email.setBounds(234, 171, 299, 37);
		frame.getContentPane().add(textField_email);
		textField_email.addKeyListener(new KeyAdapter() {
	        @Override
	        public void keyPressed(KeyEvent e) {
	            if (e.getKeyCode() == KeyEvent.VK_ENTER) {
	                nameNumMail();
	                
	              
	            }
	        }
	    });
		

		btnNewButton = new JButton("입력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nameNumMail();
				textField_name.setText("");           // 필드값 초기화
	            textField_number.setText("");
	            textField_email.setText("");
	          
                textField_name.requestFocus(); // 첫 번째 텍스트 필드로 포커스 이동

			}
		});

		btnNewButton.setBounds(578, 171, 170, 45);
		frame.getContentPane().add(btnNewButton);

		textArea = new JTextArea();
		scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(92, 288, 592, 206);
		frame.getContentPane().add(scrollPane);
	}

	private void nameNumMail() {
//		String name = textField_name.getText();
//		String number = textField_name.getText();
//		String email = textField_name.getText();
//		String msg = String.format("이름: %s, 전화번호: %s, 이메일: %s\n,name, number, email");
//		textArea.setText(msg);
		
		
		
		textArea.append("이름: " + textField_name.getText() + "\n");
		textArea.append("번호: " + textField_number.getText() + "\n");
		textArea.append("메일: " + textField_email.getText() + "\n");
		textArea.append("===============================\n");

	}
}
