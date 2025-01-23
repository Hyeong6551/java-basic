package com.company.basic013_thread;

class Barista{
	String order;
	boolean isEmpty = true;		// #1. 상태표시
	
	synchronized void order(String order) {		// 동기화 - 보장
		// #2. 음료를 가져가지 않았다면 wait
		if(!isEmpty) { try { wait(); } catch (InterruptedException e) { e.printStackTrace(); } }
		
		isEmpty=false;
		this.order = order;
		System.out.println("["+ order +"] 을(를) 주문받았습니다.");
		notify();
	}
	synchronized void make() {
		// #3. 음료가 나오지 않았다면 wait
		if(isEmpty) { try { wait(); } catch (InterruptedException e) { e.printStackTrace(); } }
		
		isEmpty=true;	// 음료가 나왔다면 가져감. 상태가 비었음
		System.out.println("주문하신 [ " + order + " ] 음료가 나왔습니다.");
		notify();	//wait을 깨움
	}
}

public class A002_basic {
	public static void main(String[] args) {
		Barista b1 = new Barista();
		String [] coffees = {"아메리카노","카푸치노","바닐라라떼","말차라떼"};
		
		Thread ordering = new Thread(new Runnable() {	// 1. 수행 클래스

			@Override
			public void run() {		// 2. 해야할 일
				for(int i=1; i<=5;i++) {
					b1.order("주문번호 " + i + coffees[(int)(Math.random()*4)]);
				}
			}
			
		});
		Thread making = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<=5;i++) {
					b1.make();
				}
			}
		});
		
		ordering.start();
		making.start();
	}
}
