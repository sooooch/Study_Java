package com.itwill.list05;

import java.util.ArrayList;

public class ListMain05 {

	public static void main(String[] args) {
		// Member 타입 객체들을 저장하는 ArrayList를 선언, 초기화
		ArrayList<Member> members = new ArrayList<>();
		
		// members에 원소들을 저장
		members.add(new Member("admin","1111"));
		members.add(new Member("guest", "guest"));
		members.add(new Member("itwill", "0410"));
		members.add(new Member("TEST", "test"));
		members.add(new Member("guest", "0000"));
		
		// 향상된 for 문장을 사용해서 members의 원소들을 출력
		for (Member x : members) {
			System.out.println(x);
		}

		// 회원 아이디에 "est"가 포한된 회원 정보를 다른 리스트에 저장하고, 출력
		// 영문저의 대/소문자는 구분하지 않음
		ArrayList<Member> est = new ArrayList<>();
		for (Member x : members) {
			if (x.getId().toLowerCase().contains("est")) {
				est.add(x);
			}
		}
		System.out.println(est);
		
		// members에서 첫번째로 등장하는 id가 "guest"인 회원 삭제
//		for (int i = 0; i < members.size(); i++) {
//			if (members.get(i).getId().equals("guest")) {
//				members.remove(i);
//				break;
//			}
//		}
//		
		
		members.remove(new Member("guest",null));
		System.out.println(members);
		
	}

}
