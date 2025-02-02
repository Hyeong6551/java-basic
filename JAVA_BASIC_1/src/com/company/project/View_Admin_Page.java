package com.company.project;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class View_Admin_Page extends View_Common_Page{
	// 테이블
	String [] column;	Object[][] rowData;
	DefaultTableModel model;
	JScrollPane scroll;
	JTable table;
	
	// 버튼
	JButton[] ad_button;
	JPanel ad_panel;
	
	// 생성자
	public View_Admin_Page() {
		ad_panel = new JPanel();
		ad_button = new JButton[] { new JButton("책 추가"), new JButton("책 삭제"), new JButton("책 변경"), new JButton("책 삭제") };
	
		column = new String[] {"번호", "책이름", "저자"};
		rowData = new Object[][] {{"1","예제","나"}};
		model = new DefaultTableModel(rowData, column);
		table = new JTable(model);
		scroll = new JScrollPane(table);
	}
	
	// function
	public void Show_Admin() {
		Show_Common();
		frame.setTitle("관리자 전용 페이지");
		frame.add(scroll , BorderLayout.CENTER );
		table.getColumn("번호").setPreferredWidth(20);
		table.getColumn("책이름").setPreferredWidth(60);
		table.getColumn("저자").setPreferredWidth(40);
		scroll.setSize(600, 200);
	}	
}