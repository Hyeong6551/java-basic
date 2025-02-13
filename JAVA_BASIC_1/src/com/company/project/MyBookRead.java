package com.company.project;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MyBookRead implements BookProcess{

	@Override
	public void exec(ArrayList<BookInfo> books) {
		
	}

	@Override
	public void exec(ArrayList<BookInfo> books, ArrayList<MyBookInfo> myBooks, View_Admin_crud ad_crud,View_User_crud usr_crud) {
		JOptionPane.showMessageDialog(null, "대출 가능한 책의 개수 : "+books.size() +"\n내가 대출한 책의 개수 : "+myBooks.size());
	}

}
