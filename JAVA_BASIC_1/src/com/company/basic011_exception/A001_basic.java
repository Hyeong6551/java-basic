package com.company.basic011_exception;

import java.util.Scanner;

public class A001_basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		for(;;) {
			System.out.println("Press Number 1");
			i = sc.nextInt();
			if(i==1) {
				System.out.println("end");
				break;
			} 
		}
	}
}
