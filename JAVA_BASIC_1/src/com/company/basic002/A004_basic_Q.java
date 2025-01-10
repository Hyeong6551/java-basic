package com.company.basic002;

import java.util.Scanner;

public class A004_basic_Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Q1
//		System.out.println("숫자 1개 입력받기");
//		int month = sc.nextInt();
//		
//		switch(month) {
//		case 3 : System.out.println("봄"); break;
//		case 6 : System.out.println("여름"); break;
//		case 9 : System.out.println("가을"); break;
//		case 12 : System.out.println("겨울"); break;
//		default : System.err.println("에러"); 
//		}
		
		// Q2
		System.out.println("a,b,c 중에 문자 1개 입력");
		char f='\u0000';
		f = sc.next().charAt(f);
		
		switch(f) {
		case 'a': System.out.println("APPLE"); break;
		case 'b': System.out.println("BANANA"); break;
		case 'c': System.out.println("COCONUT"); break;
		default : System.err.println("에러");
		}
	}
}
