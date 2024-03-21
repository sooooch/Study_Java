package com.itwill.loop09;

public class LoopMain09 {

	public static void main(String[] args) {
		// 중첩 while 문장을 사용해서 구구단 1단 ~ 12단 까지 출력
		int x = 1;
		while (x <= 12) {
			int y = 1;
			while (y <= 12) {
				System.out.println(x + " x " + y + " = " +  x * y);
				
				y++;
			}
				x++;
		}

	}

}
