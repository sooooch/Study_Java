package com.itwill.condition07;

import java.util.Random;

public class ConditionMain07 {

	public static void main(String[] args) {
		// 조건문, 비교/논리 연산자 연습
		
		// 난수(random number)를 생성할 수 있는 타입의 변수를 선언, 초기화.
		Random rand = new Random();
		
		// rand.nextInt(x): 0이상 x보다 작은 정수 난수를 반환.
		// rand.nexrInt(x, y): x 이상 y 미만의 정수 난수를 반환.
		
		int java = rand.nextInt(101);   
		System.out.println("Java: " + java);
		
		int sql = rand.nextInt(101);   
		System.out.println("Sql: " + sql);
		
		int javascript = rand.nextInt(101);   
		System.out.println("JavaScript: " + javascript);
	
		
		// 세 과목이 모두 40점 이상이고, 평균이 60점 이상이면 "합격",
		// 그렇지 않으면 "불합격" 출력
		// 총점 계산:
		int total = java + sql + javascript;
		float avg = (float)total/3;
         String x =  (java >= 40 && sql >=40 && javascript >= 40 && avg >=60) ? "합격" : "불합격";
         System.out.println("총점 : " + total);
         System.out.println("평균 값 : " + avg);
         System.out.println(x);         
	}

}
