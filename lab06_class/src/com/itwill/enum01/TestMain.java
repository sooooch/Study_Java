package com.itwill.enum01;

public class TestMain {
	
	
	public static void main(String[] args) {
		int season = 33;
		switch (season){
		case Season1.SPRING:
			System.out.print("봄 입니다");
			break;
		case Season1.FALL:
			System.out.print("가을 입니다");
			break;
		case Season1.SUMMER:
			System.out.print("여름 입니다");
			break;
		case Season1.WINTER:
			System.out.print("겨울 입니다");
			break;
			default:
				System.out.print("이상이상이상");
			break;
		}
		
		Season2 season2 = Season2.SPRING;
		if (season2 == Season2.SPRING) {
			System.out.println("봄");
		}else if (season2 == Season2.SUMMER) {
			System.out.println("여름");
		}else {
			System.out.println("...");
		}
		
		
		Season3 season3 = Season3.SPRING;
		System.out.println(season3);
		System.out.println(season3.getName());
	}

}
