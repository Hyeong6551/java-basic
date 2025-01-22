package com.company.basic008_polymorphism;

class AA1 extends Object{
	int a;
}

class BB1 extends AA1{
	int b;
}

class CC1 extends BB1{
	int c;
	public void showC() {
		System.out.println("상속받은 A클래스의 a : " + a);
		System.out.println("상속받은 B클래스의 b : " + b);
		System.out.println("상속받은 C클래스의 c : " + c);
	}
}
public class A001_basic_Q4 {
	public static void main(String[] args) {
		// Q1 클래스를 상속하는 이유 : 부모 클래스에게 불려받아 원하는 형식대로 수정하여 재사용하기 위해서
		// Q2 상속의 형식 : class aaa extends Object (Object 생략가능)
		// Q3 
		CC1 my = new CC1();
		my.a=10;my.b=20;my.c=30;my.showC();
		
	}
}
