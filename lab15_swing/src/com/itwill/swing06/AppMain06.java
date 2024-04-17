package com.itwill.swing06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class AppMain06 {

	private JFrame frame;
	private JRadioButton rbPrivate;
	private JRadioButton rbPackage;
	private JRadioButton rbProtected;
	private JRadioButton rbPublic;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JCheckBox cbAbstract;
	private JCheckBox cbFinal;
	private JCheckBox cbStatic;
	private JComboBox<String> comboBox;
	private JButton btnInfo;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JRadioButton aaa;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain06 window = new AppMain06();
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
	public AppMain06() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 646, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		rbPrivate = new JRadioButton("private");
		rbPrivate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
			}
		});
		rbPrivate.setSelected(true);
		buttonGroup.add(rbPrivate);
		rbPrivate.setFont(new Font("굴림체", Font.ITALIC, 18));
		rbPrivate.setBounds(8, 6, 114, 41);
		frame.getContentPane().add(rbPrivate);
		
		rbPackage = new JRadioButton("package");
		rbPackage.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				handleRadioButtonClick(e);
				
			}
		});
		buttonGroup.add(rbPackage);
		rbPackage.setFont(new Font("굴림체", Font.ITALIC, 18));
		rbPackage.setBounds(137, 6, 114, 41);
		frame.getContentPane().add(rbPackage);
		
		rbProtected = new JRadioButton("protected");
		rbProtected.addActionListener((e) -> handleRadioButtonClick(e));
		buttonGroup.add(rbProtected);
		rbProtected.setFont(new Font("굴림체", Font.ITALIC, 18));
		rbProtected.setBounds(392, 6, 114, 41);
		frame.getContentPane().add(rbProtected);
		
		rbPublic = new JRadioButton("public");
		rbPublic.addActionListener(this::handleRadioButtonClick);
		// AppMain06.this::handleRadioButtonClick
		buttonGroup.add(rbPublic);
		rbPublic.setFont(new Font("굴림체", Font.ITALIC, 18));
		rbPublic.setBounds(266, 6, 114, 41);
		frame.getContentPane().add(rbPublic);
		
		
		
		
		cbAbstract = new JCheckBox("abstract");
		cbAbstract.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				handleCheckBoxClick(e);
				
			}
		});
		cbAbstract.setFont(new Font("굴림체", Font.ITALIC, 18));
		cbAbstract.setBounds(8, 75, 114, 59);
		frame.getContentPane().add(cbAbstract);
		
		cbFinal = new JCheckBox("final");
		cbFinal.addActionListener((e) -> handleCheckBoxClick(e));
		cbFinal.setFont(new Font("굴림체", Font.ITALIC, 18));
		cbFinal.setBounds(130, 75, 114, 59);
		frame.getContentPane().add(cbFinal);
		
		cbStatic = new JCheckBox("static");
		cbStatic.addActionListener(this::handleCheckBoxClick);
		cbStatic.setFont(new Font("굴림체", Font.ITALIC, 18));
		cbStatic.setBounds(255, 75, 114, 59);
		frame.getContentPane().add(cbStatic);
		
		comboBox = new JComboBox<>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkComboBox(e);
			}
		});
		comboBox.setFont(new Font("굴림체", Font.ITALIC, 15));
		final String[] emails = {"naver.com", "gmail.com", "kakao.com", "yahoo.com"};
		final DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>(emails);
		comboBox.setModel(model);
		comboBox.setBounds(8, 144, 336, 32);
		frame.getContentPane().add(comboBox);
		
		btnInfo = new JButton("확인");
		btnInfo.addActionListener((ActionEvent e) -> handleButtonClick());
		btnInfo.setFont(new Font("굴림체", Font.ITALIC, 15));
		btnInfo.setBounds(359, 144, 129, 32);
		frame.getContentPane().add(btnInfo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(8, 225, 523, 233);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("굴림체", Font.ITALIC, 25));
		scrollPane.setViewportView(textArea);
	}

	private void  handleButtonClick() {
		// JTextArea에 출력할 문자열들을 붙여 나갈(append) 문자열 버퍼
		StringBuffer buffer = new StringBuffer();
		
		
		// 어떤 라디오 버튼이 선택됐는 지
		if (rbPrivate.isSelected()) {
			buffer.append(rbPrivate.getText());
		
		} else if (rbPackage.isSelected()) {
			buffer.append(rbPackage.getText());
			
		} else if (rbPublic.isSelected()) {
			buffer.append(rbPublic.getText());
			
		} else  {
			buffer.append(rbProtected.getText());
			
		}
		buffer.append(" 라디오버튼 선택됨.\n");
		
		
		// 어떤 체크박스(들)이 선택됐는 지
		if (cbAbstract.isSelected()) {
			buffer.append(cbAbstract.getText()).append(" ");
		} 
		if (cbFinal.isSelected()) {
			buffer.append(cbFinal.getText()).append(" ");
		}
		if (cbStatic.isSelected()) {
			buffer.append(cbStatic.getText()).append(" ");
		}
		buffer.append("체크박스 선택됨.\n");
		
		// 콤보박스에서 선택된 아이템
		Object selectedItem = comboBox.getSelectedItem();
		
		buffer.append(selectedItem).append(" 콤보박스 아이템 선택됨.\n");
		
		
		
		// 문자열 버퍼의 내용을 JTextArea에 씀.
		textArea.setText(buffer.toString());
		
	}

	protected void checkComboBox(ActionEvent e) {
		@SuppressWarnings("unchecked")
		JComboBox<String> combo = (JComboBox<String>) e.getSource();
		
		// 콤보박스에서 선택된 아이템 찾기
	int index =	combo.getSelectedIndex();
	String item = (String) combo.getSelectedItem();
	
	 // JTextAtea에 정보 출력
	textArea.setText(index + ": " + item);
	
		
	}

	protected void handleCheckBoxClick(ActionEvent e) {
		JCheckBox jb = (JCheckBox) e.getSource();
		String text = jb.getText();
		boolean selected = jb.isSelected();
		textArea.append(text + ": " + selected + "\n");
		
	}

	private void handleRadioButtonClick(ActionEvent event) {
		// 4개 라디오버튼들 중에서 누가 클릭 됐는지 찾기:
	JRadioButton rb = (JRadioButton) event.getSource();
	
	String text = rb.getText(); // 이벤트가 발생한 라디오버튼의 텍스트
	boolean selected = rb.isSelected(); // 이벤트가 발생한 라디오버튼의 선택 여부
	textArea.setText(text + ": " + selected);
	
	

	
	
		
	}
}
