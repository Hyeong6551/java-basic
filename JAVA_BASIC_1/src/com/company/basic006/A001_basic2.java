package com.company.basic006;

import java.util.Scanner;

// 1. 클래스는 부품객체
// 2. 클래스는 속성과 행위

class Animal001 {
	// 속성-멤버변수(클래스)
	String name;
	int age;
	// 행위-멤버함수
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("::이름입력 > ");
		name = sc.next();
		System.out.print("::나이입력 >");
		age = sc.nextInt();
	}
	
	void show() {
		System.out.println(":".repeat(20));
		System.out.printf("::이름 : %s\n::나이 : %d",name,age);
	}
}

public class A001_basic2 {
	public static void main(String[] args) {
		// 1. new (heap 공간빌리기) 1000번지
		// 2. Animal001()	name = null, age=0 초기화셋팅
		// 3. a1 = 1000번지
		Animal001 a1 = new Animal001();
		a1.input();
		a1.show();
	}
}

/* 3. (memory) A1 a = new A1();
-------------------------------------
[method : 정보, static, final]  A1, Class001
-------------------------------------
[heap : 동적]		| [step : 잠깐빌리기]
1000번지 Animal001{name: null, age:0}		←	a1 (1000번지)
1000번지 Animal001{name: "abc", age:23}	←	a1.input() (1000번지 따라가서 input)
1000번지 Animal001{name: "abc", age:23}	←	a1.show() (1000번지 따라가서 show)
				| main
-------------------------------------
*/