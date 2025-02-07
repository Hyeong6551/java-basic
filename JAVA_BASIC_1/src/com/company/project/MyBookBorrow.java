package com.company.project;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

class MyBookBorrow implements BookProcess{

	@Override
	public void exec(ArrayList<BookInfo> books) {
		
	}

	@Override
	public void exec(ArrayList<BookInfo> books, ArrayList<MyBookInfo> myBooks, View_Admin_crud ad_crud,View_User_crud usr_crud) {
		String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요");
		int bookNo =  Integer.parseInt(JOptionPane.showInputDialog("대출할 책의 번호를 입력하세요"));
		
		Iterator <BookInfo> iter = books.iterator();
		while(iter.hasNext()) {
			if(iter.next().getNo() == bookNo) {
				myBooks.add(new MyBookInfo(name, bookNo));
				System.out.println("..");
			} 
		}
		
		
		Iterator<MyBookInfo> miter = myBooks.iterator();
		while(miter.hasNext()) {
			MyBookInfo m = miter.next();
			Object[] data = { MyBookInfo.cnt, name, bookNo, m.getDate() };
			usr_crud.model2.addRow(data);
			System.out.println("--");
		}
	}
}
