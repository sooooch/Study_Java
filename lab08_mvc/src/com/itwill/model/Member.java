package com.itwill.model;

// MVC(Model-View-Controller) 아키텍쳐에서 모델 역할을 담당하는 클래스. 데이터 클래스
// VO(Value Object),DTO(Data Transfer Object)
public class Member {
	// field
	private String id;
	private String password;

	// 생성자
	public Member() {
	} // 오버로딩
		// 오버로딩

	public Member(String id, String password) {
		this.id = id;
		this.password = password;

	}

	// 메서드
	public String getId() {
		return id;
	}

	public String getPasswoed() {
		return password;
	}

	public void setPasswoed(String passwoed) {
		this.password = passwoed;
	}
	
	@Override
	public String toString()	{
		return "Member(id=" + id + ", password=" + password + ")";
	}



}
