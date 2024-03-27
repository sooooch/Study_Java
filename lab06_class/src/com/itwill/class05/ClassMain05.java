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

		System.out.println("111111111111111111111111");

		Random rand = new Random();

		int x = rand.nextInt(101);
		int x1 = rand.nextInt(101);
		int x3 = rand.nextInt(101);
		int x4 = rand.nextInt(101);
		Subject subject2 = new Subject(x, x1, x3, x4);

		Student student1 = new Student(123, "수창", subject2);

		student1.info();
		System.out.println("2222222222222222222222");
		subject2.info();

		System.out.println("33333333333333333333333");
		// 기본 생성자를 사용해서 Student 타입의 객체를 생성
		Student student2 = new Student();
		student2.info();

		System.out.println("44444444444444444444444");
		// Student 생성자 (3)을 사용해서 객체 생성
		Student student3 = new Student(10,"오쌤",10,20,30,25);
		student3.info();
	}

}
