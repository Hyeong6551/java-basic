package com.company.basic002;

import java.util.Scanner;

public class A003_basic_Q {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Q1
//		System.out.println("평균을 입력하시오");
//		int avg = sc.nextInt();
//		if (avg>=60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
		// Q2
//		System.out.println("숫자 한개 입력");
//		int n = sc.nextInt();
//		if (n>0) {
//			System.out.println("양수");
//		} else if (n<0) {
//			System.out.println("음수");
//		} else {
//			System.out.println("zero");
//		}
		
		// Q3
		System.out.println("1,2,3 중 좋아하는 숫자를 입력해주세요.");
		int n = sc.nextInt();
		if (n==1) {
			System.out.println("ONE");
		} else if (n==2) {
			System.out.println("TWO");
		} else if (n==3) {
			System.out.println("THREE");
		} else {
			System.out.println("1,2,3이 아니다");
		}
	}
}
