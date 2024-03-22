package com.itwill.array07;

public class ArrayMain07 {

	public static void main(String[] args) {
		// 문자열 1차원 배열
		String[] leSserafim = { "채원", "사쿠라", "윤진", "카즈하", "은채" };
		String[] newJeans = { "혜인", "혜린", "민지", "하니", "다니엘" };
		String[] bts = { "정국", "뷔", "RM", "지민", "슈가", "제이홉", "진" };

		// 문자열 2차원 배열
		String[][] idols = { leSserafim, newJeans, bts };

		for (int i = 0; i < idols.length; i++) {
			for (int j = 0; j < idols[i].length; j++) {
				System.out.print(idols[i][j] + " ");

			}
			System.out.println();
		}
		System.out.println();

		for (String[] group : idols) {
			for (String name : group) {
				System.out.print(name + "\t");
			}

			System.out.println();
		}

	}

}
