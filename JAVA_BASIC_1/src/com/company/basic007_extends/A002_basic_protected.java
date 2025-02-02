package com.company.basic007_extends;

import com.company.basic007_etc.Cat;

class Cat2 extends Cat {		// Cat 기존 → Cat2 [Cat의 기능을 끌어다가 사용]
	public Cat2() {	super(); }	//alt + shift + s
	public void show() {
		pub=1;	// public 접근 가능
		pro=2;	// protected 는 extends를 사용한 자식
//		pac=3;	// Cat 클래스와 같이 있지 않음
//		pri=4;	// Cat 클래스 내부에서만 사용가능 하기 때문에
		System.out.printf("public/protected : %d/%d",pub,pro);
	}
}
public class A002_basic_protected {
	public static void main(String[] args) {
		Cat2 cat2 = new Cat2();
		cat2.pub=11;
//		cat2.pro=22;	// 외부클래스는 protected 사용불가
		cat2.show();
	}
}

// 1. package - basic007_etc
// 2.			basic007_etc.Cat	클래스 파일
// 3. basic007 - A002_basic