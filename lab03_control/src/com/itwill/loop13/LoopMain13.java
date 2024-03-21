package com.itwill.loop13;

public class LoopMain13 {

	public static void main(String[] args) {
		for (int x = 0; x < 4; x++) { // 교재 183p 연습문제5
			for (int y = 0; y < x + 1; y++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("===========================");

		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= 4; y++) {
				if (y <= 4 - x) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// -------------------------------------------
		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 3 - x; y++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= x; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// --------------------------------------------
		for (int x = 1; x <= 4; x++) {
			for (int y = 4; y >= 1; y--) {
				if (y > x) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		// ----------------------------------------
		for (int x = 1; x <= 4; x++) {
			for (int y = 1; y <= 4 - x; y++) {
				System.out.print(" ");
			}
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
