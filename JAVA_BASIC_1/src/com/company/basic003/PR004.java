package com.company.basic003;

import java.util.Scanner;

public class PR004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Q1
		char a = '\u0000';
		
		System.out.println("a, b, c 중 입력");
		a = sc.next().charAt(0);
		
		if(a == 'a') { System.out.println("apple"); }
		else if(a == 'b') { System.out.println("banana"); }
		else if(a == 'c') { System.out.println("coconut"); }
		else {System.err.println("error"); }
		
		//Q2
		switch (a) {
		case 'a' : System.out.println("apple"); break;
		case 'b' : System.out.println("banana"); break;
		case 'c' : System.out.println("coconut"); break;
		default : System.err.println("error");
		}
		
		//Q3
		for(int i=1;i<=3;i++) {
			System.out.printf("JAVA%d\t",i);
		}
		System.out.println();
		
		int n=1;
		while(n<=3) {
			System.out.printf("JAVA%d\t",n);
			n++;
		}
		System.out.println();
		
		int m=1;
		do {
			System.out.printf("JAVA%d\t",m);
			m++;
		} while(m<=3);
		System.out.println();
		
		//Q4
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
	}
}
