package com.company.mission1;

public class static008 {
	public static void main(String[] args) {
		System.out.println("main 시작");
		firstMethod();
		secondMethod();
		System.out.println("main 종료");
	}
	 
	static void firstMethod() {
		System.out.println("first 시작");
		secondMethod();
		System.out.println("first 종료");
	}
	
	static void secondMethod() {
		System.out.println("second 시작");
		System.out.println("second 종료");
	}
}

/*
 * main 시작
 * first 시작
 * second 시작
 * second 종료
 * first 종료
 * second 시작
 * second 종료
 * main 종료
 * 
 * main 시작 출력되고 firstMethod() 실행 -> first 시작 출력 후 secondMethod() 실행
 * second 시작 출력 후 second 종료 출력 -> firstMethod()의 secondMethod()가 종료 후 first 종료 출력 후 main으로 돌아옴
 * main으로 에서 firstMethod() 종료 후 secondMethod() 실행 -> secondMethod()에서 second 시작 출력 후 second 종료 출력 후 main으로 돌아옴
 * main으로 에서 secondMethod() 종료 후 main 종료 출력
 * 
 * 
 * 
 */