package com.itwill.inner01;

public class EnclosingCls {
	
	
	public static int var = 1;     // 정적 객체
	private int x;           // 인스턴스 객체
	
	
	public EnclosingCls(int x) {
		this.x = x;
	}
	
	public static void test()	{
		System.out.println(" var = " + var);
	//	System.out.println(x);  = static 객체가 아니라서
	}

	@Override
	public String toString() {
		return String.format("EnclosingCls(x=%d, var=%d)", x, var);
	}
	
	// static 내부 클래스(중첩 클래스)
	public static class NestedCls {
		private int x;
		
		
		public  NestedCls(int x) {
			this.x =x;
		}
		
		
		public void info()	{
			System.out.println("--- NestedCls ---");
			System.out.println("x = " + x);  // 중첩 클래스의 필드
			System.out.println("var = " + var); // 외부 클래스의 static 필드
		//	System.out.println(EnclosingCls.this.x); - > static 내부 클래스(중첩 클래스)에서는 외부 클래스의 static 멤버만 사용 가능하고 최부 클래스의 non-static 멤버들은 사용할 수 없음
		}
		
		
		
		
	}

}
