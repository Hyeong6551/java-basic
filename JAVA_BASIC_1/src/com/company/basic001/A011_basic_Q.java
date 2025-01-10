package com.company.basic001;

public class A011_basic_Q {
	public static void main(String[] args) {
	//Q1 연산자 우선순위
	//괄호 > 산술연산자 > 비교연산자 > 조건연산자 > 대입
		
	//Q2
	int x = 0;
	char ch = '\u0000';
	
	//Q2-1
	x=5;
	System.out.println("1: "+(x>3 && x<10));
	
	//Q2-2
	ch='A';
	System.out.println("2: "+(ch=='a' || ch=='A'));
	
	//Q2-3
	ch='4';
	System.out.println("3: "+(ch>='0' && ch<='9'));
	
	//Q2-4
	ch='c';
	System.out.println("4: "+(ch>='A' && ch<='Z' || ch>='a' && ch<='z'));
	System.out.println((int)ch);
	}
}
// a=97 z=122 A=65 Z=90