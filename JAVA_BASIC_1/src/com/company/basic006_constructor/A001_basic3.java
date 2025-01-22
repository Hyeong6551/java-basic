package com.company.basic006_constructor;

// 1. 클래스는 부품객체
// 2. 클래스는 속성(멤버 변수)과 행위(멤버 함수)

class Car001 {}	// 4. Car001() 생성자를 안만들었을 때 - 컴파일러가 자동으로 기본생성자를 추가
class Car002 {	
	String color;
	
	//  alt + shift + s → Generate Constructors using field
	public Car002(String color) {	
		this.color = color;		
		// 오버로딩 - 컴파일러가 기본생성자 자동생성 취소
	}
	
	// alt + shift + s → Generate Constructors from Superclass
	public Car002() { color="gray";} 	// ★오버로딩 시 수동으로 기본생성자 만들기 / 기본셋팅
	
}

public class A001_basic3 {
	public static void main(String[] args) {
		// 1. new = heap 공간에서 메모리 빌려오고 객체 생성
		// 2. Car001() - 초기화, String=null, int=0으로 초기화
		// 3. 초기화 후 car1 = 1000번지 리턴
		Car001 c1 = new Car001();	System.out.println(c1);
		Car002 c2 = new Car002("red");	System.out.println(c2);
		
		// 자동생성이 취소 되었기 때문에 오류.. 그렇기 때문에 수동으로 기본생성자를 만들어줘야함
		Car002 c3 = new Car002();	System.out.println(c3.color);
	}
}