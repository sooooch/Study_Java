package com.itiwill.inheritance08;

public class Circle extends Shape {
	

	// feild
	private double radius;
	
	
	
	public Circle(double radius) {
		super("원");
		this.radius = radius;
		
	}



	@Override
	public double area() {
		
		return Math.PI * radius * radius ;
	}



	@Override
	public double perimeter() {
		
		return 2 * 3.14 * radius;
	}
	
	

	
	
	
	
	
	
	
}
