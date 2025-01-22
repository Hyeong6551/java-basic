package com.company.basic008_polymorphism;

class MemberCall001{
	int        instanceValue=10;		// 인스턴스 변수 / heap, new, 생성자, this
	static int classValue=20;   		// 클래스 변수 	 / method, new보다 먼저 메모리에 올라감
	
	int          instanceValue2 = classValue;        
//	static  int classValue2 = instanceValue; //  1)라인A   
//  메모리 상에 클래스 변수가 인스턴스 변수보다 먼저 올라감, this 사용 불가
	
	static void staticMethod1() {
		System.out.println(classValue);
//		System.out.println(instanceValue);  // 2) 라인 B 		this 사용 불가 
	}
	
	void instanceMethod1() {
		System.out.println(classValue);
		System.out.println(instanceValue);  // 3) 라인 C  
	}	
	
	static void staticMethod2() {
		System.out.println(classValue);
//		instanceMethod1();  //4)라인D   	this 사용 불가
	}
	 void instanceMethod2() {
		 staticMethod1();  	// 5) 라인 E  
	}	
}

class Car4 extends Object{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}

public class PR002 {
	public static void main(String[] args) {
		Car4 c1 = new Car4();
		c1.setColor("red");
		System.out.println(c1);
	}
}
//Q6 1,2,4
//Q7 private < package < protected < public
//Q8 setters/getters, toString (Data Transfer Object)
//Q9 c1.color에서 남 -> String color의 접근제어자가 private로 선언되었기 때문에 getters/setters 사용
//Q10 상속받아 원하는 형태로 수정하여 재사용하기 위해서
//Q11 class 자손클래스 extends 부모클래스 {}