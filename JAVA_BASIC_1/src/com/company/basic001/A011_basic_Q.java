package com.company.basic001;

public class A011_basic_Q {
	public static void main(String[] args) {
	//Q1
	int x = 0;
	char ch = '\u0000';
	
	//Q1-1
	x=5;
	System.out.println("1: "+(x>3 && x<10));
	
	//Q1-2
	ch='A';
	System.out.println("2: "+(ch=='a' || ch=='A'));
	
	//Q1-3
	ch='3';
	System.out.println("3: "+(ch>='0' && ch<='9'));
	
	//Q1-4
	ch='C';
	System.out.println("4: ");
	}
}
