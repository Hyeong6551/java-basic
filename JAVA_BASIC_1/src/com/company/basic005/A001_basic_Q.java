package com.company.basic005;

public class A001_basic_Q {
	public static void test1(int i) { System.out.println(i) ; }
	public static void test2(double d) { System.out.println(d); }
	public static void hap(int a, int b) {
		int result=0;
		for(;a<=b;a++) {
			result += a;
		}
		System.out.println(result);
	}
	public static void disp(int i, char c) {
		for(int j=1;j<=i;j++) {
			System.out.print(c);
		}System.out.println();
	}
	
	public static void main(String[] args) {
		test1(10);
		test2(1.2);
		hap(3,10);
		disp(7,'*');
		disp(2,'♥');
	}
}
