package com.itwill.singleton;

public enum Singleton {
INSTANCE; // public static final Singleton INSTANCE = new Singleton();
	
	private String name;
	
	
	// enum 타입의 생성자는 private 만 가능. private 수식어는 생략가능
	Singleton() {
		this.name = "헐크";
	}
	
	public String getname() {
		return this.name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
}
