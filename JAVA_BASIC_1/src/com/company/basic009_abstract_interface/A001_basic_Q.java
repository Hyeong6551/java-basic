package com.company.basic009_abstract_interface;

abstract class Shape{
	abstract void showArea(int i, int j);
	abstract void showArea(int k);
}

class Rectangle extends Shape{
	@Override
	void showArea(int i, int j) {System.out.println("사각형의 넓이 : "+(i*j));}

	@Override
	void showArea(int k) { };
}

class Circle extends Shape{

	@Override
	void showArea(int i, int j) {}

	@Override
	void showArea(int k) {System.out.println("원의 넓이 : " +(k*k*Math.PI));}
	
}

class Triangle extends Shape{
	@Override
	void showArea(int i, int j) {System.out.println("삼각형의 넓이 : "+(i*j)/2);}

	@Override
	void showArea(int k) {}
}

public class A001_basic_Q {
	public static void main(String[]args) {
		Rectangle rec = new Rectangle();
		rec.showArea(10,10);
		Triangle tri = new Triangle();
		tri.showArea(10, 10);
		Circle cir = new Circle();
		cir.showArea(10);
	}
}
