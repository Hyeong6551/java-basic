package com.company.portfolio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class View_crud {
	JFrame frame;
	JScrollPane scroll; JTable table; String[] column;	Object[][] rowData;
	JPanel panel; JButton[] button;
	DefaultTableModel model;
	
	// 생성자
	public View_crud() {		
		frame = new JFrame("자원봉사 페이지");
		
		panel = new JPanel();
		button = new JButton[] { 
			new JButton("등록"),new JButton("수정"),
			new JButton("삭제"),new JButton("닫기") 
		};
		
		column = new String[] {"No","Name","Email","Date"};
		rowData = new Object[][] {{"1","No Named","aaa@gmail.com","2020"},{"2","kanye west","bbb@gmail.com","2022"}};
		model = new DefaultTableModel(rowData, column);
		table = new JTable(model);
		scroll = new JScrollPane(table);
		
		table.setBackground(new Color(81, 168, 212));
		table.setForeground(Color.white);
		table.setRowHeight(25);
		table.getTableHeader().setReorderingAllowed(false);	// 컬럼 이동 방지
		
		table.setFont(new Font("HY견고딕",Font.PLAIN, 10));
		
		DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 정렬 지정
		
		for(int i=0;i<button.length;i++) {
			button[i].setBackground(new Color(81, 168, 212));
			button[i].setFont(new Font("한컴 말랑말랑 Regular",Font.BOLD, 15));
			button[i].setForeground(Color.white);
			button[i].setPreferredSize(new Dimension(70,30));
		}
	}

	// 호출
	void show() {
		frame.setLayout(new BorderLayout());
		frame.add(scroll, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		
		for(int i=0; i<button.length;i++) {
			panel.add(button[i]);
		}
		
		frame.setSize(400,300);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new View_crud().show();
	}
}
