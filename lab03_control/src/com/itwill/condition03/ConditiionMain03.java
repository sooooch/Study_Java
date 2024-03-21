package com.itwill.condition03;

import java.util.Scanner;

public class ConditiionMain03 {

	public static void main(String[] args) {
		// Scanner 타입의 변수를 선언, 초기화
		// 콘솔 창에서 Java 과목 점수를 입력받고 저장.
		// 콘솔 창에서 SQL 과목 점수를 입력받고 저장.
		// 콘솔 창에서 JavaScript 과목 점수를 입력받고 저장.
		// 세 과목의 총점(점수)을 계산하고 출력.
		// 세 과목의 평균(소수점 까지 계산)을 계산하고 출력.
		// 세 과목 평균이 90점 이상이면, "A"
		// 세 과목 평균이 80점 이상이면, "B"
		// 세 과목 평균이 70점 이상이면, "C"
		// 세 과목 평균이 70점 미만이면, "F" 라고 출력.
        
        
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Java 과목 점수를 입력하세요 : ");
		int javaScore = sc.nextInt();
		
		System.out.print("SQL 과목 점수를 입력하세요 : ");
		int sqlScore = sc.nextInt();
		
		System.out.print("JavaScript 과목 점수를 입력하세요 : ");
		int javascriptScore = sc.nextInt();
		
		int total = javaScore + sqlScore + javascriptScore;
		
	   System.out.println("세 과목의 총점 = " + total);
	   
	    float avg = (float)total / 3;   // total을  float으로 타입 변환 후 /3을 하라
	    
	    System.out.println("세 과목의 평균 = " + avg);
	    
	    if (avg >= 90) {
	    	System.out.println("등급 : A");
	    } else if (avg >= 80) {
	    	System.out.println("등급 : B");
	    } else if (avg >= 70) {
	    	System.out.println("등급 : C");
	    }	else  {
	    		System.out.println("등급 : F");
	    	}
	    
	}

}
