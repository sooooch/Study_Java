package com.itwill.map03;

import java.util.HashMap;

public class MapMain03 {

	public static void main(String[] args) {
		// 단어 개수 세기
		// 문자열에 등장하는 단어를 key로 하고,단어가 문자열에 등장하는 횟수 value로 하는  Map 객체를 만들고 출력
		
		String sentence = "짜장면 짬뽕 짜장면 짜장면 볶음밥 김치찌개 부대찌개 김치찌개 된장찌개";
		// -> 결과: {짜장면=2, 짬뽕=1, 볶음밥=1, 김치찌개=2, 부대찌개=1, 된장찌개=1}
		
		
		String[] names = sentence.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String x : names) {
			Integer count = map.getOrDefault(x, 0);
			map.put(x, count + 1);
			
			System.out.println(map);
		}
		
		System.out.println("----------");
		HashMap<String, Integer> wordCounts2 = new HashMap<String, Integer>();
		for (String w : names) {
			Integer count = wordCounts2.get(w);
			if (count != null) {
				wordCounts2.put(w,  count + 1);
			} else {
				wordCounts2.put(w, 1);
			}
			System.out.println(wordCounts2);
		}
		
		

	}

}
