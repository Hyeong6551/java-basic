package com.company.basic002;

import java.util.Scanner;

public class A005_basic_Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0,b=0;
		String YN=" ";
		char op ='\u0000';
		// a
		for(;;) {
			for (;;) {
				System.out.println("1. 정수를 하나 입력해주세요 (0~100) >");
				a = sc.nextInt();
				
				if(a<=100 && a>=0) { break; } 
			}
			
			// b
			for (;;) {
				System.out.println("2. 정수를 하나 입력해주세요 (0~100) >");
				b = sc.nextInt();
				
				if(b<=100 && b>=0) { break; } 
			}
			
			// operator
			for (;;) {
				System.out.println("3. 연산자를 입력해주세요 (+,-,*,/) >");
				op = sc.next().charAt(op);
				
				if(op=='+' || op=='-' || op=='*' || op=='/') {
					break;
				}
			}
			
			String result = ""+a+op+b+"=";
			System.out.println(result+(op=='+'?a+b:op=='-'?a-b:op=='*'?a*b:op=='/'?Math.round((a/(float)b)*100)/100.0:"에러"));
			
			System.out.print("다시 시작하시겠습니까? (yes/no)");
			YN = sc.next();
			op='\u0000';
			
			if(YN.equals("no")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(YN.equals("yes")) {
				continue;
			}
		}
	}
}
