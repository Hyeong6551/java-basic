package com.company.basic008;

/*
 * Object				
 *   ↑					  
 *  TestA4 (int a=10/toString())		 
 * 	 ↑   
 *  TestB4 (int b=20/toString())
 */
class TestA4 extends Object{
	int a=10;
	public TestA4() { super(); }
	@Override public String toString() { return "Test4 [a=" + a + "]"; }
}

class TestB4 extends TestA4{
	int b=20;
	public TestB4() { super(); }
	@Override public String toString() { return "Test4 [b=" + b + "]"; }
} 
public class A002_basic4 {
	public static void main(String[] args) {
		TestA4 ta = new TestA4();
		// TestA4 ta;	TestA4 (int a=10/toString())	보장
		// ta[1000번지] = TestA4 (int a=10/toString())	
		
		TestB4 tb = new TestB4();
		// TestB4 tb;	TestB4 (int b=20/toString())---TestA4 (int a=10/-----)	보장
		// tb[2000번지] = TestB4 (int b=20/toString())---TestA4 (int a=10/-----)
		System.out.println("ta : "+ta);
		
		// Q1. 오류가 나는 이유?
		// 부모=자식이 아닌 자식=부모 관계이다.
		// 자식은 부모를 담을 수 없기에 다운캐스팅을 해야함 (타입캐스팅)
		
		ta = new TestB4();
		
		tb = (TestB4)ta;	// 단독으로 실행 시 오류  java.lang.ClassCastException:
		
		System.out.println(tb);
		// tb		TestB4 (int b=20/toString())---TestA4 (int a=10/-----) 보장
		// ta[1000번지] = new[1000번지] TestA4 (int a=10/toString())
		// ta의 인스턴스화(실제메모리) = [1000번지] TestA4 (int a=10/toString())
		// 아무리 타입캐스팅해도 안됨 => TestB4() 생성자를 호출한적이 없기 때문
		// int b=20으로 사용가능하게 초기화한적이 없기때문
		// ta = new TestB4();  ta(부모)는 자식 생성자를 호출해야함
	}
}
