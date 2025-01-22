package com.company.selftest;

import java.util.Scanner;

public class test004 {
	public static void main(String[] args) {
		// SelfTest004
		int kor=0,eng=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[1]국어점수를 입력해주세요");
		kor = sc.nextInt();
		System.out.println("[2]영어점수를 입력해수세요");
		eng = sc.nextInt();
		
		if(kor<40) { System.out.println("국어 과락"); } 
		if(eng<40) { System.out.println("영어 과락"); } 
		
		System.out.printf("국어점수 : %d\n영어점수 : %d",kor,eng);
	}
}
