package com.company.basic001;

public class A007_basic_Q {
	public static void main(String[] args) {
		//Q1
		int in = 10;
		double dou = 1.2;
		
		double result1 =(double)(in + dou);
		int result2 = in + (int)dou;
		
		System.out.println(result1);
		System.out.println(result2);
		
		
		//Q2
		byte a = 10;
		byte b = 20;
		
		int c1 = a+b;
		byte c2 = (byte)(a+b);
		
		System.out.println(c1);
		System.out.println(c2);
		
		//Q3
		char BB ='B';
		System.out.println("Q1) 대문자 B는 숫자로 변환 시 > "+(int)BB);
		
		char aa = 'a'; 
		System.out.println("Q2) 소문자 A는 숫자로 변환 시 > "+(int)aa);
		
		char d = ' ';
		System.out.println("Q3) 소문자 ''는 숫자로 변환 시 > "+(int)d);
		
		char A = 'A';
		int Aa = A-aa;
		System.out.println("Q4) System.out.println('A'-'a'); > "+ Aa);
		
		System.out.println("Q5) 대문자 A를 소문자 a로 변환하기 > " + (char)(A+32));
		
		int aaa = 10; int bbb = 3; char op = '+';
		System.out.println("Q6) 10+3=13 출력\n"+aaa+op+bbb+"="+(aaa+bbb));
	}
}
