package com.company.basic006_constructor;

class UserCard03{
	int cardNum;				// 인스턴스변수	- heap area - new - this.cardNum 
	boolean isMembership;		// 인스턴스변수 - heap area - new - this.isMembership
	// static은 선언과 동시에 (명시적)초기화를 해주는게 좋음
	static int width=10;		// static(클래스)변수 - method area
	static int height=10;		// static(클래스)변수 - method area
	static {width=100; height=100;}

	String info() {
		return cardNum + ((isMembership)?"M":"");
	}
	
	public UserCard03() {
		super();
		cardNum = 1;
	}

	// 					지역변수			지역변수
	public UserCard03(int cardNum, boolean isMembership) {
		super();
		this.cardNum = cardNum;
		this.isMembership = isMembership;
	}
}
/*
UserCard03 초기화 순서
						기본값	명시적초기화(cardNum=1)		초기화 블록{}		생성자

int cardNum;			0		0						0				1
boolean isMembership;	false	false					false			false
static int width;		0		10						100				X	(new X)
static int height;		0		10						100				X	(new X)
 
*/
public class A001_basic_Q4 {
//								지역변수
	public static void main(String[] args) {
		System.out.println(UserCard03.width + "/" + UserCard03.height);	// static은 new 사용 x 
		UserCard03 card1000 = new UserCard03();			System.out.println(card1000.info());
		UserCard03 card1 = new UserCard03(111,true);	System.out.println(card1.info());
		UserCard03 card2 = new UserCard03(222,false);	System.out.println(card2.info());
		UserCard03 card3 = new UserCard03(333,true);	System.out.println(card3.info());
	}
}

/*  RUNTIMEDATA AREA    
-------------------------------------------------------------
[method: 정보, static, final]  Usercard03 , A003_basic_Q3 , width , height    
-------------------------------------------------------------
[heap:동적]                       |[stack: 잠깐빌리기] 
1000번지 UserCard03 (1, false)	 ← card1 (1번지)
1번지 UserCard03 (111, true)		 ← card1 (1번지)
2번지 UserCard03 (222, false)		 ← card2 (2번지)
3번지 UserCard03 (333, true)		 ← card3 (3번지)		
								 | main
-------------------------------------------------------------
*/