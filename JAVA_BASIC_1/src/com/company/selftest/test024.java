package com.company.selftest;

//SelfTest024
/* Q1. (1) 인스턴스변수 (2) 인스턴스 메서드 (3) 지역변수 (4) 클래스 메서드 (5) 인스턴스 메서드
 * Q2. 오류 나는 곳 : static void classMethod() {   this.a = 12;  }
 * 			 => 인스턴스 변수보다 클래스 메서드가 메모리상에 먼저 올라가기 때문
 * 
 * 				   int show2(){  int a;  return a; }
 * 			 => 메서드 안에 변수를 초기화하지 않았기 때문
 * 
 * Q3. 	메모리 빌려오고, 객체 생성하는 역할  : (new)  
 *		String은 null, int는 0으로 초기화하는 역할 : (A11()) 
 *		new A11()한 주소를 갖고 있는 것은 : (a1)    
 * 
 * Q4. 1) 오버로딩을 한 경우 	//		2) 상속을 사용한 경우
 */


class A11{
	int a;   // (1)  
	A11(){   }
	A11(int a){  this.a = a;  }   //  (2) 
	//(3) void show()  
	void show() { this.a =11;   System.out.println(    this.a   ); }
	//(4) static void classMethod()  
//	static void classMethod() {   this.a = 12;  }	이건 못품
	//(5) int show2()
	int show2(){  int a=0;  return a; }
}

public class test024 {
	public static void main(String[] args) {
		A11  a1  = new A11();    //(6) 
	}
}

