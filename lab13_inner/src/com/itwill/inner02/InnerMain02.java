package com.itwill.inner02;

import com.itwill.inner02.Book.BookBuilder;

public class InnerMain02 {

	public static void main(String[] args) {
		// Book 타입 객체 생성
		Book book1 = new Book("철도원 삼대", "황석영", "창비");
		System.out.println(book1);
		
		
		
		Book book2 = new Book("일론 머스크", "월터 아이작슨", "21세기북스");
		System.out.println(book2);
		
		Book book3 = new Book("월터 아이작슨", "일론 머스크", "21세기북스");
		System.out.println(book3);
		
		
		Book book4 = Book.buider().author("신용권").publisher("한빛").title("혼공자").build();  //메서드를 연쇄 호출
		System.out.println(book4);
		
		
		Book book5 = Book.buider().title("혼공자").build();
		System.out.println(book5);
		
		Book book6 = Book.buider().author("신용권").build();
		System.out.println(book6);
		
		
	
	} 

}
