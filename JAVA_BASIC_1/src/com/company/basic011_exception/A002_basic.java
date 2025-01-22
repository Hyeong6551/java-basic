package com.company.basic011_exception;

public class A002_basic {
	public static void main(String[] args) {
		try {
			System.out.println(10/0*0.0);
		} catch(ArithmeticException e) {
			System.err.println("관리자에게 문의하십시오.");
		} catch(Exception e) {
			System.err.println("아무튼 오류");
		} finally {
			System.out.println("^^");
		}
		// 부모는 자식을 작을 수 있다
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / 
		 * by zero at com.company.basic011_exception.A002.main(A002.java:5)
		 * 
		 */
	}
}
