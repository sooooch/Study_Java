package com.itwill.loop04;

public class LoopMain04 {

	public static void main(String[] args) {

		for (int n = 1; n <= 100; n++) {
			int x = n % 10;
			int y = n / 10;
			boolean condition1 = x == 3 || x == 6 || x == 9;
			boolean condition2 = (y == 3) || (y == 6) || (y == 9);

			if (condition1 && condition2) {
				System.out.print("**\t");
			} else if (condition1 || condition2) {
				System.out.print("*\t");
			} else {
				System.out.print(n + "\t");
			}

			if (n % 10 == 0) {
				System.out.println();

			}
		}

	}

}
