package com.company.mission1;

//	class Sawon001 {
//		int pay=10000;
//		static int su=10;
//		static int basicpay=pay;	// 1
//		static int basicpay2;
//		static { basicpay2=20000; }
//		public static void showSu() { System.out.println(su); }
//		public static void showPay() { System.out.println(this.pay); }	// 2
//		
//		public void showAll001(){	// 3
//			System.out.println(su);
//			System.out.println(this.pay);
//		}
//		
//		public static void showAll002() {	// 4
//			showAll001();
//			System.out.println(this.pay);
//		}
//	}
//	
//	public class static001{
//		public static void main(String[] args) {
//			Sawon001 sw = new Sawon001();
//			sw.showAll001();
//		}
//	}

/*
	1. 클래스 변수인 basicpay가 인스턴스 변수인 pay보다 빨리 선언었기에 사용 불가
	2. 클래스 메서드인 showPay()가 메모리상에 먼저 선언되었기 때문에 인스턴스 변수인 pay 사용 불가
	4. 클래스 메서드인 showwAll002()가 인스턴스 메서드인 showAll001()보다 빨리 선언되었기 때문에 사용 x
	showAll001안에 있는 인스턴스 변수인 pay가 있기에 클래스메서드인 showAll002()에서 사용 불가 

*/