package com.company.basic014_lambda;

interface Inter004{ int method(int a,int b); }
interface Inter004_1{ int method(String str); }
interface Inter004_2 { void InputNum(int num); }

public class A001_basic4 {
	public static void main(String[] args) {
		// #1. Inter004를 호출하면 Math.max(a,b) 큰값 처리
		Inter004 i4 = (a,b) -> Math.max(a, b);
		System.out.println(i4.method(10,3));
		
		// #2 :: 참조식
		Inter004 i44 = Math::max;
		System.out.println(i44.method(10, 3));
		
		////	::
		Inter004_1 ex1 = String::length;
		System.out.println(ex1.method("ABC"));
		
		
		////	::
		Inter004_2 num1 = a -> System.out.println(a);
		num1.InputNum(101);
		
		Inter004_2 num2 = System.out::println;
		num2.InputNum(101);
	}
}
