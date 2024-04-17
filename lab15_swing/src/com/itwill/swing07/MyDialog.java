package com.itwill.swing07;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MyDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JPanel buttonPanel;
	private JButton cancelButton;
	private JButton okButton;
    private Component ss;
	/**
	 * Launch the application.
	 */
	public static void showMyDialog(Component parentComponent){
		try {
			
			MyDialog dialog = new MyDialog(parentComponent);
//		dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE); // DISPOSE : 자기 창만 닫것다
		//	dialog.setLocationRelativeTo(parentComponent);  중앙에 배치
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public MyDialog(Component parentComponent) {
		this.ss = parentComponent;
		initilaize();
	}

	private void initilaize() {
		// 다이얼로그의 좌표(x,y)와 크기(width, height)
		setBounds(100, 100, 450, 300);
		// setBounds의 (x, y) 좌표를 무시하고 항상 스크린의 가운데에 위치
		//setLocationRelativeTo(null);
		
		
		// setBounds의 (x, y) 좌표를 무시하고 부모 컴포넌트에 상대적으로(부모의 가운데 위치)
		// 아규먼트가 null인 경우에는 화면 중앙에 배치
		setLocationRelativeTo(ss);
		

		// 다이얼로그의 닫기 버튼(x)의 기본 동작을 설정:
		// DISPOSE_ON_CLOSE: 현재 다이얼로그만 닫고, 메인 프로세스는 계속 실행.
		// EXIT_ON_CLOSE: 현재 다이얼로그와 함께 메인 프로스세까지 종료
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

		// getConrentpane(): 컨텐트 영역 & 버튼 영역
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(12, 10, 101, 15);
		contentPanel.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(12, 55, 328, 68);
		contentPanel.add(textArea);

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		getContentPane().add(buttonPanel, BorderLayout.SOUTH);

		okButton = new JButton("OK");
		okButton.setFont(new Font("굴림체", Font.BOLD | Font.ITALIC, 20));
		okButton.setActionCommand("OK");
		buttonPanel.add(okButton);
		getRootPane().setDefaultButton(okButton);

		cancelButton = new JButton("Cancel");
		cancelButton.setFont(new Font("굴림체", Font.BOLD | Font.ITALIC, 20));
		cancelButton.setActionCommand("Cancel");
		buttonPanel.add(cancelButton);

	}
}
