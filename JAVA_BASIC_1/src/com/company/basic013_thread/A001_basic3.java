package com.company.basic013_thread;

import java.awt.Toolkit;

class Animal{}

class ShowDog extends Animal implements Runnable{		// 1. 수행클래스 상속
	@Override
	public void run() {		// 2. run - 해야할 일
		for(int i=0;i<5;i++) {
			System.out.println("૮ ・ﻌ・ა");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}



public class A001_basic3 {
	public static void main(String[] args) {
		Thread show = new Thread(new ShowDog());
		show.start();
		
		Thread sound = new Thread(new Runnable() {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("멍멍(비프음)");
					toolkit.beep();
					try {
						Thread.sleep(1001);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});	
		sound.start();
	}
}
