package com.itwill.loop07;

public class LoopMain07 {

	public static void main(String[] args) {
		// 과제: 구구단 출력하기
		// 2단은 2x2 3단은 3x3 4단은 4x4 ....9단까지
		// (1) break 이용하기
		// (2) break 이용x
		for (int x = 2; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				System.out.println(x + " x " + y + " = " + ( x * y));     // System.out.printf("%d x %d = %d\n", x, y, x * y);
				if (x == y) {
					
					break;
				}
			
				

			}
		}
		
		for (int x = 2; x < 10; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.printf("%d x %d = %d\n",x ,y ,x * y);
			}
				
		}
		
	}
}