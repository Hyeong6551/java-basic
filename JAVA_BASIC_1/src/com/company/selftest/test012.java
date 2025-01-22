package com.company.selftest;

import java.util.Scanner;

public class test012 {
	public static void main(String[] args) {
		// SelfTest012
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		while(!(a>=1 && a<=100)) {
			System.out.println("1~100");
			a = sc.nextInt();
			continue;
		}
	}
}
