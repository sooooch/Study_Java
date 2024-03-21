package com.itwill.loop11;

public class LoopMain11 {

	public static void main(String[] args) {
		// Ex1. 1부터 10까지 자연수들의 합을 계산하고 출력
		// 1 + 2 + 3 + ... + 9 + 10 = 55

		int x = 1;
		int sum = 0;
		while (x <= 10) {

			sum += x;
			x++;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);

		// Ex2. 1부터 100까지 자연수들 중에서 짝수들의 합을 계산하고 출력.
		 x = 0;
		sum = 0;
		while (x <= 100) {

			sum += x;
			x += 2;
		}
		System.out.println(sum);

		sum = 0;
		for (int i = 0; i <= 100; i += 2) {
			{
				sum += i;
			}

		}
		System.out.println(sum);

		// Ex3. 1 ~ 100 까지 홀수들의 합
		x = 1;
		sum = 0;
		while (x <= 100) {

			sum += x;
			x += 2;
		}
		System.out.println(sum);
		sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}

		}
		System.out.println(sum);
	}

}
