package com.company.basic008_polymorphism;

/*
 * Object				
 *   ↑					  
 *  TestAA (int a)		 
 * 	 ↑   ↓
 *  TestBB (int b)
 */
class TestAA extends Object{
	int a=10;
	public TestAA() { super(); }
	@Override public String toString() { return "TestAA [a=" + a + "]"; }
}

class TestBB extends TestAA{
	int b=20;
	public TestBB() { super(); }
	@Override public String toString() { return "TestBB [b=" + b + "]"; }
}
public class A002_basic2 {
	public static void main(String[] args) {
		TestAA ta = new TestAA();		// 본인 = new 본인();
		// 1-1. TestAA ta 사용할 수 있어야하는 범위 TestAA(int a)
		// 1-2. ta[1000번지] = [1000번지] TestAA{ a=10 }
		System.out.println(ta);		// TestAA [a=10]
		
		ta = new TestBB();				// 부모 = new 자식();
		// 2-1. ta 사용할 수 있어야하는 범위 TestAA(int a)
		// 2-2. ta[2000번지] = [2000번지] TestBB {b=20/toString}---TestAA{a=10/-------}
		// 2-3. ta(부모자료형) = 자식생성자	// 업캐스팅 => 타입캐스팅 X
		System.out.println(ta);		// TestBB [b=20]
		
		TestBB tb = (TestBB)ta;		// 타입캐스팅
		// 3-1. TestBB tb	사용할 수 있는 범위 {b=20/toString}---TestAA{a=10/-------}
		// 3-2. 실제 만들어진 객체-인스턴스화
		//		ta[2000번지] = [2000번지] TestBB {b=20/toString}---TestAA{a=10/-------}
		// 3-3. 자식 = 부모				// 다운 캐스팅 => 타입캐스팅 O
		System.out.println(tb);
		
	}
}
