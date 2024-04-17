package com.itwill.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain07 {

	private JFrame frame;
	private JButton btnMsgDlg;
	private JButton btnConfirmDlg;
	private JButton btnInputDlg;
	private JButton btnICustomDlg;
	private JButton btnMyFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
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
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 388, 500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		btnMsgDlg = new JButton("Messge Dialog");
		btnMsgDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 메시지 다이얼로그 보여주기
//				JOptionPane.showMessageDialog(frame, "안녕하세요");
				JOptionPane.showMessageDialog(frame, // 부모 컴포넌트
						"안녕하세요 swing! ", // 다이얼로그 메시지
						"message", // 다이얼로그 타이틀(제목)
						JOptionPane.PLAIN_MESSAGE); // 메시지 타입
			}
		});
		btnMsgDlg.setFont(new Font("굴림", Font.ITALIC, 20));
		btnMsgDlg.setBounds(12, 10, 348, 73);
		frame.getContentPane().add(btnMsgDlg);

		btnConfirmDlg = new JButton("Confirm Dialog");
		btnConfirmDlg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			int  result = 	JOptionPane.showConfirmDialog(frame, "삭제 할까요?");
				int result = JOptionPane.showConfirmDialog(frame, "정말 삭제 할까요?", "삭제 확인", 0, 3);

				btnConfirmDlg.setText("confirm = " + result);

			}
		});
		btnConfirmDlg.setFont(new Font("굴림", Font.ITALIC, 20));
		btnConfirmDlg.setBounds(12, 98, 348, 73);
		frame.getContentPane().add(btnConfirmDlg);

		btnInputDlg = new JButton("Input Dialog");
		btnInputDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String[] selections = { "인*", "얼굴장부", "X", "너튜브" };
				Object ss = JOptionPane.showInputDialog(
						frame, // 부모 컴포넌트
						" 검색어 입력 ", // 메시지
						" 검색어 ", // 타이틀
						JOptionPane.PLAIN_MESSAGE,         // 메시지 타입
						null,     // 아이콘
						selections, // 선택할 값들
						selections[0]); // 초기 선택값
				btnInputDlg.setText("입력 :" + ss);
			}
		});
		btnInputDlg.setFont(new Font("굴림", Font.ITALIC, 20));
		btnInputDlg.setBounds(12, 184, 348, 73);
		frame.getContentPane().add(btnInputDlg);
		
		btnICustomDlg = new JButton("Custom Dialog");
		btnICustomDlg.addActionListener(new ActionListener() {
		    @Override
			public void actionPerformed(ActionEvent e) {
		    	// 내가 만든 다이얼로그 보여주기
		    	MyDialog.showMyDialog(frame);
			}
		});
		btnICustomDlg.setFont(new Font("굴림", Font.ITALIC, 20));
		btnICustomDlg.setBounds(12, 267, 348, 73);
		frame.getContentPane().add(btnICustomDlg);
		
		btnMyFrame = new JButton("Custom Frame");
		btnMyFrame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JFrame을 상속받는 객체 보여주기
				MyFrame.showMyFrame();
			}
		});
		btnMyFrame.setFont(new Font("굴림", Font.ITALIC, 20));
		btnMyFrame.setBounds(12, 350, 348, 73);
		frame.getContentPane().add(btnMyFrame);
	}

}
