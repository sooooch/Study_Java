package com.itwill.loop;

import java.util.Random;

public class LoopMain {

	public static void main(String[] args) {

		// 정수(int) 5개를 저장할 수 있는 배열을 선언하고, 기본값으로 초기화.
		// 배열에 0 이상 10 이하의 난수 5개를 저장.
		// 배열 원소들 중 최댓값을 찾아서 출력.
		// 배열 원소들 중 최솟값을 찾아서 출력.
		int[] array = new int[5];
		Random rand = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int x : array) {
			System.out.print(x + " ");
		}

		System.out.println();
		int max = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j] > max) {
				max = array[j];
				/*
				 * for (int = x : array) { 
				 *   if ( x > max ) { 
				 *     max =x; 
				 *   } 
				 * }
				 */
			}
		} 
		System.out.println("최댓값 = " + max);
		int min = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j] < min) {
				min = array[j];

			}
		}
		System.out.print("최솟값 = " + min);
	}

}
