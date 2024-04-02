package com.itiwill.inheritance08;

public class Rectangle extends Shape {

	// field
	private double width;
	private double height;
	
	// constructor
	public Rectangle(double width, double height) {
		super("직사각형");
		this.width = width;
		this.height = height;
	}
	
	

	@Override
	public double area() {    // 넓이
		
		return width * height;
	}

	@Override
	public double perimeter() {   //둘레
		
		return (width + height) * 2;
	}

}
