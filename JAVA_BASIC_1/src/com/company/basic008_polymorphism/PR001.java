package com.company.basic008_polymorphism;

class A11{
	
	int a;
	
	A11(){super();}
	A11(int a){this.a=a;}
	
	void show() { this.a = 11; System.out.println(this.a); }
//	static void classMethod() { this.a = 12;}	// new보다 먼저 메모리상에 올라감
	int show2() { int a=0; return a; }
}

public class PR001 {
	public static void main(String[] args) {
		A11 a1 = new A11();

	}
}
// Q1 (1) 인스턴스 변수 (2) 지역변수 (3) 인스턴스 메서드 (4) 클래스 메서드 (5) 인스턴스 메서드 
// Q2 classMethod()에서 오류. this 사용 불가 , int a앞에 static 붙이고 A11.a=12; 변경
// -> 클래스 메서드는 인스턴스 변수보다 메모리상에 먼저 올라가기 때문에 성립 x  
//    int show2()에서 오류. 지역변수 a를 초기화 하지 않음
// Q3 new, A11(), a1
// Q4 오버로딩을 한 경우, 상속을 받은 경우
// Q5 c 리턴타입이 달라야 한다 ,d 매개변수의 이름이 달라야 한다
