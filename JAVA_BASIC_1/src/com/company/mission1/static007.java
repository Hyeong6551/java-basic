package com.company.mission1;

public class static007 {
	public static void main(String[] args) {
		String str1 = "monday";		// 지역 변수
		String str2 = "monday";		// 지역 변수
		String str3 = new String("monday");		// 지역 변수
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals(str1));
	}
}
/*
	명시적으로 초기화된 str1,str2와 생성자로 초기화한 str3의 주소값을 다름
	단순 연산자로만 비교할 경우 값이 저장된 주소값을 불러오는 것이므로
	str1 == str3는 성립이 안됨
	하지만 .equals라는 메소드는 주소값이 아닌 문자열로만 비교하는 것이기 때문에
	str.equals(str3)이 성립.
	
	그 반대인 str3.equals(str1)로 성립
*/