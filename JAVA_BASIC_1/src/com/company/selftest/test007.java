package com.company.selftest;

import java.util.Scanner;

public class test007 {
	public static void main(String[] args) {
		// SelfTest007
		Scanner sc = new Scanner(System.in);
		char a='\u0000'; 
		a = sc.next().charAt(0);
		
		switch(a) {
			case 'A': case 'a':	System.out.println("apple"); break;
			case 'B': case 'b': System.out.println("banana"); break;
			case 'C': case 'c': System.out.println("coconut"); break;
			default: System.err.println("error");
		}
	}
}
