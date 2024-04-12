package com.itwill.inner01;

public class OuterCls {

	private int x;
	private int y;
	private String s;
	
	
	public OuterCls(int x, int y, String s) {
		this.x = x;
		this.y = y;
		this.s = s;
	}
	
	
	public int getX() 	{
		return x;
	}
	
	@Override	
	public String toString()	{
		return String.format("OuterCls(x=%d, y=%d, s=%s)",x,y,s);
	}
	
	// static이 아닌 멤버 내부 클래스
	public class InnerCls {
		private int y;
		
		public InnerCls(int y) {
			this.y = y;
		}
		
		public void info() {
			System.out.println("--- InnerCls ---");
			System.out.println("y = " + y);		// 내부 클래스 객체를 사용 변수는 가까운 곳 부터 찾는다
			System.out.println("x = " + x);     // 외부 클래스 객체를 사용
			System.out.println("OuterCls y = " + OuterCls.this.y);    // 내부 = 외부 필드 이름이 같을때 외부 클래스의 y를 사용하는법
			System.out.println("s = " + s);
		}
		
		
	}
	
}
