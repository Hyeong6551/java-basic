package com.company.project;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class View_Admin_crud{
	// 테이블
	JFrame frame;
	JButton button;
	JPanel panel;
	
	String [] column;	Object[][] rowData;
	DefaultTableModel model;
	JScrollPane scroll;
	JTable table;
	
	// 버튼
	JButton[] ad_button;
	JPanel ad_panel;
	
	// 생성자
	public View_Admin_crud() {
		frame = new JFrame();
		ad_panel = new JPanel();
		ad_button = new JButton[] { 
				new JButton("책 추가"), new JButton("책 변경"), 
				new JButton("책 삭제"), new JButton("사용자 페이지 이동"), 
				new JButton("종료") 
		};
	
		column = new String[] {"책 번호", "책 이름", "저자", "출판사"};
		rowData = new Object[][] {{1,"22","23","2424"}};
		model = new DefaultTableModel(rowData, column);
		table = new JTable(model);
		scroll = new JScrollPane(table);
	}
	
	// function
	public void Show_Table() {
		frame.add(scroll , BorderLayout.CENTER );
		table.getColumn("책 번호").setPreferredWidth(20);
		table.getColumn("책 이름").setPreferredWidth(20);
		table.getColumn("저자").setPreferredWidth(40);
		table.getColumn("출판사").setPreferredWidth(100);
//		scroll.setSize(600, 200);
		scroll.setBounds(100, 50, 600, 200);
	}
	
	public void Show_Admin() {
		Show_Table();
		frame.setLayout(new BorderLayout());
		frame.add(ad_panel, BorderLayout.SOUTH);
		
		frame.setSize(800,400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("관리자 전용 페이지");
		
		for (int i=0;i<ad_button.length;i++) {
			ad_panel.add(ad_button[i]);
		}
	}	
}