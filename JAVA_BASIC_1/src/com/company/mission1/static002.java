package com.company.mission1;

class Mobile001{
	static int count;
	String serialNo;
	
	public Mobile001() {
		super();
		count++;
		serialNo="2030-"+count;
	}
}

public class static002 {
	public static void main(String[] args) {
		Mobile001 m1 = new Mobile001();
		Mobile001 m2 = new Mobile001();
		Mobile001 m3 = new Mobile001();
		Mobile001 m4 = new Mobile001();
		
		System.out.println("모바일 갯수는 모두 " + Mobile001.count +"개 입니다.");
		System.out.println("m1의 제품번호 "+m1.serialNo);
		System.out.println("m2의 제품번호 "+m2.serialNo);
		System.out.println("m3의 제품번호 "+m3.serialNo);
		System.out.println("m4의 제품번호 "+m4.serialNo);
	}
}
