package com.company.basic010_nonameclass_gui;

interface Calc{ public double exec(double num1, double num2); }

public class A002_basic2 {
	public static void main(String[] args) {
		// 구현객체 안만들고 exec를 이용해서 더하기 기능이 가능한지 확인
		System.out.println("1.익명이너클래스");
		Calc calc = new Calc() {	// 테스트 목적으로 많이 사용 or 많이 안쓰는 이벤트
			@Override
			public double exec(double num1, double num2) {
				return num1+num2;
			}
		};
		System.out.println(calc.exec(10, 3));
	}
}
