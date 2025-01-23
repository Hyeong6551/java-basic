package com.company.basic013_thread;

import java.awt.Toolkit;

// 1. 프로세스 - 실행중인 프로그램
// 2. 프로세스 - 자원(수행 시 필요 데이터, 메모리) + Thread(실제 작업)
// 3. Thread는 자원을 공유한다.

public class A001_basic {	
	public static void main(String[] args) {
		System.out.println("001. Thread");
		// 1. 코어 (일꾼수)
		int core = Runtime.getRuntime().availableProcessors();
		System.out.println("1. core : " + core);
		
		// 2. 현재스레드 확인 (실행중인 프로그램)
		Thread cur = Thread.currentThread();
		System.out.println("2. 현재 스레드 이름 : "+cur.getName());
		System.out.println("3. 활성화 스레드 수 : " +cur.activeCount());
		
		// 3.
		for(int i=0; i<5; i++) {
			System.out.println("(ˆ(oo)ˆ) "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// 4. 비프음
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep();
			System.out.println("비프음 실행 "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
