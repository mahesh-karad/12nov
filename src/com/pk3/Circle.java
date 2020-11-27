package com.pk3;

public class Circle extends Shape {

	public static void main(String[] args) {
	Shape s= new Circle();
	s.fun();
	}

	@Override
	public void area() {
	System.out.println("circle area");
		
	}

}
