package com.company.basic003;

import java.util.Scanner;

public class C001 {
	public static void main(String[] args ) {
		//Q1~2
		Scanner sc = new Scanner(System.in);
	
		char n = '\u0000';
		
		System.out.println("a,b,c 중에 한개의 문자를 입력하시오");
		n = sc.next().charAt(n);
		
		switch (n) {
			case 'a' : 
			case 'A' : System.out.println("apple");  break;
			case 'b' : 
			case 'B' : System.out.println("banana"); break;
			case 'c' : 
			case 'C' : System.out.println("coconut"); break;
			default : System.err.println("ERROR");
		}
		
		//Q3
		for(int i=1;i<=3;i++) {
			System.out.printf("HI%s",i);
		}
	}
}
