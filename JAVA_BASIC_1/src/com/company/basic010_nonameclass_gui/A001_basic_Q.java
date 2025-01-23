package com.company.basic010_nonameclass_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class View_intro{
	JFrame frame;
	JButton button;
	
	public View_intro() {
		this.frame = new JFrame("Example intro Frame");
		this.button = new JButton("Welcome");
	}
	
	public void show_intro() {
		button.setBackground(new Color(111, 237, 120));
		button.setForeground(new Color(113, 120, 37));
		button.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
		frame.add(button);
		frame.setSize(300,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 버튼을 눌렀을 경우
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
	}
}

class View_crud{
	JFrame frame;
	JTable table;
	JScrollPane scroll;
	
	String [] col;	Object [][] rowData;
	DefaultTableModel model;		// 데이터를 동적으로 추가 및 삭제를 하기 위한 클래스
	
	JPanel panel;
	JButton [] button;
	
	public View_crud() {
		frame = new JFrame("User Info Frame");
		panel = new JPanel();
		button = new JButton[] { 
				new JButton("ADD"),new JButton("UPDATE"),
				new JButton("DELETE"),new JButton("CLOSE") 
		};
		col = new String[] {"NO","EMAIL"};		// 각 칸
		rowData = new Object [][] {};			// 줄단위 데이터
		model = new DefaultTableModel(rowData, col);		// 동적 데이터 처리
		table = new JTable(model);			
		scroll = new JScrollPane(table);
	}
	
	public void show_curd() {
		frame.setLayout(new BorderLayout());
		frame.add(scroll, BorderLayout.CENTER);
		frame.add(panel, BorderLayout.SOUTH);
		
		for(int i=0;i<button.length;i++) {
			panel.add(button[i]);
		}
		frame.setLocation(100,100);
		frame.setSize(400,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class A001_basic_Q {
	public static void main(String[] args) {
//		new View_intro().show_intro();
//		new View_crud().show_curd();
		
		View_crud crud = new View_crud();
		
		// 1. 데이터 추가
		Object [] data = {1, "aaa@gmail.com"};
		crud.model.addRow(data);
		
		// 2. 데이터 삭제
		crud.model.removeRow(0);
		
		crud.show_curd();
	}
}
