package com.company.basic010_nonameclass_gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//1. 클래스는 부품객체
//2. 부품객체는 조립

class SwingGui002{
	JFrame frame;
	JButton [] button;
	
	public SwingGui002() {
		frame = new JFrame("LAYOUT");
		button = new JButton[6];
		
		for(int i=0;i<button.length;i++) { 
			button[i] = new JButton("BTN" + (i+1));
			button[i].setSize(100,100);
		}
	}
	
	public void show() {	// 틀.add		틀.setSize		틀.setVisible
//		frame.setLayout( new BorderLayout());
//		frame.add(button[0], BorderLayout.AFTER_LINE_ENDS);
		
		frame.setLayout(new GridLayout(6,1));
		for(int i=0;i<button.length;i++) {
			frame.add(button[i]);
		}

		frame.setSize(500,500);
		frame.setVisible(true);
	}
}
public class A001_basic4 {
	public static void main(String[] args) {
		new SwingGui002().show();
	}
}
