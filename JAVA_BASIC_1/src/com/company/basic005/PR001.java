package com.company.basic005;

import java.util.Scanner;

public class PR001 {
	public static void hi() {
		System.out.println("hi");
	}
	
	public static void hi(String s) {
		System.out.println("hi "+s);
	}
	
	public static String hi1(String s) {
		return s+"♡";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Q1
		System.out.println("10, 20, 30 입력");
		int a = sc.nextInt();
		if(a==10 || a==20 || a==30) { 
			System.out.printf("10*%d\n",a); 
		}
		else	{ 
			System.err.println("error");
		}
	
		//Q2
		switch (a) {
			case 10: case 20: case 30: System.out.printf("10*%d\n",a); break;
			default: System.err.println("error");
		}
		
		//Q3
		for(int i=1;i<=3;i++) { System.out.print(i+" "); }
		System.out.println();
		
		int n=1;
		while(n<=3) { System.out.print(n+" "); n++; }
		System.out.println();
		
		int m=1;
		do { System.out.print(m+" "); m++; } while (m<=3);
		System.out.println();
		
		//Q4
		int [] ar = {10,20,30};
		for(int i=0;i<ar.length;i++) {
			System.out.printf("%d ",ar[i]);
		}
		System.out.println();
		
		//Q5
		int [][] arr = new int[2][3];
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = ++cnt;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%d ",arr[i][j]);
			}
			System.out.println();
		}
		
		//Q6
		hi();
		
		//Q7
		hi("sally");
		
		//Q8
		System.out.println("Good Morning ~! " + hi1("alpha"));
	}
}

