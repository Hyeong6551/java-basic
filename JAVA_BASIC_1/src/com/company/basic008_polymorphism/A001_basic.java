package com.company.basic008;

// 1. 클래스는 부품객체
// 2. 클래스는 상태와 행위
// 3. 상속은 클래스를 재사용할 목적으로 사용
// 4. Object 상속 - alf + shift + s (기본생성자)
/*
 * 	Object
 * 	  ↑
 *    A1
 * 	  ↑
 * 	  B1
 * 	  ↑
 *    C1
 * 
 */


class A1 extends Object{ int a; public A1() { super(); } }
class B1 extends A1	   { int b;  public B1() { super(); } }		// ctrl + alt + j
class C1 extends B1 {	// ctrl + shift + f
	int c;
	public C1() { super(); }
	public void show() { System.out.println(a+"/"+b+"/"+c); }
}

public class A001_basic {
	public static void main(String[] args) {
		C1 c0 = new C1();	c0.c = 30;	c0.show();
		// 1. new 메모리, 객체 생성 (heap)
		// 2. 생성자 호출 순서  = C1() → B1() → A1() → Object();
		// 3. c0 = 1번지 (stack)
		
		// 객체 생성 순서 Object() → A1() → B1() → C1()
	}
}

/*  
3. C1  c0 = new C1(); 
-----------------------------------
[method: 정보, static, final] A1, B1, C1, public A001_basic
-----------------------------------
[heap:동적]       |[stack: 잠깐빌리기]
	 	Object() { #4 } #5 틀 만들기		Object 틀을 사용할 수 있게 만듦
	 a0 	A1() { #3 } #6 a 사용가능		인스턴스 변수 초기화 해 사용가능 하게
	 b0	 	B1() { #2 } #7 b 사용가능		인스턴스 변수 초기화 해 사용가능 하게
1번지 c0 		C1() { #1 } #8 c 사용가능		인스턴스 변수 초기화 해 사용가능 하게
                 |	main
-----------------------------------
*/