package com.company.basic003;

import java.util.Scanner;

public class PR002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Q1
		System.out.println("숫자 1,2,3 입력");
		int n = sc.nextInt();
		
		if(n==1) { System.out.println("1이다"); }
		else if(n==2) { System.out.println("2이다"); }
		else if(n==3) { System.out.println("3이다"); }
		else { System.out.println("error"); }
		
		//Q2
		switch(n) {
			case 1 : System.out.println("1이다"); break;
			case 2 : System.out.println("2이다");	 break;
			case 3 : System.out.println("3이다"); break;
			default : System.out.println("error"); break;
		}
		
		//Q3
		for (int i=1;i<=3;i++) {
			System.out.print("Hello"+i+"\t");
		}
		System.out.println("\n");
		
		//Q4
		int a=0;
		System.out.println("1 입력하면 탈출");
		
		for (;!(a==1);) {
			System.out.println("무한반복"); 
			a = sc.nextInt();
			continue;
		}
		System.out.println("무한반복 탈출");
		
		
	}
}
