package com.company.basic005;

public class A002_basic {
	public static void hi() { System.out.println("hi"); }
	public static void hi(String a) { System.out.println("hi "+ a); }
	public static String hi(String a, String b) { b = "!"; return a+b; }
	public static void main(String[] args) {
		// 메서드의 기본 구조
		hi();
		
		hi("sally");
		
		
		// 메서드 오버로딩
		// 1. 같은 목적으로 비슷한 동작을 수행하는 메소드들의 이름을 같게 만드는 작업
		// 2. 파라미터의 타입과 갯수로 비교
	}
	int add(int a, int b ) {return a+b;}
	int add(byte a, byte b ) {return a+b;}
	int add(short a, short b ) {return a+b;}
	// long add(int a, int b ) {return a+b;}  error
	long add(long a, long b ) {return a+b;}
}
