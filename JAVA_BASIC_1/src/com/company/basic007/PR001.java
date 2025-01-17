package com.company.basic007;

import java.util.Scanner;

public class PR001 {
	// Q6 method(1)
	public static void hello() {
		System.out.println("hello");
	}
	
	// Q7 method(2)
	public static void hello(String s) {
		System.out.println("hi "+s);
	}
	
	// Q8 method(3)
	public static String hello(int i) {
		return "hello ".repeat(i);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Q1. IF
		System.out.println("1,2,3 중 숫자 입력");
		int n = sc.nextInt();
		if(n == 1) { System.out.println("1이다"); }
		else if(n == 2) { System.out.println("2이다"); }
		else if(n == 3) { System.out.println("3이다"); }
		else { System.err.println("error");}
		
		// Q2. SWITCH
		switch(n){
			case 1 : System.out.println("1이다"); break;
			case 2 : System.out.println("2이다"); break;
			case 3 : System.out.println("3이다"); break;
			default : System.err.println("error");
		}
		
		// Q3-1. FOR
		for(int i=1;i<=3;i++) {
			System.out.printf("%d ",i*100);
		}
		System.out.println();
		
		// Q3-2. WHILE
		n=1;
		while(n<=3) {
			System.out.printf("%d ",n*100);
			n++;
		}
		System.out.println();
		
		// Q3-3. DO WHILE
		n=1;
		do {
			System.out.printf("%d ",n*100);
			n++;
		} while(n<=3);
		System.out.println();
		
		// Q4
		int ar[] = {100,200,300};
		
		for(int i=0;i<ar.length;i++) {
			System.out.printf("%d ",ar[i]);
		}
		System.out.println();
		
		// Q5
		int [][] arr = new int[2][3];
		
		// Q5-1 대입
		n=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = n*100;
				n++;
			}
		}
		
		// Q5-2 출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		
		//Q6
		hello();
		
		//Q7
		hello("sally");
		
		//Q8
		System.out.println(hello(2));
		
		//Q9 - 오버로딩
	}
}
