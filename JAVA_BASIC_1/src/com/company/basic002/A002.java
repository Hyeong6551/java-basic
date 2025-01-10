package com.company.basic002;

public class A002 {
	public static void main(String[] args) {
		// 먼저 () 값을 +,-,*,/ 비교 == != > < 하고 조건 && || 처리 후 대입 =
		// 산술 연산자 (+,-,*,/,%)
		int a=10, b=3;
		System.out.println(a+b);	//syso ctrl+space
		
		// 조건 && or ||
		System.err.println("..."+ (a>b && a%3==0));
		System.err.println("..."+ (a>b || a%3==0));
	}
	
}
