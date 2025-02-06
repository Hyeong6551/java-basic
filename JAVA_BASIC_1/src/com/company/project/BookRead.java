package com.company.project;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class BookRead implements BookProcess{

	@Override
	public void exec(ArrayList<BookInfo> books) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exec(ArrayList<BookInfo> books, View_Admin_crud ad_crud) {
		int delNum = Integer.parseInt(JOptionPane.showInputDialog("조회할 책을 입력해주세요"));
		
	}
}
