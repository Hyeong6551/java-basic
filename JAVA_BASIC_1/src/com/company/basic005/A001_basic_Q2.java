package com.company.basic005;

public class A001_basic_Q2 {
	public static String sign() { return "meow"; }
	public static int plus(int a,int b) { return a+b; }
	
	public static void main(String[] args) {
		System.out.println("당신의 이름은? : "+sign());
		
		int a = 10, b=3;
		int result = plus(a,b);
		
		System.out.println(result);
	}
}
