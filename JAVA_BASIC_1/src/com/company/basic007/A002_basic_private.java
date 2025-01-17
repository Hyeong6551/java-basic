package com.company.basic007;

import com.companay.basic007_etc.Cat;

public class A002_basic_private {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.pub=1;
		cat.setPri(4);	// private - 안보이게 숨기는 기능, set변수형 - 값을 셋팅할때
		System.out.println(cat.getPri());	// 		 get변수형 - 값을 가져올때
	}
}
/*	public (아무데서나) > protected (extends) > package (같은 폴더) > private (같은 클래스 내부에서만)
 * 
 * 
 */
