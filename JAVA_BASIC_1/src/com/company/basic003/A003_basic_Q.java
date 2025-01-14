package com.company.basic003;

public class A003_basic_Q {
	public static void main(String[] args) {
		//Q1
		for(int i=1;i<=4;i++) {
			System.out.print("\n");
			for(int j=1;j<=4;j++) {
				System.out.print("★");
			}
		}
		System.out.println();
		
		//Q2
		for(int i=1;i<=4;i++) {
			System.out.print("\n");
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
		}
		System.out.println();
		
		//Q3
		for(int i=4;i>=1;i--) {
			System.out.print("\n");
			for(int j=1;j<=i;j++) {
				System.out.print("★");
			}
		}
		System.out.println("");
		
		//Q4
		for(int i=1;i<=4;i++) {
			System.out.print("\n");
			for(int j=1;j<=4;j++) {
				System.out.print(j);
			}
		}
	}
}
