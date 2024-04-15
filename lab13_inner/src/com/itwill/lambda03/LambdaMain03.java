package com.itwill.lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class LambdaMain03 {

	public static void main(String[] args) {
		// Stream 클래스 & 메서드

		Random rand = new Random();

		ArrayList<Integer> numbers = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			numbers.add(rand.nextInt(100));
		}
		System.out.println(numbers);

	// numbers의 원소들 중에서 짝수들만 선택(필터링)한 새로운 리스트를 만들고출력
		ArrayList<Integer> sss = new ArrayList<>();
	for(Integer x:numbers) {
		if (x % 2 == 0) {
			
			sss.add(x);
		}
	}
	System.out.println(sss);
	
	
	List<Integer> evens2 = numbers.stream().filter((x) -> x % 2 == 0).toList();
	System.out.println(evens2);
	
	// Stream을 사용해서, numbers의 원소들 중에서 홀수들만 선택한 리스트를 만들고 출력
	
	List<Integer> aaad = numbers.stream().filter((x) -> x % 2 == 1 ).toList();
	System.out.println(aaad);
	
	// Stream을 사용해서, numbers의 원소들의 제곱을 저장하는 리스트를 만들고 출력    
	List<Integer> squares = numbers.stream().map((x) -> x * x).toList();
	System.out.println(squares);
	
	// Stream을 사용해서, numbers의 원소들중 홀수들의 제곱을 저장하는 리스트를 만들고 출력
	List<Integer> squares1 = numbers.stream().filter((x) -> x % 2 == 1).map((x) -> x * x).toList();
	
	System.out.println(squares1);
	

	
	
	List<String> languages = Arrays.asList("java","javascript","python","c","kotlin","swift");
	
	
	// languages의 원소들 중 문자열 길이 5글자 이상인 원소들의 리스트
	
	List<String> five = languages.stream().filter((x) -> x.length() >= 5).toList();
	
	System.out.println(five);
	
	
	// languages의 문자열을 댜뮨자로 변환한 르스트
	
	List<String> five1 = languages.stream().map((x) -> x.toUpperCase()).toList();
	System.out.println(five1);
	
	// languages의 원소들 중 길이 5글자 이상인 문자열을 대문자로 변환한 리스트
	
	
	List<String> five12 = languages.stream().map((x) -> x.toUpperCase()).filter((x) -> x.length() >= 5).toList();
	System.out.println(five12);
	
	
	/*
	 * 
	 * 람다: (파라미터선언) -> 리턴값
	 *
	 * 메서드 참조를 사용한 람다 표현식
	 * (1) 람다가 아규먼트를 1개만 갖고,
	 *  람다의 리턴값이 그 아규먼트에서 "파라미터가 없는 메서드"를 호출한 경우:
	 *   x -> x.toUpperCase()
	 *   String::toUpperCase
	 * 
	 * (2) 람다가 아규먼트를 1개만 갖고,
	 * 람다의 구현부가 메서드 1개 호출이고, 그 메서드가 람다의 아규먼트를 전달받는 경우:
	 */
	
	languages.forEach((x) -> System.out.println(x));
	languages.forEach(System.out::println);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
