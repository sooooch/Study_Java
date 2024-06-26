package com.itwill.modifier03;

/*
 * 데이터 캡슐화(encapsulation):
 * 필드들을 private으로 선언해서 클래스 외부레서는 보이지 않도록(직접 접근할 수 없도록) 감추고,
 * 대신에 필요한 경우에 한해서 public으로 공개한 메서드를 제공해서
 * 간접적으로 필드들의 값을 읽거나 수정하는 것을 허용하는 객체지향 프로그래밍 기법
 * 데이터의 보안과 무결성을 유지하기 위해서 캡슐화를 사용.
 * getter 메서드: private 필드의 값을 리턴하는 메서드  아규먼트 x 리턴 0
 * setter 메서드: private 필드의 값을 변경하는 메서드  파라미터 0 리턴 void
 */




public class ModifierMain03 {

	public static void main(String[] args) {
		// Member 타입 객체 생성
		
		Member member = new Member("weee","1234");
		
		System.out.println("ID : " + member.getMemberId());
		System.out.println("변경 전 PW = " + member.getMemberPassword());
		
		member.setMemberPassword(null);
		System.out.println("변경 후 Pw = " + member.getMemberPassword());
		
		System.out.println("================================");
		
		Person person = new Person("박수창",22);
			
		System.out.println("이름: " + person.getName());
		System.out.println("나이: " + person.getAge());
		
		person.setAge(31);
		System.out.println("찐나이: " + person.getAge());
		

	}
	
	
	

}
