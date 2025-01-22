package com.company.basic007_extends;

public class A002_basic_package {	// extends Cat을 했으면 protected 가능
	public static void main(String[] args) {
		// A002_basic_protected 에 있는 Cat2 사용 가능
		// ↓ ↓ ↓ ↓ ↓ ↓ ↓ 
		// 같은 패키지안에 있기 때문에 Cat2 사용가능
		Cat2 cat2 = new Cat2();
		
		cat2.pub=10;
//		cat2.pro=20;	// extends 키워드가 없기 때문
//		cat2.pac=30;	// Cat2 와는 같은 폴더에는 있지만 외부
//		cat2.pri=40;	// Cat 클래스안에서만 사용 가능
		cat2.show();
	}
}
