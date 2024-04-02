package com.itwill.interface02;

public class InterfaceMain_02 {

	 public static void main(String[] args) {
		// Test 인터페이스의 public으로 공개된 멤버 사용
		 System.out.println(Test.VERSION);
		 Test.staticMethod();
		 
		 // Test 인터페이스의 구현 객체 생성 & 메서드 호출
		 Test t = new TestImpl(); // 다형성: SuperType var = new SubType();
		 t.test();
		 t.defaultMethod();
	 }
}
