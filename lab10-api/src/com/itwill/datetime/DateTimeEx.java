package com.itwill.datetime;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTimeEx {

	public static void main(String[] args) {
		// Java 8 버전부터 새로 생긴 java.time 패키지의 날짜/시간 클래스

		LocalDate today = LocalDate.now(); // static 메서드
		System.out.println(today); // LocalDate toString이 오버라이딩 돼있어서 날짜가 바로 나옴

		System.out.println(today.getYear()); // instance 메서드
		System.out.println(today.getMonthValue());
		System.out.println(today.getDayOfMonth());
		System.out.println(today.getMonth());
		System.out.println(today.getDayOfWeek());
		System.out.println(today.plusMonths(5));
		System.out.println();
		
		LocalDate today2 = today.plusMonths(5);
		System.out.println(today2);
		System.out.println(today2.plusDays(5));
		System.out.println(today2.minusDays(2));
		
		LocalDate Birthday = LocalDate.of(2000, 12, 31);
		System.out.println(Birthday);
		LocalDate.of(2000, Month.DECEMBER, 2);
		System.out.println(Birthday);
		
		
		LocalDateTime now = LocalDateTime.now();
		
		System.out.println(now);
		System.out.println(now.getHour());
		
		LocalDateTime time = LocalDateTime.of(2024,3,14,9,30,0);
		System.out.println(time);
		
		// Timestamp:1970-01-01 00:00:00를 기준으로 해서 1/1000초 (milli-second) 마다
		// 1씩 증가하는 정수(long 타입)를 기반으로 날짜와 시간 정보를 저장하는 클래스(타입)
		
		
		// LocalDateTime --> Timestamp 변환
		Timestamp ts = Timestamp.valueOf(now);
		System.out.println(ts);
		System.out.println(ts.getTime());
		
		// Timestamp --> LocalDateTime 변환
		LocalDateTime dt= ts.toLocalDateTime();
		System.out.println(dt);
		
	}

}
