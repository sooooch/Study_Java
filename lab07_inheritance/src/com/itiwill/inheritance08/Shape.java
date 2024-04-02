package com.itiwill.inheritance08;

public abstract class Shape {
    	// field
	protected String type;
	
	
		// constructor
	public Shape(String type) {
		this.type = type;
	}
	
	
	// 추상 메서드
	public abstract double area(); // 도형의 넓이를 리턴하는 메서드.
	public abstract double perimeter();  // 도형의 둘레 길이를 리턴하는 메서드

    // final 메서드: 하위클래스에서 재정의(override)를 할 수 없는 메서드
	public final void draw() {
		String info = String.format("%s[넓이=%f,둘레=%f]\n",type,area(),perimeter());
		
		System.out.print(info);
	}
}
