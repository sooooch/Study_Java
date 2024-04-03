package com.itwill.interface03;

class A {
}

class B {
}

class C extends A {
} // 클래스 C는 클래스 A를 확장(상속)
//class D extends A,C {} // 다중 상속 - 자바는 클래스의 다중 상속을 허용하지 않음  

interface I {
}

interface J {
}

class E implements I {
} // 클래스 E는 인터페이스 I를 구현

class F implements I, J {
} // 클래스가 구현하는 인터페이스의 개수는 제한이 없음

class G extends B implements I {
} // 클래스 G는 클래스 B 를 확장하고, 인터페이스 I 를 구현

interface K extends I, J {
} // 인터페이스 K는 인터페이스 I와 J를 확장. 인터페이스는 다중 상속이 가능

//interface L extends A {} //인터페이스는 클래스를 확장 ㄴㄴ


interface Clickable {
	void click(); // public abstract

}

interface Scrollable {
	void scroll();
}

class Mouse implements Clickable, Scrollable {

	@Override
	public void scroll() {
		System.out.println("마우스 휠 스크롤");

	}

	@Override
	public void click() {
		System.out.println("마우스 클릭");

	}

}

public class InterfaceMain03 {

	public static void main(String[] args) {
		
		 Mouse m1 = new Mouse();
		 m1.scroll();
		 System.out.println("");
		 
		 Clickable m2 = new Mouse();
		 m2.click();
//		 m2.scroll(); - clickable 타입 정의가 되어있지 않음
		((Scrollable)m2).scroll();    // 타입변환  캐스팅 하면 scroll 메서드 사용가능
		((Mouse)m2).scroll();         // 타입변환  캐스팅 하면 scroll 메서드 사용가능
		
		 

	}

}
