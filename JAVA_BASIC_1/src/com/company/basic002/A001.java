package com.company.basic002;

public class A001 {
	public static void main(String[] args){
		char ch1 = '\u0000';		// ' ' 유니코드
		ch1 = 'A';	// 저장 : 숫자로 저장(65), 출력 : 문자로 출력(A)
		System.out.println(ch1);
		
		System.out.println('A'+'B');	// 연산 시 숫자로 출력 65 + 66
		System.out.println('A'+'0');	// 연산 시 숫자로 출력 65 + 113
		char c = 'A'+'0';		//
		System.out.println(c);	// q
		
		int a=10, b=3; char op='+';
		System.out.println(""+a+op+b+"="+(a+b));		// 10+3=13	
		
		// 숫자와 숫자 사이에 연산  /  문자열 + 숫자 출력 
		System.out.println("A"+"B");	// AB
	}
}
