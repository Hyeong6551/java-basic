package com.company.basic014_lambda;

// Lambda
/* 1. 클래스는 부품객체 - 설계도
 * 2. 상태/행위		  interface ( public static final / public abstract)
 * 3. 코드를 간결하게	  
 */
interface Inter1{ 	void method();	}
class Inter1Impl implements Inter1{

	@Override
	public void method() {
		System.out.println("Good Morning");
	}
	
}

public class A001_basic {
	public static void main(String[] args) {
		// #1. interface 구현 객체 만들기
		Inter1 a1 = new Inter1Impl(); 	a1.method();
		
		// #2. 익명이너클래스
		Inter1 a2 = new Inter1() {
			@Override
			public void method() {
				System.out.println(":a");
			}};
		a2.method();
		
		// #3. Lambda
		Inter1 a3 = () -> { System.out.println("-^o^-"); };
		a3.method();
	}
}
