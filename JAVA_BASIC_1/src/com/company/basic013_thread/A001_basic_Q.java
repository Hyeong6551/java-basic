package com.company.basic013_thread;

import javax.swing.JOptionPane;

class Timerb extends Thread{
	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

public class A001_basic_Q {
	public static void main(String[] args) {
		Thread timer = new Timerb();
		timer.setDaemon(true);		// 데몬스레드 : 일반스레드가 모두 종료되어야 작없이 완료가 안되어도 종료
		timer.start();
		
		String answer = JOptionPane.showInputDialog("사과 알파벳을 입력하세요.");
		if(answer.trim().toLowerCase().equals("apple")) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("정답이 아닙니다.");
		}
	}
}
