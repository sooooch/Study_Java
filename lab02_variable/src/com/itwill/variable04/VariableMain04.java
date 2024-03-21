package com.itwill.variable04;

public class VariableMain04 {

	public static void main(String[] args) {
		// 문자(character) 타입 변수 char
		// char 타입: 문자 1개의 유니코드 값(2바이트 정수)를 저장하는 타입.
		// 문자는 작은따옴표를 사용('a'),문자열은 큰따옴표를 사용("abc")
		// int 4바이트 ,long 8바이트
		char ch1 = 'B';
		//int x = 'A';   // 65
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		// char는 문자의 유니코드를 저장하는 특별하 종류의 정수 타입.
		// -> 사칙연산이 가능. 크기 비교도 가능.
		
		char ch2 = (char) (ch1 + 1);
		
		char ch3 = (char) (ch1 - 1);
		
		System.out.println(ch2);
		System.out.println(ch3);
		
		//1. 변수는 같은 타입의 값만 저장할 수 있음.
		//2. 큰 범위의 타입에는 작은 범위 타입의 값을 저장할 수 있음.
		// int -> long -> float -> double (자동 형변환)
		//3. 작은 범위의 타입에 큰 범위 값을 저장하려고 하면 에러가 발생.
		// double - > float -> long -> int (수동 형변환)
		//4. 정수 리터럴(literal, 상수)은 범위를 넘지 않으면 byte, short, char에 저장 가능
		//    (ex) = short s = 1;   -> (short) 없이 바로 가능
		// 강제 타입 변환(casting):변수의 타입을 강제로 바꿈 ( 큰 값을 작은 값에 넣을때 사용 )
		//    (ex) = (char) 같은거

		
		
		int i = 1; i = -2;
		System.out.println(i);
		
		
		double x = 1;
		System.out.println(x);
		
		}

}
