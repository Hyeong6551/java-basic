package com.company.selftest;

import java.util.Scanner;

public class test001_to_003 {
	public static void main(String[] args) {
		// SelfTest001
		System.out.println("Hello");
		
		// SelfTest002
		System.out.println(""+10+"+"+20);
		
		// SelfTest003
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요.");
		String name = sc.next();
		System.out.printf("당신의 이름은 %s입니다.",name);
	}
}
