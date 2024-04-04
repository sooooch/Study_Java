package com.itwill.exception03;

import java.util.Scanner;

public class ExceptionMain03 {

	private final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		ExceptionMain03 app = new ExceptionMain03();
		
	
		
		int x = app.inputInteger();
		System.out.println("x = " + x);
		
		int y = app.inputInteger2();
		System.out.println(y);
	}
	
	public int inputInteger2()	{
		try {
			System.out.print("정수 입력> ");
			return Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수로 입력하세요.....");
			return inputInteger2();
		}
	}
	

	private int inputInteger() {
		int result = 0;
		
		while (true)	{
			try {
				System.out.print("정수 입력 : ");
				result = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("정수만 적으시오");
			}
			
		}
		
		
		return result;
	}

}
