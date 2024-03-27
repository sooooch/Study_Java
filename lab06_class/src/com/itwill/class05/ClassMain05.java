package com.itwill.class05;

import java.util.Random;

public class ClassMain05 {

	public static void main(String[] args) {
		// TODO Subject, Student 클래스 객체 생성과 메서드 호출 결과 테스트.

		// 기본생성자를 사용해서 Subject 타입의 객체 생성
		Subject subject1 = new Subject();
		System.out.println("국어 = " + subject1.korean);
		System.out.println("영어 = " + subject1.english);
		System.out.println("수학 = " + subject1.math);
		System.out.println("과학 = " + subject1.science);
		System.out.println("총점 = " + subject1.total());
		System.out.println("평균 = " + subject1.avg());
		
		System.out.println("=============================");
		
		Random rand = new Random();

		int x = rand.nextInt(101);
		int x1 = rand.nextInt(101);
		int x3 = rand.nextInt(101);
		int x4 = rand.nextInt(101);
		Subject subject2 = new Subject(x, x1, x3, x4);

		Student student = new Student(123, "수창", subject2);

		student.info();
		subject2.info();

	}

}
