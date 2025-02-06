package com.company.project;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class View_User_crud {
	// 테이블
	JFrame frame;
	JButton button;
	JPanel panel;
	
	String [] column, column2;	Object[][] rowData, rowData2;
	DefaultTableModel model, model2;
	JScrollPane scroll, scroll2;
	JTable table, table2;
	
	// 버튼
	JButton[] usr_button;
	JPanel usr_panel;
	
	// 생성자
	public View_User_crud() {	// 버튼 및 테이블
		frame = new JFrame();
		usr_panel = new JPanel();
		usr_button = new JButton[] { 
				new JButton("책 대출"), new JButton("책 반납"), 
				new JButton("책 조회"), new JButton("관리자 페이지 이동"), 
				new JButton("종료") 
		};
		column = new String[] {"책 번호", "책 이름", "저자", "출판사"};
		rowData = new Object[][] {};
		model = new DefaultTableModel(rowData, column);
		table = new JTable(model);
		scroll = new JScrollPane(table);
		
		column2 = new String[] {"번호", "사용자", "책 번호", "빌린 날짜"};
		rowData2 = new Object[][] {};
		model2 = new DefaultTableModel(rowData2, column2);
		table2 = new JTable(model2);
		scroll2 = new JScrollPane(table2);
	}
	public void Show_Table() {
		frame.add(scroll);
		table.getColumn("책 번호").setPreferredWidth(20);
		table.getColumn("책 이름").setPreferredWidth(20);
		table.getColumn("저자").setPreferredWidth(40);
		table.getColumn("출판사").setPreferredWidth(100);
		scroll.setSize(600, 200);
		
		frame.add(scroll2);
		table2.getColumn("번호").setPreferredWidth(20);
		table2.getColumn("사용자").setPreferredWidth(20);
		table2.getColumn("책 번호").setPreferredWidth(40);
		table2.getColumn("빌린 날짜").setPreferredWidth(100);
		scroll2.setSize(600, 200);
	}
	
	public void Show_User() {
		Show_Table();
		frame.setLayout(new GridLayout(0,1,10,10));
		frame.add(usr_panel, BorderLayout.SOUTH);
		
		frame.setSize(800,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("사용자 전용 페이지");
		
		for (int i=0;i<usr_button.length;i++) {
			usr_panel.add(usr_button[i]);
		}
	}	
	
}
