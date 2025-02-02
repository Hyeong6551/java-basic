package com.company.mission1;

public class static006 {
	int a;		// 인스턴스 변수
	@Override
	public String toString() {
		return "static006 [a=" + a + "]";
	}
	public static String companyName="(주) 프로그램 시작";		// 클래스 변수
	
	public static void main(String[] args) {
		static006 st = new static006();
		System.out.println(companyName);
		System.out.println(st);
	}
}
/*
 * 
 * 

—-------------------------------------------—-----------------—-----------------
[method : 코드분석, static, final : 정보저장] 	companyName, static006
—-------------------------------------------—-----------------—-----------------
[heap : 동적] 		| 		[stack : 임시] 
a
static006					st
—-------------------------------------------—-----------------—-----------------

*/
