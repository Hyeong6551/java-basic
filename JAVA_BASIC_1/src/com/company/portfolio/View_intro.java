package com.company.portfolio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 
 * 1. 클래스는 부품 객체
 * 2. OOP : 클래스를 조립해서 프로그램 작성
 * 		UserView_intro
 * 		◆		◆		◆
 * 	JFrame	Button[]	JLable(ImageIcon)
 */

public class View_intro {
	JFrame frame;
	JLabel label;	ImageIcon icon;
	JButton [] buttons;
	
	public View_intro() {
		frame = new JFrame("생성한 프레임");
//		icon = new ImageIcon("images\\together.png");
		icon = new ImageIcon("images\\artwork.jpg");
		label = new JLabel(icon);
		buttons = new JButton[] { new JButton("자원봉사자등록"), new JButton("후원하기") };
		
		//
		for(int i=0;i<buttons.length;i++) {
			buttons[i].setBackground(new Color(204, 79, 79));
			buttons[i].setFont(new Font("맑은 고딕 Semilight",Font.BOLD, 13));
			buttons[i].setForeground(Color.white);
			buttons[i].setPreferredSize(new Dimension(150,65));
		}
	}
	
	public void show() {
		frame.setLayout(null);
		frame.setResizable(false);
//		frame.setLayout(new GridLayout(3,1,10,10));
		label.setBounds(0,0,500,500);
		buttons[0].setBounds(70, 510, 130, 80);
		buttons[1].setBounds(260, 510, 130, 80);
		frame.add(label);
		frame.add(buttons[0]);		frame.add(buttons[1]);
		frame.setSize(500,640);		frame.setVisible(true);		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) { new View_intro().show(); }
}
