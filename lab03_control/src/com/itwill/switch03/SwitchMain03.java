package com.itwill.switch03;

public class SwitchMain03 {

	public static void main(String[] args) {
		// switch-case 구문에서 enum 사용 방법
		// 오류를 줄여줌
		
		
	   Rsp choise = Rsp.ROCK;
	   
	   switch (choise) {
	   case PAPER:
		   System.out.println("보");
		   break;
	   case ROCK:
		   System.out.println("바위");
		   break;
	   case SCISSORS:
		   System.out.println("가위");
		   break;
	   
	   }
	}

}
