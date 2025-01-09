package com.company.basic001;

public class A003_basic_Q {
	public static void main(String[] args) {
		// Q1
		int apple;
		apple = 1000;
		System.out.printf("사과가격은 %s입니다.\n",apple);
		apple = 2000;
		System.out.printf("사과가격은 %s입니다.\n",apple);
		
		// Q2
		int a = 10;
		int b = 3;
		
		// + 의미 : 숫자 + 숫자 (더하기) / 문자열 + 숫자 (문자열 뒤에는 출력)
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
	}
}
