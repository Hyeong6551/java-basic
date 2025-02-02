package com.company.project;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class View_Common_Page {
	JFrame frame;
	JButton button;
	JPanel panel;
	
	public View_Common_Page(JFrame frame, JButton button, JPanel panel) {
		super();
		this.frame = frame;
		this.button = button;
		this.panel = panel;
	}

	public View_Common_Page() {
		frame = new JFrame();
		frame.setTitle("페이지");
		button = new JButton("종료");
		panel = new JPanel();
	}

	public void Show_Common() {
		frame.setLayout(new BorderLayout());
		frame.add(panel, BorderLayout.SOUTH);
		panel.add(button);
		
		frame.setSize(1000,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}