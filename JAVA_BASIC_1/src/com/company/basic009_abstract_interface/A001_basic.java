package com.company.basic009_abstract_interface;

// 설계목적 : abstract 클래스 추상화정도가 떨어짐 / 인스턴스 사용가능
abstract class Animal{
	String name; int age;
	abstract void eat();		// 추상메서드가 있으면 반드시 추상클래스로 만들어 줘야함 (고양이, 강아지, 공통속성)
	abstract void sleep();		// 추상메서드 {} 구현 부분이 없음 -> 공통속성의 구체적인 내용이 없음
	abstract void poo();		// 일반화, 추상화, 설계 : 공통적인 속성, 행동
}
class Cat extends Animal{		// 고양이는 동물이다. abstract을 무조건 구현
								// add unimplemented method
	@Override			
	void eat() { System.out.println(name + " cat yum"); }

	@Override
	void sleep() { System.out.println(name + " cat sleep");}

	@Override
	void poo() { System.out.println(name + " cat poo");}		
}
class Dog extends Animal{

	@Override
	void eat() { System.out.println(name + " dog yum"); }

	@Override
	void sleep() { System.out.println(name + " dog sleep");}

	@Override
	void poo() { System.out.println(name + " dog poo");}	
	
}

public class A001_basic {
	public static void main(String[] args) {
		// Cannot instantiate the type Animal
		// new는 메모리를 빌리고 객체 생성을 하는데 생성자를 불러서 초기화를 해야하는데 
		// 생성자 자체를 호출할 수 없음
		// => 구체적으로 작업한게 없기 때문 (구현한 부분이 없음)
		
		// 부모 = 자식 => 업캐스팅 (타입캐스팅 X) / 부모는 자식을 담을 수 있다.
		Animal ani = new Cat();		// Cat
		ani.name="냥이"; ani.age=12;
		ani.eat();		ani.sleep();	ani.poo();
		
				ani = new Dog();	// Dog
		ani.name="멍이"; ani.age=12;
		ani.eat();		ani.sleep();	ani.poo();
		
		///// 사용목적 : abstract은 this(인스턴스 사용가능) / interface는 final, static 사용
		
		// 한 개의 자료형(Animal)으로 여러타입을 관리하기 위해 사용
		Animal [] arr = { new Cat(),new Cat(),new Dog(),new Dog(),};
		arr[0].name="first cat";	arr[1].name="second cat";
		arr[2].name="first dog";	arr[3].name="second dog";
		
		for(Animal a : arr) { a.eat(); }
	}
}
