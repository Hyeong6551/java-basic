package com.company.basic014_lambda;

interface inter2_1{ void hi(); }
interface inter2_2{ void hi(int a); }
interface inter2_3{ int hi(); }
interface inter2_4{ int hi(int a); }

public class A001_basic2 {
	public static void main(String[] args) {
		// #1. Inter2_1 - 한줄짜리면 {} 생략 가능
		inter2_1 a1 = () -> System.out.println("hello");
		a1.hi();
		
		inter2_2 a2 = (int a) -> System.out.println("안녕 ".repeat(a)); 
		a2.hi(10);
		
		inter2_3 a3 = () -> { return 3; };
		System.out.println( a3.hi() );  //3
		
		inter2_4 a4 = a -> 10*a;
		System.out.println(a4.hi(3));
	}
}
