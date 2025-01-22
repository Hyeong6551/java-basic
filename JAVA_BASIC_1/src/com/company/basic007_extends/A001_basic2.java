package com.company.basic007_extends;

// Q. 다음코드에서 오류나는 부분을 찾아 주석달고 이유를 적으시오.
// A. user1.nation / user1.jumin 
// 클래스 User002에 선언된 변수 nation/jumin 앞에 final이 붙어 있기 때문
// 
// => final이란? 
// 값이 바뀌는 것을 원치 않을 때 사용(재할당 불가능). 클래스 앞에 붙이면 상속(extends)이 불가능. 
// 상속받은 자식은 final 붙은 메서드를 사용 불가능 → 오버라이드 불가능
//
class User002 {
	final String nation = "Korea";
	final String jumin;
	String name;
	
	public User002(String jumin, String name) {
		this.jumin = jumin;
		this.name = name;
	}

	public User002() {	
		jumin = "000000-0000000";
	}
}

//			기본값 → 명시적초기화 → 초기화블록 → 생성자
// 	jumin	null	null		null	사용자에게 입력을 받음
public class A001_basic2 {
	public static void main(String[] args) {
		User002 user1 = new User002("123456-1234567", "아이유");
	    
		System.out.println(user1);   
		
//		user1.nation = "USA";      
//		user1.jumin  = "123123-1234321";   
		user1.name = "IU"; 
		System.out.println(user1);   
	}
}
