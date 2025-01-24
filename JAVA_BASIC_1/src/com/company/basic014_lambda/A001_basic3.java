package com.company.basic014_lambda;

class Class003{
	void method(String str) {
		System.out.println(str);
	}
}

interface InterA003{
	void inter(Class003 c, String s);
}

public class A001_basic3 {
	public static void main(String[] args) {
		// #1. 익명 클래스
		InterA003 a1 = new InterA003() {

			@Override
			public void inter(Class003 c, String s) {	// c 안에 메서드, s 출력
				c.method(s);
			}
		};
		// 1. new를 찍어 Class003()을 불러온 뒤
		// 2. s위치에 값을 넣어줌 
		a1.inter(new Class003(), "nice :-)");
		
		// #2. Lambda
		InterA003 a2 = (c,s) -> c.method(s);
		a2.inter(new Class003(), "Good Luck");
		
		// #3. ::표현식 (참조)
		InterA003 a3 = Class003::method;
		a3.inter(new Class003(), "WTF is this");
	}
}
