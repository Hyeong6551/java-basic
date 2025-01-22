package com.company.basic009_abstract_interface;

interface Launch{ int MONEY=10000; void eat(); }

class Burger implements Launch{
	int age;
	public Burger() { this.age=3900; }
	@Override
	public void eat() { System.out.println("Burger 냠냠"); }
}

class KimchiStew implements Launch{
	int age;
	public KimchiStew() { this.age=4000; }
	@Override
	public void eat() { System.out.println("KimchiStew 냠냠"); }
}

class User{
	int money;	// 돈체크 
	int cnt;	// 갯수
	Launch [] plate;	// 기본은 3개짜리
	
	public User(){money = Launch.MONEY; plate = new Launch[3]; cnt=0; }
	
	void order(Launch l) {
		int n;
		
		if (cnt >= plate.length) {
			Launch [] temparr = new Launch[3+plate.length];		// 현재배열공간+3 (6,9,12,,)
			System.arraycopy(plate, 0, temparr, 0, plate.length);		// (원본, 0,새로운배열, 0, 개수)
			plate = temparr;		
		}
		if (money<0) {
			
		}
	}
	
	void show() {
		System.out.println();
	}
}

public class A002_basic_Q3 {
	public static void main(String[] args) {
		User launchorder = new User();
		launchorder.order(new Burger());
		launchorder.order(new KimchiStew());
		launchorder.order(new Burger());
		launchorder.show();
	}
}
