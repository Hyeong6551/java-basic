package com.company.basic001;

import java.util.Scanner;

public class A005_basic_Q {
	public static void main(String[] args) {
		// Q1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("pie값은 얼마입니까");
//		float a = sc.nextFloat();
//		System.out.println("pie값은 "+a+"입니다.");
		
		// Q2
		Scanner sc = new Scanner(System.in);
		System.out.println("국어점수 입력");
		int a = sc.nextInt();
		System.out.println("영어점수 입력");
		int b = sc.nextInt();
		System.out.println("수학점수 입력");
		int c = sc.nextInt();
		
		double result = a+b+c;
		System.out.println("총점 : "+ result);
		System.out.println("평균 : "+ (result/3));
	}
}
