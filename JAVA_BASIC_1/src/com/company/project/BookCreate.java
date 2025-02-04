package com.company.project;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class BookCreate implements BookProcess{

	@Override
	public void exec(ArrayList<BookInfo> books) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exec(ArrayList<BookInfo> books, View_Admin_crud ad_crud) {
		String title = JOptionPane.showInputDialog("책 제목을 입력해주세요");
		String author = JOptionPane.showInputDialog("저자를 입력해주세요");
		String publisher = JOptionPane.showInputDialog("출판사를 입력해주세요");
		
		books.add(new BookInfo(title, author, publisher));
		
		Object[] data = { BookInfo.cnt, title, author, publisher };
		ad_crud.model.addRow(data);
	}
}
