package com.company.basic006_constructor;

class AnimalFarm{
	// 멤버변수
	String name;
	int age;
	static String company="(주)동물농장";
	static int num = 10;
	static String boss;
	static String location;
	static { boss="신동엽"; location="여의도"; }
	
	// 멤버함수
	// 메서드 안에 name=" "를 넣을 수 없음 => 초기화 순서와 관련
	/* 
	 **************초기화 순서
	 * 						기본값	명시적초기화	초기화블록	생성자
	 * 1) 클래스 변수/메서드		1		2			3		x
	 * 2) 인스턴스 변수/메서드 	4		5			6		7 (new 사용)
	 *
	 *
	 */
	//	인스턴스 변수/메서드는 클래스 변수/메서드보다 순서가 밀리기때문에 
	//	클래스 메서드 안에 인스턴스 변수/메서드가 사용 불가 
	//	(역으로 인스턴스 메서드 안에 클래스 변수/메서드 사용 가능)
 	static void num_plus() { ;num++;}	//클래스 메서드 (static 메서드)
	
	// 인스턴스 메서드
	void show() {
		System.out.println(":: 회사명: " + AnimalFarm.company);
		System.out.println(":: 식구수: " + AnimalFarm.num);
		System.out.println(":: 이름: " + this.name);
		System.out.println(":: 나이: " + this.age);
	}
}

public class A001_basic_Q3 {
	public static void main(String[] args) {
		AnimalFarm cat = new AnimalFarm();
		cat.name = "고양이";	cat.age = 10;	cat.show();		System.out.println();
		AnimalFarm.num_plus();	// new X, method area에 올라가 있기때문에 cat.num_plus() 사용 x
		cat.show();

	}
}

/*  RUNTIMEDATA AREA    
-------------------------------------------------------------
[method: 정보, static, final]		AnimalFarm, A001_basic_Q2 / company, num, boss, location, num_plus()
-------------------------------------------------------------
[heap:동적]                       |[stack: 잠깐빌리기]
1번지 AnimalFarm
(name=고양이, age=10)				← cat [1번지]

								 | main
-------------------------------------------------------------
*/

// Q1. 인스턴스변수, static 변수를 구분
// Q2. 초기화 순서
/*------------------------------------------------------------------
 * 인스턴스 변수 : name (heap new - this.name), age (heap new - this.age)
 * 클래스(static) 변수 : company, num, boss, location )=> method - new x
 * 
 * -----------------------------------------------------------------
 * 초기화 순서 : 	기본값	명시적초기화		초기화블록			생성자
 * -----------------------------------------------------------------
 * name		:	null	null			null			고양이	
 * age		:	0		0				0				10
 * company	:	null	(주)동물농장		null			x
 * num		:	0		10				num++			x
 * boss		:	null	null			신동엽			x
 * location	:	null	null			여의도			x
 * -----------------------------------------------------------------
 */
