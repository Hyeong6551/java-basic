package com.company.selftest;

import java.util.Scanner;

public class test011 {
	public static void main(String[] args) {
		// SelfTest011
		Scanner sc = new Scanner(System.in);
		int i = -1;
		
		for(;!(i>=1 && i<=100);) {
			System.out.println("1~100");
			i = sc.nextInt();
			continue;
		}
		System.out.println("벗어남");
	}
}
