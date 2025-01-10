package com.company.basic002;

import java.util.Scanner;

public class A003_basic_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char op = '\u0000';
		
		System.out.println("1. 정수를 하나 입력해주세요");
		int a = sc.nextInt();
		System.out.println("2. 정수를 하나 입력해주세요");
		int b = sc.nextInt();
		System.out.println("3. 연산자를 입력해주세요");
		op = sc.next().charAt(op);
		
		// Q1
		String result = ""+a+op+b+"=";
		
		if(op=='+') {  
			System.out.println(result +(a+b));
		} else if(op=='-') {
			System.out.println (result+(a-b));
		} else if(op=='*') {
			System.out.println(result+(a*b));
		} else if(op=='/') {
			System.out.println(result+(a/b));
		}
		
		
		// Q2
		System.out.println(result+(op=='+'?a+b:op=='-'?a-b:op=='*'?a*b:op=='/'?a/b:"에러"));
	}
}
