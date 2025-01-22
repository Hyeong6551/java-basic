package com.company.selftest;

import java.util.Scanner;

public class test005 {
	public static void main(String[] args) {
		// SelfTest006
		Scanner sc = new Scanner(System.in);
		int age=0;
		age = sc.nextInt();		
		
		if(age<19 && age>=0) {
			System.out.println("당신은 미성년자 입니다.");
		} else {
			System.out.println("당신은 성인입니다.");
		}
	}
}
