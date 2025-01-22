package com.company.selftest;

import java.util.Scanner;

public class test006 {
	public static void main(String[] args) {
		// SelfTest006
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		System.out.println("[1]국어점수를 입력해주세요");
		if(score>=90) { System.out.println("수"); }
		else if (score>=80) { System.out.println("우"); }
		else if (score>=70) { System.out.println("미"); }
		else if (score>=60) { System.out.println("양"); }
		else { System.out.println("가"); }
	}
}
