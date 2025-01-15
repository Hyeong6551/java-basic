package com.company.basic005;

public class A001_basic {
	// 1. 함수정의
	// [아무곳에서] [메모리 상에] [결과값] [메서드 이름](파라미터)
	public static void washer() {	System.out.println("세탁 시작");	}
	public static void line() {	System.out.println("-------");	}
	public static void done() {	System.out.println("done!");	}
	
	// 0. JVM 가장 우선실행
	// [아무곳에서] [메모리 상에] [결과값] [메서드 이름](파라미터)
	public static void main(String[] args) {
		// 2. 함수를 사용하려면 => 함수이름()
		washer();
		line();
		done();
	}
}
