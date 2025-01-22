package com.company.selftest;

import java.util.Scanner;

public class test013 {
	public static void main(String[] args) {
		// SelfTest013
		Scanner sc = new Scanner(System.in);
		int a = 0;
		
		System.out.print("원하는 단 입력 > ");
		a = sc.nextInt();
		for(int i=1;i<=9;i++) {
			System.out.println(a+" * "+i+" = "+a*i);
		}
		
		
	}
}
