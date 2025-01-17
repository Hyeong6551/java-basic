package com.companay.basic007_etc;

public class Cat {
	private   int pri;	//private - Cat 클래스 내부에서만 사용
			  int pac;	//package(default) - 같은 폴더에서만 cat 클래스가 있는 폴더
	protected int pro;	//protected	- extends 키워드를 쓴 곳에서만 (자식)
	public 	  int pub;	//public - 아무데서나(클래스에서나) 접근가능, 보안이 떨어짐
	
	// alt + shift + s	:	getters + setters
	public int getPri() {
		return pri;
	}
	public void setPri(int pri) {
		this.pri = pri;
	}
}
