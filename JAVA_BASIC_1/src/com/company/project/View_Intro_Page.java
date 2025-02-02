package com.company.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class View_Intro_Page {
	JFrame frame;
	JButton[] button;
	JPanel[] panel;
	Font font;

	public View_Intro_Page() {
		frame = new JFrame("선택 페이지");
		panel = new JPanel[] {new JPanel(),new JPanel()};
		button = new JButton[] { new JButton("관리자 전용"), new JButton("이용자 전용"), new JButton("종료") };
		font = new Font("배달의민족 도현",Font.BOLD, 30);
	}

	public void Show_Intro(){
		frame.setLayout(new BorderLayout());
		frame.setLocation(300,300);
		frame.add(panel[0], BorderLayout.CENTER);
		frame.add(panel[1], BorderLayout.SOUTH);
		
		for(int i=0;i<button.length;i++) {
			if(i==2) {
				panel[1].add(button[i]);
				button[i].setPreferredSize(new Dimension(100,50));
				button[i].setBackground(new Color(0, 153, 51));
				button[i].setFont(font);
				break;
			}
			button[i].setPreferredSize(new Dimension(200,114));
			button[i].setBackground(new Color(111, 237, 120));
			button[i].setFont(font);
			panel[i].setBackground(new Color(236, 179, 255));
			panel[0].add(button[i]);
		}
		
		frame.setBackground(new Color(55,66,44));
		frame.setSize(500, 250);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
