package com.company.java_test;

import java.util.Scanner;

public class Test002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		switch(i) {
			case  1: System.out.println("1이다"); break;
			case  2: System.out.println("2이다"); break;
			case  3: System.out.println("3이다"); break;
			default : System.out.println("1,2,3이 아니다"); break;
		}
	}
}
