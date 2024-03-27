package com.itwill.class04;

public class ClassMain04 {

	public static void main(String[] args) {
		// 기본생성자를 사용해서 Ractangle 객체 생성, 메소드 호출
		Rectangle r2 = new Rectangle();
		System.out.println("r2:" + r2);
		System.out.println("r2 넓이 = " + r2.area());
		System.out.println("r2 둘레 = " + r2.perimeter());
		
		
		
		
		
		System.out.println("========================");
		
		
		
		
		
		Rectangle r1 = new Rectangle(4.8,7.4);
		System.out.println("r1:" + r1);
		System.out.println("r1의 가로 = " + r1.width);
		System.out.println("r1의 세로 = " + r1.height);
		
		
		System.out.println("r1 넓이 = " + r1.area());
		System.out.println("r1 둘레 = " + r1.perimeter());
		
		
		r1 = new Rectangle(7.4,4.8);
		System.out.println("r1 = " + r1);
		
	}

}
