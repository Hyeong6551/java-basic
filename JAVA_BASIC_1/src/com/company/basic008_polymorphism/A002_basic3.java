package com.company.basic008_polymorphism;

/*
 * Object				
 *   ↑					  
 *  TestAAA (int a=10/toString())		 
 * 	 ↑   
 *  TestBBB (int b=20/toString())
 */
class TestAAA extends Object{
	int a=10;
	public TestAAA() { super(); }
	@Override public String toString() { return "TestAAA [a=" + a + "]"; }
}

class TestBBB extends TestAAA{
	int b=20;
	public TestBBB() { super(); }
	@Override public String toString() { return "TestBBB [b=" + b + "]"; }
}
public class A002_basic3 {
	public static void main(String[] args) {
		TestAAA ta = new TestAAA();	
		// 1-1. TestAAA ta;		TestAAA (int a=10/toString()) 보장
		// 1-2. 		ta[1000번지] = new[1000번지] TestAAA (int a=10/toString())
		
		TestBBB tb = new TestBBB();	
		// 2-1. TestBBB tb;		TestBBB (int b=20/toString())---TestAAA (int a=10/toString()) 보장
		// 2-1. 		tb[2000번지] = new[2000번지] TestBBB (int b=20/toString())---TestAAA (int a=10/-----)
				
		//Q1. 누가 부모자식? 부모=자식 / 업캐스팅, 다운캐스팅? / 타입캐스팅 필요?
		ta = tb;
		// ta 	TestAAA (int a=10/toString()) 보장
		// tb[2000번지] = new[2000번지] TestBBB (int b=20/toString())---TestAAA (int a=10/toString())
		 
		System.out.println(ta);		// TestBBB[b=20]
		
		//Q2. ta.b 했을 때 사용가능하게 만들기
		System.out.println(ta.a +"/"+((TestBBB)ta).b);
		
	}
}
