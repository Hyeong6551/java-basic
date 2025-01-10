package com.company.basic002;

import java.util.Scanner;

public class A005_basic_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double i;
		for(;;) {
			System.out.println("PI값은 얼마입니까?");
			i = sc.nextDouble();
			if(i==3.14) {
				System.out.println("정답 !");
				break;
			} else {
				System.err.println("다시 도전!");
			}
		}
		
//		String i;
//		for(;;) {
//			System.out.println("PI값은 얼마입니까?");
//			i = sc.next();
//			if(i.equals("3.14")) {
//				System.out.println("정답 !");
//				break;
//			} else {
//				System.err.println("다시 도전!");
//			}
//		}
	}
}
