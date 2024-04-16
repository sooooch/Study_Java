package com.itwill.swing02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain02 {

	private JFrame frame;
	private JTextField textInput;
	private JLabel lblMassge;
	private JButton btnInput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain02 window = new AppMain02();
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
	public AppMain02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("굴림", Font.BOLD, 20));
		frame.setBounds(100, 100, 615, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);    // Absolute layout 
		
		lblMassge = new JLabel("메시지를 입력하세요....");
		lblMassge.setFont(new Font("굴림체", Font.BOLD, 20));
		lblMassge.setBounds(0, 0, 777, 55);
		frame.getContentPane().add(lblMassge);
		
		textInput = new JTextField();
		textInput.setFont(new Font("굴림", Font.BOLD, 20));
		textInput.setBounds(0, 62, 777, 167);
		frame.getContentPane().add(textInput);
		textInput.setColumns(10);
		
		btnInput = new JButton("입력"); // JButton 객체 생성
	
		// 버튼에 ActionListener 이벤트 핸들러(리스너)를 설정(등록) 
		btnInput.addActionListener(new ActionListener() {
			@Override // 버튼이 클릭 됐을때 할 일 작성
			public void actionPerformed(ActionEvent e) {
				
				// (지역) 내부 클래스에서는 외부 클래스의 메서드를 사용할 수 있음
				handleInputButtonClick();
			}
		});
		btnInput.setForeground(Color.BLUE);
		btnInput.setFont(new Font("굴림", Font.BOLD, 20));
		btnInput.setBounds(187, 237, 211, 88);
		frame.getContentPane().add(btnInput);
	}

	protected void handleInputButtonClick() {
		
		// 1. JTextField에 입력된 문자열을 읽음
		String msg = textInput.getText();
	//	System.out.println(msg);
		
		// 2. (1)에서 읽은 내용을 JLable에 씀
		lblMassge.setText(msg);
		
		// 3. JTextFiled를 비움(JTextField에 입력된 내용을 지움)
		textInput.setText("");
	}

}
