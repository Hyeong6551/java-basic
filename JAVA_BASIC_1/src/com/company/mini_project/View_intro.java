package com.company.mini_project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

class  View_intro{
	JFrame  frame;   JButton  button;
	public View_intro() { 
		this.frame = new JFrame("INTRO");
		this.button= new JButton("WELCOME!");
	}
	public void show() {  //frame.add / frame.setSize / frame.setVisible
		button.setBackground(new Color(111, 237, 120));
		button.setForeground(new Color(113, 120, 37));
		button.setFont(new Font(Font.MONOSPACED , Font.BOLD,25));
		
		frame.setLocation(300, 300);
		frame.add(button);
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}// end view_intro
