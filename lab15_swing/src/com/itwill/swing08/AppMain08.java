package com.itwill.swing08;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain08 {
	private static final String[] COLUMM_NAMES = { "국어", "영어", "수학", "총점", "평균" };


	
	
	
	
	private JFrame frame;
	private JTextField textKorean;
	private JLabel lblKorean;
	private JTextField textEnglish;
	private JTextField textMath;
	private JLabel lblEnglish;
	private JLabel lblMath;
	private JScrollPane scrollPane;
	private JButton btnEnter;
	private JTable table;
	private DefaultTableModel model;
	private JButton btnDelete;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain08 window = new AppMain08();
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
	public AppMain08() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 647, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblKorean = new JLabel("국어 점수");
		lblKorean.setFont(new Font("궁서체", Font.ITALIC, 20));
		lblKorean.setBounds(12, 10, 120, 64);
		frame.getContentPane().add(lblKorean);

		textKorean = new JTextField();
		textKorean.setBounds(178, 10, 395, 64);
		frame.getContentPane().add(textKorean);
		textKorean.setColumns(10);

		lblEnglish = new JLabel("영어 점수");
		lblEnglish.setFont(new Font("궁서체", Font.ITALIC, 20));
		lblEnglish.setBounds(12, 93, 120, 64);
		frame.getContentPane().add(lblEnglish);

		textEnglish = new JTextField();
		textEnglish.setColumns(10);
		textEnglish.setBounds(178, 93, 395, 64);
		frame.getContentPane().add(textEnglish);

		lblMath = new JLabel("수학 점수");
		lblMath.setFont(new Font("궁서체", Font.ITALIC, 20));
		lblMath.setBounds(12, 186, 120, 64);
		frame.getContentPane().add(lblMath);

		textMath = new JTextField();
		textMath.setColumns(10);
		textMath.setBounds(178, 186, 395, 64);
		frame.getContentPane().add(textMath);

		btnEnter = new JButton("입력");
		btnEnter.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				inputScoreToTable();
			}
		});
		btnEnter.setForeground(SystemColor.activeCaption);
		btnEnter.setFont(new Font("궁서체", Font.ITALIC, 25));
		btnEnter.setBounds(12, 262, 156, 74);
		frame.getContentPane().add(btnEnter);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 350, 567, 276);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		table.setBackground(SystemColor.desktop);
		model = new DefaultTableModel(null, COLUMM_NAMES);

		table.setFont(new Font("궁서체", Font.ITALIC, 14));
		table.setModel(model);
		table.setForeground(SystemColor.info);
		scrollPane.setViewportView(table);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteScoreFromTable();
				
			}
		});
		btnDelete.setForeground(SystemColor.activeCaption);
		btnDelete.setFont(new Font("궁서체", Font.ITALIC, 25));
		btnDelete.setBounds(423, 262, 156, 74);
		frame.getContentPane().add(btnDelete);
	}

	private void deleteScoreFromTable() {
		// JTable에서 선택된 행의 인덱스를 찾음
		int index = table.getSelectedRow();
		if (index == -1) { // 테이블에서 선택된 행이 없을 때
			JOptionPane.showMessageDialog(frame, "테이블에서 삭제할 행을 먼저 선택하세요", "경고", 2);
		return;
		}
		int confirm = JOptionPane.showConfirmDialog(frame, "정말 삭제?","삭제 확인",JOptionPane.YES_NO_CANCEL_OPTION);
		if (confirm == 0) {
			model.removeRow(index);
		}
	}

	private void inputScoreToTable() {
		// 1. JTextField에서 3과목의 점수를 읽음
		int korean = 0;
		int english = 0;
		int math = 0;
		try {
			 korean = Integer.parseInt(textKorean.getText());
			 english = Integer.parseInt(textEnglish.getText());
			 math = Integer.parseInt(textMath.getText());
		} catch (NumberFormatException e) {
			// 메시지 다이얼로그 띄우기
			JOptionPane.showMessageDialog(frame, "정수를 입력하시오", "경고", 0);
			return;
		}
		
		// 2. Score 타입 객체를 생성
		Score score = new Score(korean, english, math);
		
		// 3. JTable에 행(row)을 추가
		Object[] row = {
				score.getKorean(),
				score.getEnglish(),
				score.getMath(),
				score.getTotal(),
				score.getMean()
		};
		model.addRow(row);
		
		// 4. JTextField의 내용을 모두 지움
		clearAllTextFields();
		
	}
	
	
	private void clearAllTextFields() {
		textKorean.setText("");
		textEnglish.setText("");
		textMath.setText("");
	}
}
