package com.itwill.modifier01;

public class AccessExample {
	// field
	private int a; // 클래스 범위
	int b; // 패키지 범위
	protected int c; //상속
	public int d;   //프로젝트 범위에서 어디서든 보여진다
	
	public AccessExample(int a, int b, int c, int d) {
		this.a =a;
		this.b = b;
		this.c = c;
		this.d = d;
		
	}
	
	// method
	public void info() {
		System.out.printf("a=%d,b=%d,c=%d,d=%d\n",a, b, c, d);
	}

}
