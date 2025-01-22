package com.company.basic011_exception;

import java.util.Scanner;

public class A004_basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i=0;
		
		for(;;) {
			try {
				System.out.println("Press Number 1");
				i = sc.nextInt();
				if(i==1) {
					System.out.println("end");
			 		break;
				}
			} catch(Exception e) {
				sc.next();	// 잘못된 입력 처리 a
				System.out.println("문자입력 x");
			} 
		}
	}
}
