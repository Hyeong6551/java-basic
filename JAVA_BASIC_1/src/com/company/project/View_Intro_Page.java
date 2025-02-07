package com.company.project;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class View_Intro_Page {
	JFrame frame;
	JPanel panel;
	JButton[] button;
	JLabel[] label;
	Font font[];
	ImageIcon icon;

	public View_Intro_Page() {
		frame = new JFrame("선택 페이지");
		button = new JButton[] { new JButton("<html>관리자 <br>페이지</html>"), new JButton("<html>사용자 <br>페이지</html>") };
		font = new Font[] { new Font("맑은 고딕",Font.BOLD, 55),new Font("맑은 고딕",Font.BOLD, 60)};
		icon = new ImageIcon("images\\book.png");
		label = new JLabel[] {new JLabel(icon), new JLabel("도서 관리 프로그램")};
	}

	public void Show_Intro(){
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setLocation(300,300);
		frame.add(label[0]);
		frame.add(label[1]);
		
		for(int i=0;i<button.length;i++) {
			button[i].setBackground(new Color(121,189,154));
			button[i].setForeground(new Color(58,81,52));
			button[i].setFont(font[0]);
			frame.add(button[i]);
		}
		button[0].setBounds(775,477,400,250);
		button[1].setBounds(775,125,400,250);
		label[0].setBounds(75, 100, 560, 560);
		label[1].setBounds(75, 648, 550, 77);
		label[1].setFont(font[1]);
		label[1].setForeground(new Color(59,134,134));
		
		frame.setBackground(new Color(207,240,158));
		frame.setSize(1300, 850);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(207,240,158));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
