package com.company.basic008_polymorphism;


/*
 * Object				
 *   ↑					  
 *  Papa (money=10000/void sing)		 
 * 	 ↑   
 *  Son2 (money=1500/void sing)
 */
// Q1. 상속도 그리기
// Q2. 각 클래스에서 사용할 수 있는 멤버변수/멤버메서드

class Papa extends Object{
	int money = 10000;
	public Papa() { super(); }
	public void sing() {System.out.println("GOD-거짓말");}
}

class Son2 extends Papa{
	int money = 1500;
	public Son2() { super(); }
	public void sing() { super.sing(); System.out.println("빅뱅-거짓말");}
}

public class A002_basic5 {
	public static void main(String[] args) {
		// Q8. 업캐스팅 / 타입캐스트 필요 x
		Papa mypapa = new Son2();
		// Q3. Papa mypapa의 의미?
		// (money=10000/void sing)
		// Q4. 인스턴스화한 실제 메모리 빌려온 그림
		// Papa mypapa; 				 Son2 (money=1500/void sing)---Papa (money=10000/void sing)
		// mypapa[1000번지] = new[1000번지] Son2 (money=1500/void sing)---Papa (money=10000/void sing)
		
		System.out.println(mypapa.money);		// Q5. 출력
		mypapa.sing();		// Q6. 출력
		
		// Q7. mypapa.money 를 이용해서 1500출력
		System.out.println(((Son2)mypapa).money); 
	}
}
