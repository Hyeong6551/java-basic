//package com.company.basic009;
//
////Q1. 상속도 그리기
///*
// * Object
// *   ↑
// * Papa		(money=10000; void sing() - "GOD-거짓말")
// *   ↑
// * Son		(money=1500; void sing() - "빅뱅-거짓말")
// * 
// */
////Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드
//public class Papa extends Object{  
//	int money = 10000;     
//	public Papa() { super(); }
//	public void sing() {  System.out.println("GOD-거짓말");  }
//}// end class
//
//class Son2 extends Papa{ 
//	int money = 1500;
//	public Son2() { super(); }
//	@Override public void sing() { System.out.println("빅뱅-거짓말"); }
//} // end class
//public class PR005 {
//	public static void main(String[] args) {
//		// Q8.  부모 =  자식 관계   /  업,다운캐스팅 선택 /  타입캐스팅 필요여부
//		//		부모는 자식을 담을 수 있다.
//		// 		업 캐스팅 => 타입캐스팅 X
//		Papa mypapa = new Son2();    
//		// Q3. Papa mypapa 의미?
//		// Papa(money=10000, void sing()-"GOD-거짓말") 보장
//		// Q4. 인스턴스화한 실제 메모리 빌려온그림
//		// mypapa;		Son(money=1500; void sing() - "빅뱅-거짓말")---Papa(money=1000; void sing() - "-------")
//		System.out.println(mypapa.money); // Q5.  출력   = 10000
//		mypapa.sing();  //Q6. 출력   = 빅뱅-거짓말
//		 //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.   
//		System.out.println(((Son2)mypapa).money);
//	}
//} 





