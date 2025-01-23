package com.company.selftest;

// SelfTest027
//Q1. 상속도 그리기
//Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드

class Papa extends Object{  
	int money = 10000;     
	public Papa() { super(); }
	public void sing() {  System.out.println("GOD-거짓말");  }
}// end class

class Son2 extends Papa{ 
	int money = 1500;
	public Son2() { super(); }
	@Override public void sing() {  System.out.println("빅뱅-거짓말"); }
} // end class
public class test027 {
	public static void main(String[] args) {
		// Q8.  부모 =  자식   /  업,다운캐스팅 /  타입캐스팅 필요여부
		Papa mypapa = new Son2();    
		// Q3. Papa mypapa 의미?

		// Q4. 인스턴스화한 실제 메모리 빌려온그림  
		System.out.println(mypapa.money); // Q5.  출력    
		mypapa.sing();  //Q6. 출력   
		 //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.  
		System.out.println(((Son2)mypapa).money);

	}
}

// Q1.  ~ Q2
/*
 * Object
 *   ↑
 * Papa		(int money=10000, void sing() {"GOD-거짓말"} )
 *   ↑
 * Son2		(int money=1500, void sing() {"빅뱅-거짓말"} )
 */

// Q3. 
// (int money=10000, void sing() {"GOD-거짓말"} ) 보장

// Q4.
// myPapa 	(int money=1500, void sing() {"빅뱅-거짓말"} )--- (int money=10000,-------)
// 오버로딩되어 부모 클래스의 void sing 자식 클래스의 void sing으로 덮어씌어짐

// Q5. 
// 10000

// Q6.
// 빅뱅-거짓말

// Q7.
// System.out.println(((Son2)mypapa).money);

// Q8.
// 부모는 자식을 담을 수 있다. 부모 = 자식 관계이기 때문에 업캐스팅.
// 업캐스팅을 했기때문에 타입캐스트 X
