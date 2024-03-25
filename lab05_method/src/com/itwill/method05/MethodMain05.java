package com.itwill.method05;

public class MethodMain05 {

	public static void main(String[] args) {
		// TODO 메서드 호출, 그 결과를 출력
		// sum 메서드 호출, 결과 출력

		int[] array = { 1, 3, 5, 10 };
		int total = sum(array);
		double avg = mean(array);
		int max = max(array);
		int min = min(array);

		System.out.println("total = " + total);
		System.out.println("avg = " + avg);
		System.out.println("max = " + max);
		System.out.print("min = " + min);
	}

	/**
	 * sum. 아규먼트로 전달받은 정수들의 1차원 배열의 모든 원소들의 합을 리턴
	 * 
	 * @param array 정수들의 1차원 배열(int[])
	 * @return 배열 원소들의 합
	 */
	public static int sum(int[] array) {

		int result = 0;
		for (int x : array) {

			result += x;

		}
		return result;
	}

	/**
	 * mean 아규먼트로 전달받은 정수들의 1차원 배열 원소들의 평균(소수점까지)을 리턴
	 * 
	 * @param arry 정수들의 1차원 배열
	 * @return arry원소들의 평균을 double 타입으로 리턴
	 */
	public static double mean(int[] array) {

		double result = (double)sum(array) / array.length; 

		

		return result;
	}
	

	/**
	 * max 아규먼트로 전달받은 정수들의 1차원 배열 원소들 중 최댓값을 리턴
	 * 
	 * @param array 정수들의 1차원 배열
	 * @return array 원소들 중 최댓값
	 * 
	 */
	public static int max(int[] array) {

		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}

		}
		return max;
	}

	/**
	 * min 아규먼트로 전달받은 정수들의 1차원 배열 원소들 중 최솟값을 리턴
	 * 
	 * @param array 정수들의 1차원 배열
	 * @return array 원소들 중 최솟값
	 */
	public static int min(int[] array) {

		int result = array[0];

		for (int x : array) {
			if (x < result) {
				result = x;
			}
		}
		
		return result;
	}

}