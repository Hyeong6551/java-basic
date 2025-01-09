package com.company.basic001;

import java.util.Scanner;

public class A007_basic_Q2 {
	public static void main(String[] args) {
		//Q4
		String name="";
		char ban='\u0000';
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하시오 >");
		name = sc.next();
		System.out.println("당신의 반을 입력하시오(A/B)");
		ban = sc.next().charAt(ban);
		
		System.out.println(":::::::::::::::::::::::::::::: USERINFO");
		System.out.println(":: NAME :"+name);
		System.out.println(":: CLASS :"+ban);
	}
}
