package com.company.basic009_abstract_interface;

// 인터페이스 상태(멤버변수) : public static final (상수)
// 인터페이스 행위(멤버함수) : publci abstract	  : {} 구현부가 없음
// abstract 클래스보다 추상화 정도가 높음

interface Animal1 {	// new 불가
	String Name="홍길동";		// static - method area, new와 관련 x, new보다 먼저 메모리상에 올라가 있음
	void eat();			// {} 구현부가 없으므로 new 못함
}

class Person1 implements Animal1{	// extends는 메모리상에 있는 것을 인스턴스화를하여 확장
	@Override
	public void eat() { System.out.println(Animal1.Name+"님 맛있게 식사하세요"); }	
}

class Dog1 implements Animal1{
	@Override
	public void eat() { System.out.println("멍이 밥맛있게"); }
}

public class A002_basic {
	public static void main(String[] args) {
		// Animal1 ani = new Animal();	error
		System.out.println(Animal1.Name);
		
		// 한꺼번에 여러개의 타입을 관리하여고 사용
		Animal1 [] ani = { new Person1(),new Person1(),new Dog1(),new Dog1() };
	
		for(Animal1 a:ani) { a.eat(); }
	}
}
