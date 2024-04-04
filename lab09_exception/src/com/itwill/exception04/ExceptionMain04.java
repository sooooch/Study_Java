package com.itwill.exception04;

/*
 * 예외 클래스들의 상속 관계:
 * Object
 * |__ Throwable
 * 		|__ Exception
 *    		|__ RunthimeException
 *     			|__AritmeticException, NumberFormatException, NullPointerException,...
 *     
 *  catch 블록이 여러개인 경우, 하위 타입의 예외 타입을 먼저 catch하고,
 *  상위 타입의 예외를 나중에 catch해야함
 */
public class ExceptionMain04 {

	public static void main(String[] args) {
		
		try {
			
		} catch(ArithmeticException e) {
			
		} catch (Exception e) {
			//다형성: SuperType var = new SubType();
			//Exception 클래스를 상속하는 모든 종류의 예외를 잡을 수 있음
		}
		
		
		
		
		// finally: 에외 상황 발생 여부와 상관 없이 항상 실행되는 블록
		// try 또는 catch 블록에 return 문장이 있어도,
		// finally 블록이 실행된 후에 return 문장이 실행됨.
		
		
		try {
			int x = 100;
			int y = 12;
			System.out.println("몫 = " + (x / y));
			System.out.println(" end try");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("end catch");
			return;
		} finally {
			System.out.println("언제 출력 될까요?");
		}
		
		System.out.println("문장이 끝납니다");
	}

}
