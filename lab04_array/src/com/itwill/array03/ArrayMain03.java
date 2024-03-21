package com.itwill.array03;

import java.util.Random;

public class ArrayMain03 {

	public static void main(String[] args) {
		// 성적처리 프로그램
		// 성적은 난수로 만들고 배열에 저장. 배열에 저장된 점수들의 합계와 평균을 출력.
		// Random 타입 변수 선언 & 초기화
		// int 타입 5개를 저장할 수 있는 배열(score)을 선언 & 기본값으로 초기화
		// for문을 사용해서 5개의 정수 난수를 배열에 저장 0 ~ 10
		// 향상된 for 문을 사용해서 배열에 저장된 모든 점수들을 출력
		// 배열의 모든 원소들의 합계를 계산하고 출력
		// 배열의 원소들의 평균을 계산하고 출력

		Random rand = new Random();
		int sum = 0;
		int score[] = new int[5];

		for (int x = 0; x < score.length; x++) {
			score[x] = rand.nextInt(11);
			System.out.print(score[x] + " ");
		}
		for (int i : score) {

			sum += i;

		}
		System.out.println();
		System.out.println(sum);
		System.out.print(sum / 5);  //double mean = (double) sum / score.length;

	}

}
