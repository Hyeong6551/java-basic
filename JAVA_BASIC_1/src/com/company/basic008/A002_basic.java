package com.company.basic008;

/*
 * Object				Object
 *   ↑					  ↑
 *  TestA (int a)		 TestB (int a)
 * 
 * 
 */
class TestA extends Object{
	int a=10;
}

class TestB extends Object{
	int a=20;
}
public class A002_basic {
	public static void main(String[] args) {
		TestA v1 = new TestA();
//		TestB v2 = v1;	
		// 같은 오브젝트를 상속하더라도 자료형이 다르기 때문		TestA != TestB
		// 클래스도 자료형(틀-Object)이다
		// Type mismatch: cannot convert from TestA to TestB
	}
}
