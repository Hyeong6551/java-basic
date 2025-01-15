package com.company.basic005;

public class A001_basic3 {
	public static void myInt(int i) {
		System.out.println(i);
	}
	
	public static void goFloat(float f) {
		System.out.println(f);
	}
	
	public static void plus(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		myInt(1);
		myInt(3);
		myInt(4);
		
		goFloat(1.1f);
		goFloat(10);
		goFloat('a');
		
		plus(1,2);
		plus(10,3);
	}
}
