package com.company.project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

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
	Font[] font;
	
	// 생성자
	public View_Admin_crud() {
		frame = new JFrame();
		ad_panel = new JPanel();
		ad_button = new JButton[] { 
				new JButton("책 추가"), new JButton("책 변경"), 
				new JButton("책 삭제"), new JButton("사용자 페이지 이동"), 
				new JButton("종료") 
		};
		font = new Font[] { new Font("맑은 고딕",Font.BOLD, 55),new Font("맑은 고딕",Font.BOLD, 60)};
		column = new String[] {"책 번호", "책 이름", "저자", "출판사"};
		rowData = new Object[][] {};
		model = new DefaultTableModel(rowData, column);
		table = new JTable(model);
		scroll = new JScrollPane(table);
	}
	
	public String[] getColumn() { return column; }  public void setColumn(String[] column) { this.column = column; }
	public Object[][] getRowData() { return rowData; }  public void setRowData(Object[][] rowData) { this.rowData = rowData; }
	public DefaultTableModel getModel() { return model; }  public void setModel(DefaultTableModel model) { this.model = model; }
	public JScrollPane getScroll() { return scroll; }  public void setScroll(JScrollPane scroll) { this.scroll = scroll; }
	public JTable getTable() { return table; }  public void setTable(JTable table) { this.table = table; }

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

		for(int i=0;i<ad_button.length;i++) {
			ad_button[i].setBackground(new Color(121,189,154));
			ad_button[i].setForeground(new Color(58,81,52));
			ad_button[i].setFont(font[0]);
			frame.add(ad_button[i]);
		}
		
		frame.setSize(1550,900);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("관리자 전용 페이지");
		
		for (int i=0;i<ad_button.length;i++) {
			ad_panel.add(ad_button[i]);
		}
	}	
}