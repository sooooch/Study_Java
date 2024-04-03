package com.itwill.controller;

import com.itwill.model.Member;

// MVC 아키텍쳐에서 컨트롤러 역할을 담당할 클래스 - > 싱글턴으로 구현
public class MemberDaoImpl implements MemberDao {

	private static final int MAX_LENGTH = 0;

	// --------Singleton 구현
	private static MemberDaoImpl instance = null;

	private MemberDaoImpl() {
	}

	public static MemberDaoImpl getInstance() {
		if (instance == null) {
			instance = new MemberDaoImpl();
		}
		return instance;
	}
	// ---------Singleton 구현

	// 회원 정보를 저장할 배열 선언
	private Member[] members = new Member[MAX_LANGTH];

	// 회원 배열에 현재까지 저장된 원소의 개수 - > 새로운 회원 정보를 저장할 위치(배열 인덱스)
	private int count = 0; // 배열에 원소가 추가될 때마다 ++.

	@Override
	public int create(Member member) {
		int a = MAX_LANGTH + 1;
		if (count < MAX_LANGTH) {
			members[count] = member;
			count++;
			return 1;
		} else {
			return a;
		}
	}

	@Override
	public Member[] read() {
		// 배열 members에 null이 아닌 원소들로만 이루어진 배열을 리턴
		if (members != null) {

		}
		return members;
	}

	@Override
	public Member read(int index) {
		if (0 <= index && index < MAX_LENGTH) {

			return members[index];

		} else {
			return null;
		}
	}

	@Override
	public int update(int index, String password) {
		if (0 <= index && index < MAX_LENGTH && members[index] != null) {
			members[index].setPasswoed(password);
			return 1;
		} else {
			return 0;
		}

	}
}
