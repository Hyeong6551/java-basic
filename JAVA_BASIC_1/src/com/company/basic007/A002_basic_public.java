package com.company.basic007;

import com.companay.basic007_etc.Cat;

public class A002_basic_public {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.pub=1;	// public - 아무곳에서나 접근 가능
//		cat.pro=2;	// protected - 상속받은 자식  - extends
//		cat.pac=3;	// package - 같은 폴더(package)
//		cat.pri=4;	// private - Cat이라는 클래스 내부에서만 
	}
}

// 1. package - basic007_etc
// 2.			basic007_etc.Cat	클래스 파일
// 3. basic007 - A002_basic