package com.itwill.variable05;

public class VariableMain05 {

	public static void main(String[] args) {
		// boolean 타입: true/false 만을 저장할 수 있는 데이터 타입.
		// 비교 연산, 논리 연산의 결과 값이 boolean 타입.
		// 비교 연산자: ==,<=, >=, !=, <, >
		// 논리 연산자:&&, ||, ! 
		int x = 2;
		int y = 3;          //대입 연산자
		 
		boolean b1 = x != y;    // 연산자 우선순위에 의하여 가능, 가독성을 위해서 () 사용하면 좋긴함.
		System.out.println(b1);
		
		boolean b2 = (x > y);
		System.out.println(b2);
		
		boolean b3 = (x >0) && (x <10);
		System.out.println(b3);
		
		
		

	}

}
