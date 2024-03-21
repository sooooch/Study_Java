package com.itwill.loop08;

public class LoopMain08 {

	public static void main(String[] args) {
		// while 반복문
		// for문은 블록이 끝나면 사용x while은 메인
		
		
		System.out.println("----- [1] -----");
		int n = 1;
		while (n <= 5) {
			System.out.print(n + " ");
			n++; // n += 1;  n = n + 1;
			
		}
		System.out.println();
		System.out.println(n);   //while문이 끝나서 n = 6
		
		
		System.out.println("----- [2] -----");
		// 5 4 3 2 1 출력
		int i = 5;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
		System.out.println("----- [3] -----");
		// 1 3 5 7 9 출력
		int x = 1;
		while (x < 10) {
			System.out.print(x + " ");
			x += 2;
		}
		System.out.println();
		
		
		n = 1;
		while (n < 10) {
			if(n % 2 == 1) {
				System.out.print(n + " ");
			}
			n++;
		}
		System.out.println();
		
		System.out.println("----- [4] -----");
		//while문을 사용해서 구구단 9단을 출력
		
		x = 9;
		int y = 1;
		while (y < 10) {
			System.out.printf("%d x %d = %d\n",x,y,x*y);
			y++;
		}
		
	}

}
