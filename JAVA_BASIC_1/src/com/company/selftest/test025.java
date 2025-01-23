package com.company.selftest;

/*
 * SelfTest025
 		 	
		 	2.	Milk 클래스를 구현하시오 
			  	클래스의 기능 : 데이터를 받아서 전달하는 기능  (DTO)
				1) 멤버변수    private  name이름 ,  private  price가격      
				2) 생성자      기본생성자 : 
						   필드생성자 : 이름,  , 가격을 입력받아 처리해주는 생성자	
				3) 멤버함수  ---	

 */

class Milk {
	private String name;
	private int price;
	Milk(){ name="white"; price=1300; }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Milk(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + " / " + price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}

public class test025 {
	public static void main(String[] args) {
		 	Milk m1 = new Milk("choco" , 1200);
		 	System.out.println( m1 );  // 출력된 결과 : choco / 1500
		 	Milk m2 = new Milk();
		 	System.out.println( m2 );  // 출력된 결과 : white / 1300
	}
}
