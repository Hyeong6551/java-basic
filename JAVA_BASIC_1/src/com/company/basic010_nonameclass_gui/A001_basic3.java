package com.company.basic010_nonameclass_gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

// 클래스는 부품객체
// 클래스는 상태와 행위
// 부품객체 조립 

/*
 *    SwingGui001
 *      ◆	  ◆
 * 	 JFrame JButton
 */

class SwingGui001{
	// 멤버변수
	JFrame frame;		// 틀
	JButton button;		// 버튼
	
	
	// 생성자
	public SwingGui001() {
		this.frame = new JFrame("Press Click Button");
		this.button = new JButton("Click ");
	}
	
	// 멤버함수
	public void show() {	// 1. 틀.add(컴포넌트)		2. 틀.size(크기)		3. 틀.setVisible
		// Q1. 버튼의 배경색상/ 글자색상 / 글자모양
		
		frame.add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
		button.setForeground(new Color(59, 109, 209));
		button.setBackground(new Color(110, 230, 226));
		button.setFont(new Font( Font.DIALOG, Font.BOLD, 15));
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(button, "welcome");
			}
		});
		
		// x 버튼클릭시 닫기기능
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

public class A001_basic3 {
	public static void main(String[] args) {
		SwingGui001 gui1 = new SwingGui001();
		gui1.show();
	}
}
