package com.company.basic001;

public class A010_basic_Q {
	public static void main(String[] args) {
		int a=10;
		
		//Q1
		System.out.println(a==10?1:0);
		
		//Q2
		System.out.println(a>0?a*1.1:0.9);
		
		//Q3
		a=3; int b=10;
		
		System.out.println(b += 10 - a--);
		System.out.println(a += 5);
		System.out.println(b >= 10 || a < 0 && a > 3);
		//17
		//7
		//true
		
		
		//Q4
		char ch = 'A';
		
		System.out.println('C'-ch);
		System.out.println('5'-'4');
		System.out.println(ch+1);
		System.out.println(++ch);
		System.out.println(ch++);
		//2
		//1
		//66
		//B
		//B
	}
}
