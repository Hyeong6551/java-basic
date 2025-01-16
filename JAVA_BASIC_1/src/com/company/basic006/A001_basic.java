package com.company.basic006;

// 1. 클래스는 부품객체
// 2. 클래스는 속성과 행위

class A1{}

public class A001_basic {
	public static void main(String[] args) {
		A1 a = new A1();
		System.out.println(a);
	}
}

/* 3. (memory) A1 a = new A1();
-------------------------------------
[method : 정보, static, final]  A1, Class001
-------------------------------------
[heap : 동적]		| [step : 잠깐빌리기]
	A1[]		←	a
				| main
-------------------------------------
*/