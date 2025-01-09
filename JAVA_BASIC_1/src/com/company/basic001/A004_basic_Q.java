package com.company.basic001;

import java.util.Scanner;

public class A004_basic_Q {
	public static void main(String[] args) {
		// Q1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("당신의 나이는?");
//		int age = sc.nextInt();
//		System.out.printf("당신의 나이는 %d살입니다.",age);
		
		// Q2
//		Scanner sc = new Scanner(System.in);
//		System.out.println("올해 년도를 입력해주세요");
//		int year = sc.nextInt();
//		System.out.println("올해는 "+year+"년도입니다.");
		
		// Q3
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1 입력");
		int a = sc.nextInt();
		System.out.println("숫자2 입력");
		int b = sc.nextInt();
		System.out.printf("%d + %d = %d",a,b,a+b);
	}
}
