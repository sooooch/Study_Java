package com.itwill.swing07;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame {
	
	public interface Notifiable {
		public void notifyMessage(String msg);
	}

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JButton btn;
	
	private Component parentComponent;
	private Notifiable app; // notifyMessage(String msg) 메서드를 갖는 객체의 주소를 저장
	/**
	 * Launch the application.
	 */
	public static void showMyFrame(Component parentComponent, Notifiable app) {
		/*
		 *  Component
		 *  |__ JFrame, JDialog
		 * 
		 */
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame(parentComponent,app);
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
	public MyFrame(Component parentComponent,Notifiable app) {
		this.parentComponent = parentComponent;
		this.app = app;
		initialze ();
		
	}
	
	
	
	public void initialze() {
		// JFrame의 닫기 버트늬 기본 동작을 설정
		// EXID_ON_CLOSE: 프로그램 종료(메인 쓰레드 종료)
		// DISPOSE_ON_CLOSE: 현재 JFrame만 종료
		
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		int x = 0;
		int y = 0;
		if(parentComponent != null) {
			x = parentComponent.getX(); // 부모 컴포넌트의 x 좌ㅍㅛ
			y = parentComponent.getY(); // 부모 컴포넌트의  y 좌표
			
		}
		setBounds(x, y, 335, 300);
		
		
		if (parentComponent == null)	{ // 부모 컴포넌트 정보가 없을때
			setLocationRelativeTo(null); // 화면 중앙에 위치
		}
		
		
		
		
		
		
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);   //앱솔루트 레이아웃으로 변경 null
		
		textField = new JTextField();
		textField.setBounds(31, 10, 228, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btn = new JButton("확인");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 // JTextField의 내용을 읽음.
                String msg = textField.getText();
                app.notifyMessage(msg);
			}
		});
		
		btn.setFont(new Font("궁서체", Font.BOLD | Font.ITALIC, 22));
		btn.setBounds(57, 92, 138, 69);
		contentPane.add(btn);
	}
}
