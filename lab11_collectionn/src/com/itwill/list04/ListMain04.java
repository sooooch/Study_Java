package com.itwill.list04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMain04 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("java", "sql", "html", "css", "javascript", "servlet", "jsp", "spring");

		// 1. names에서 5글자 이상인 문자열을 대문자로 변환해서 저장하는 ArrayList를 만들고 출력.
		ArrayList<String> fiveNames = new ArrayList<String>();
		for (String x : names) {
			if (x.length() >= 5) {
				String a = x.toUpperCase();

				fiveNames.add(a);
				                                  // fivaNames.add(x.toUpperCase());
			}
		}
		System.out.println(fiveNames);
//       
//        // -> [JAVASCRIPT, SERVLET, SPRING]
//
//        // 2. names에 저장된 문자열의 글자수들을 저장하는 ArrayList를 만들고 출력.
//        // -> [4, 3, 4, 3, 10, 7, 3, 6]
		ArrayList<Integer> numberCharacters = new ArrayList<>();
		for (String a : names) {
			int x = a.length();                                   				

			numberCharacters.add(x);            
		}
		System.out.println(numberCharacters);

		List<Integer> codes = Arrays.asList(0, 1, 0, 1, 1, 0);

		// 3. codes의 원소가 0이면 "남성", 1이면 "여성"을 저장하는 ArrayList를 만들고 출력.
		ArrayList<String> menOrWomen = new ArrayList<String>();
		for (Integer i : codes) {
			if (i == 0) {                                  //menOrWomen.add((i == 0) ? "남성" : "여성");

				menOrWomen.add("남성");

			} else {
				menOrWomen.add("여성");
			}

		}
		System.out.println(menOrWomen);
	}
}
