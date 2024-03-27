package com.itwill.class05;

public class Student {
	 // field
    int id; // 학생 번호
    String name; // 학생 이름
    Subject subject; // 수강 과목
    
    // TODO 생성자: (1)기본 생성자. (2)아규먼트를 갖는 생성자.
    // TODO 메서드: 학생의 정보(번호, 이름, 각 과목의 점수, 총점, 평균)를 출력.
    // (1)기본 생성자.
    // 타입 기본값: 
    public Student()	 {
    	
    }
    
    public Student(int id,String name,Subject subject) {
    	this.id = id;
    	this.name = name;
    	this.subject = subject;
    }
    
    public void info() {
    	System.out.println("번호 : " + id);
    	System.out.println("이름 : " + name);
    	System.out.println("국어 : " + subject.korean + "영어 : " + subject.english + "수학 : " + subject.math + "과학 : " + subject.science );
    	System.out.println("총점 : " + subject.total());
    	System.out.println("평균 : " + subject.avg());
    	
    }
    
}
