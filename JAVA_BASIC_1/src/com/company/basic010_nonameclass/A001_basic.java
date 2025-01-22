package com.company.basic010_nonameclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyView implements ActionListener{		// #1. 클릭이벤트 
	JFrame frame;
	JButton button;
	
	public MyView() {
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
		button.addActionListener(this);		// #3. 이벤트
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {	// #2. 클릭했을 경우
		JOptionPane.showMessageDialog(null, "클릭");
	}
}

public class A001_basic {
	public static void main(String[] args) {
		new MyView().create();
	}
}
