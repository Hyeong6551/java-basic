package com.company.basic010_nonameclass;

interface Inter1{ void method(); }	//public abstract
class Inter1Impl implements Inter1{		// 한번만 쓰고 버릴거면 이런형식으로 쓸 필요없음
	@Override
	public void method() {
		System.out.println("done!");
	}
	
}

public class A002_basic {
	public static void main(String[] args) {
		System.out.println("1. 인터페이스 상속구현객체");
		Inter1Impl a1 = new Inter1Impl();	a1.method();
		
		System.out.println("2. 익명이너클래스");
		//Inter1 a2 = new Inter1();	// void method 에서 구현 부분이 없어서 불가능
		Inter1 a2 = new Inter1() {	
			@Override
			public void method() {
				System.out.println("test");
			}		// 테스트 목적, 잘안쓰는 부분, 이벤트 횟수가 적을 때 익명클래스 사용
		};	a2.method();
	}
}
