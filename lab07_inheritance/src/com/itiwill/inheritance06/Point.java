package com.itiwill.inheritance06;

// 2차원 평면의 점의 좌표를 표현
public class Point {
	// field
	private int x;
	private int y;

	// constructor

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override // Object의 클래스에서 상속받은 toString() 재정의
	public String toString() {
		// TODO Auto-generated method stub
		return "Point(x=" + x + ", y=" + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;

		if (obj instanceof Point) {
			Point pt = (Point) obj;
			result = (this.x == pt.x) && (this.y == pt.y);

		}
		return result;
	}
	
	@Override // Object 클래스의 hashCode() 메소드를 재정의
	public int hashCode() {
		return x + y;
	}

}
