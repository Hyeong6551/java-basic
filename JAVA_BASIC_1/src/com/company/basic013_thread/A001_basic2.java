package com.company.basic013_thread;

import java.awt.Toolkit;

// 프로세스 - 실행중인 프로그램
// 프로세스 - 자원(수행할때 필요한 데이터, 메모리) + 쓰레드(작업수행을 해주는 클래스)
// 
class ShowPig extends Thread{	// #1. 상속 Thread(작업수행 클래스)
	@Override
	public void run() {		// #2. run() - 작업수행 클래스가 해야하는 일 
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<5;i++) {
			System.out.println("(ˆ(oo)ˆ)");
			try {
				Thread.sleep(750);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

class PigSound extends Thread{		// 1. 상속 - Thread (작업을 수행하는 클래스)
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	
	@Override
	public void run() {		// 2. run() - 작업수행 클래스가 해야하는 일
		for(int i=0;i<5;i++) {
			toolkit.beep();
			System.out.println("rr");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class PigCount extends Thread{		// 1~5까지 출력

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Count : "+i);
			try {
				Thread.sleep(625);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}		
}

public class A001_basic2 {
	public static void main(String[] args) {	// 싱행 클래스
		  Thread show = new ShowPig();		// 부모 = 자식 	
		  show.start(); 	// #3. start
		  
		  Thread sound = new PigSound();
		  sound.start();
		  
		  Thread cnt = new PigCount();
		  cnt.start();
	}
}
