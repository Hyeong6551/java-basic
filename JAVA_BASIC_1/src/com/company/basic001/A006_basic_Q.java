package com.company.basic001;

import java.util.Scanner;

public class A006_basic_Q {
	public static void main(String[] args) {
		// Q1
		System.out.println((int)1.5 + (int)2.7);
		
		// Q2 오류나는 코드 찾고 이유 작성
//		 byte(1) - short/char(2) -> int(4) -> long(8) -> float(4) -> double(8)
//		 1) bl=b; 2) i=b; 
//		 3) i=l;  4) l=i;
//		 5) f=d;  6) d=f;  7)f=l;

		// A2.
		// 1) boolen은 형변환 불가 
		// 3) 8byte인 long은 4byte인 int에 대입을 하면 메모리 누수생김
		// 5) 8byte인 double은 4byte인 float에 대입을 하면 메모리 누수생김
		// 7) 8byer인 long은 4byte인 float에 대입을 하면 메모리 누수생김
		byte b =1;
		short s =2;
		int i=4; 
		long l=8L;
		boolean bl=true;
		float f=1.1f; 
		double d=1.1;
	
		// Q3
		int enum1=0, enum2=0;
		float result=0.0f;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자1 입력");
		enum1 = sc.nextInt();
		System.out.println("숫자2 입력");
		enum2 = sc.nextInt();
		
		result = enum1/(float)enum2;
		System.out.printf("%d/%d=%f",enum1,enum2,result);
	}
}
