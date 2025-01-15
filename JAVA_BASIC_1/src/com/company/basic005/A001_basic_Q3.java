package com.company.basic005;

import java.util.Scanner;

public class A001_basic_Q3 {
	public static int num(int a) {
		return a*a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("1. 내가 좋아하는 숫자 : "+num(a));
	}
}
