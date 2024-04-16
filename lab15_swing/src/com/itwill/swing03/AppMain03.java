package com.itwill.swing03;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppMain03 {

	private static final String[] images = { "images/image01.jpg", "images/image02.jpg", "images/image03.jpg",
			"images/image04.jpg", "images/image05.jpg"

	};

	private int curIndex;
	private JFrame frame;
	private JLabel lblImage;
	private JButton btnPrev;
	private JButton btnNext;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain03 window = new AppMain03();
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
	public AppMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblImage = new JLabel(new ImageIcon(images[curIndex]));
		lblImage.setBounds(90, 69, 404, 400);
		frame.getContentPane().add(lblImage);
		
		btnPrev = new JButton("<");
		btnPrev.addActionListener(new ActionListener() { // 익명(내부) 클래스
			
			@Override  // 이전 버튼이 클릭됐을때 할 일
			public void actionPerformed(ActionEvent e)  {
				
				if (curIndex > 0) {
					
					curIndex --;
					
				} else {
					curIndex = images.length - 1;
				}
					lblImage.setIcon(new ImageIcon(images[curIndex]));
					lblNewLabel.setText(images[curIndex]);
				
			}

		
	
		});
		btnPrev.setFont(new Font("굴림", Font.BOLD, 20));
		btnPrev.setBounds(90, 479, 60, 36);
		frame.getContentPane().add(btnPrev);
		
		btnNext = new JButton(">");
		
		// 람다 표현식을 사용한 이벤트 리스너 등록
		btnNext.addActionListener((e) ->  showNextImage());

	

btnNext.setFont(new Font("굴림",Font.BOLD,20));
btnNext.setBounds(434,479,60,36);
frame.getContentPane().add(btnNext);
lblNewLabel = new JLabel(images[curIndex]);
lblNewLabel.setBounds(196, 475, 188, 50);
frame.getContentPane().add(lblNewLabel);}

	private void showNextImage() {
		if ( curIndex < images.length - 1) {
			curIndex ++;
		} else {
			curIndex = 0;
		}
		lblImage.setIcon(new ImageIcon(images[curIndex]));
		lblNewLabel.setText(images[curIndex]);
	}}
