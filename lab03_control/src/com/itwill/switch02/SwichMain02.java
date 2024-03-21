package com.itwill.switch02;

import java.util.Random;

public class SwichMain02 {

	public static void main(String[] args) {
		// Random 타입의 변수를 선언하고, 초기화
		Random random = new Random();

		// 정수 타입의 변수에 1 ~ 4 정수 난수 1개를 저장

		int code = random.nextInt(1, 5);
		System.out.println("code = " + code);

		switch (code) {

		case 1:
		case 3:
			System.out.println("남자");
			break;

		case 2:
		case 4:
			System.out.println("여자");
			break;

		}

	}

}
