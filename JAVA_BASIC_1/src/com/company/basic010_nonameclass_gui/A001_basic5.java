package com.company.basic010_nonameclass_gui;

import javax.swing.*;

class SwingGui003{
	JFrame frame;
	JTable table;
	
	String [] column;		// 데이터 colums
	Object rowData[][];		// 데이터 row
	JScrollPane scroll;
	
	public SwingGui003() {	
		frame = new JFrame("TABLE");
		// 1. 데이터 준비
	      column  =new String[]{ "NO", "NAME", "PRICE", "DESC" };
	      rowData  = new Object [][]{
	         { 1, "WHITE", 1000, "우유는 하얗다" }, { 2, "CHOCO", 1200, "초코는 검정다" },
	         { 3, "BANANA",1300, "바나나는 노랗다" } 
	      };
	         
	         
		// 2. TABLE에 넣기
         table = new JTable(rowData, column);
         scroll = new JScrollPane(table);
	}
	
	public void show() {
		frame.add(scroll);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}

public class A001_basic5 {
	public static void main(String[] args) {
		new SwingGui003().show();
	}
}
