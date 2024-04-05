package com.itwill.controller;

import com.itwill.model.Member;

// MVC 아키텍쳐에서 컨트롤러 역할을 담당할 클래스 - > 싱글턴으로 구현
public class MemberDaoImpl implements MemberDao {

	

	private static final int MAX_LENGTH = 3;

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
 
	//  public int getCount() {return count;}   이렇게하면 메인에서 프라이빗 카운트 사용가능
	
	
	
	public  boolean isMemoryFull() {      // count 를 사용하기 위해서 만들었음
		return (count == MAX_LENGTH);
	}
	
	
	
	@Override
	public int create(Member member) {
		
		if (count < MAX_LANGTH) {
			members[count] = member;
			count++;
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public Member[] read() {
		// 배열 members에 null이 아닌 원소들로만 이루어진 배열을 리턴
		Member[] result = new Member[count];
		for (int i = 0; i < count; i++)	{
			result[i] = members[i];
		}
		return result;
	}

	@Override
	public Member read(int index) {
		if (0 <= index && index < count) {

			return members[index];

		} else {
			return null;
		}
	}

	@Override
	public int update(int index, String password) {
		if (0 <= index && index < count && members[index] != null) {
			members[index].setPasswoed(password);
			return 1;
		} else {
			return 0;
		}

	}
}
