package com.company.basic007;

import java.util.Arrays;

// 클래스는 부품객체이다. 클래스는 상태와 행위

class A{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}
	
}	// 생성자를 오버로딩하지 않는 이상 컴파일러가 자동생성

public class Arr001_basic {
	public static void main(String[] args) {
		A a = new A();	// 1) new 공간빌리기, 객체생성	2) A() 초기화		3) a=1번지
		System.out.println(a);

		// 1. 클래스 배열을 만든다
		A [] arr = new A[3];	// new 공간빌리기 - 배열(같은 자료형 연결해서) 3개 공간만 빌리기
								// 3칸 : arr[0]			arr[1]			arr[2]
								//		{name, age}		{name, age}		{name, age}
		System.out.println(Arrays.toString(arr));	// [null, null, null]
		
		// 2. 각 공간에 생성자를 불러서 초기화를 시켜야함
		arr[0] = new A();
		
		// 3. 값 대입
		arr[0].setName("apple");
		
		// 4. 출력
		System.out.println(arr[0]);
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = new A();
			arr[i].setName("a"+i);
			arr[i].setAge(i*10);
			System.out.println(arr[i]);
		}
	}
}
