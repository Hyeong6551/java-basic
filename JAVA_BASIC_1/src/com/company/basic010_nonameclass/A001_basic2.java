package com.company.basic010_nonameclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyView2{		// #1. 클릭이벤트 
	JFrame frame;
	JButton button;
	
	public MyView2() {
		this.frame = new JFrame("box");
		this.button = new JButton("btn");
	}
	public void create() {
		// 1-1. frame.add(컴포넌트)
		frame.add(button);
		
		// 1-2. frame.size(300,300)
		frame.setSize(300, 300);
		
		// 1-3. frame.setVisite()
		frame.setVisible(true);
		button.addActionListener(new ActionListener() {		// 1. interface는 new를 못하지만
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "CLICK");
			}	// 2. 한번쓰고 버릴 목적으로
		});		// 3. new 인터페이스명(){ implements 구현메서드 } 사용가능 => 익명클래스
	}
}

public class A001_basic2 {
	public static void main(String[] args) {
		new MyView2().create();
	}
}
