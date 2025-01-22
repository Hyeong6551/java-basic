package com.company.basic008_polymorphism;

class A{
	//Q12
	private String name;
	
	public A() { super(); }
	public A(String name) { super(); this.name = name; }

	@Override
	public String toString() { return "A [name=" + name + "]"; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
}

public class PR003 {
	public static void main(String[] args) {
		// Q13
		A [] arr = new A[3];	// 1) new 메모리 공간 빌려오기 2) A자료형 3) 공간 3개 / 생성자호출은 안했음

		// 입력
		for (int i=0;i<arr.length;i++) {
			arr[i] = new A();
		}
		
		// 출력
		for (int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
// Q14 메소드의 재정의 : 오버라이딩


