package com.company.project;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class BookCreate implements BookProcess{

	@Override
	public void exec(ArrayList<BookInfo> books) {
		Scanner sc = new Scanner(System.in);
		System.out.print("book title? > ");			String title = sc.next();
		System.out.print("book author? > ");		String author = sc.next();
		System.out.print("book publisher? > ");		String publisher = sc.next();
		
		books.add(new BookInfo(title, author, publisher));
		System.out.println("제목 : "+title+" | 저자 : "+author+" | 출판사 : "+publisher);
		System.out.println("현재 책 수량 : "+BookInfo.cnt);
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
