package com.company.basic008_polymorphism;

/*
 * Q1. 상속도
 * Q2. 사용가능한 멤버변수/함수
 * 
 * Object
 *   ↑
 * Parent1	(x=100, method() - Parent Method)
 *   ↑
 * Child1	(x=200, method() - Child Method)
 */

class Parent1{
	int x = 100;
	void method() { System.out.println("Parent Method"); }
}
class Child1 extends Parent1{
	int x = 200;
	void method() { System.out.println("Child Method"); }
}

public class A002_basic_Q2 {
	public static void main(String[] args) {
		Parent1 p1 = new Child1();
		// Q3. Parent1 p1 보장하는 범위
		// A3. Parent1	(x=100, method() - Parent Method)
		
		// Q4. 인스턴스화 했을 때 사용가능한 범위 : new Child1()
		// A4. Parent p1;	Child1	(x=200, method() - Child Method)---Parent1(x=100,----------)
		// 오버라이딩되어 Parent1의 method()는 스킵
		
		// Q8.	=	부모,자식 체크 / 업캐스트, 다운캐스팅 / 타입캐스팅 필요여부
		// A8. 부모 : Parent1 / 자식 : Child1
		Child1 c1 = new Child1();
		
		System.out.println("p1.x = "+ p1.x);	// Q5. 출력되는 내용 => 100
		p1.method();			// Q6. 출력되는 내용 => Child Method
		System.out.println("c1.x = "+ c1.x);	// Q7. 출력되는 내용 => 200
		c1.method();			// Q8. 출력되는 내용 => Child Method
		
	}
}
