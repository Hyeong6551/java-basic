package com.company.basic011_exception;

import java.util.Scanner;



public class A003_basic {
	public static int nextInt() throws Exception{	//
		Scanner sc = new Scanner(System.in);
		System.out.println("number 1");
		return sc.nextInt();	//## 에러나면
	}
	public static void main(String[] args) {
		int i=0;
		
		for(;;) {
			try {
				i = nextInt();	//숫자를 입력받는 기능	## 컨트롤타워에서 처리
				if (i==1) {break;}
			} catch(Exception e) {
				System.out.println("문자입력 x");
			}
		}
	}
}
