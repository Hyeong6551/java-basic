package com.company.basic002;

import java.util.Scanner;

public class A005_basic_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 단을 입력해주세요 >");
		int i = sc.nextInt();
		
		for(int j=1;j<=9;j++) {
			System.out.println(i+"*"+j+"="+(i*j));
		}
	}
}
