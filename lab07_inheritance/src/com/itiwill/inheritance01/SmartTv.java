package com.itiwill.inheritance01;

// 스마트TV은 기본TV를 확장(상속)한다
// 상위 (super) , 부모, 기본(base) 클래스
// 하위 (sub), 자식, 유도(derived) 클래스
// 모든 클래스의 최상위 클래스는 java.lang.Object 클래스
//  상위클래스가 Object인 경우 extends Objetc 생략가능
public class SmartTv extends BasicTv {   // 자식(하위)클래스 extends 부모(상위)클래스

	
	//private String ip;
	
	public void webBrowsing() {
		System.out.println("인터넷 연결");
	}
	
}
