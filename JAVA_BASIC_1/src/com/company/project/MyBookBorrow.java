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
		try {
			String name = JOptionPane.showInputDialog("당신의 이름을 입력해주세요");
			int bookNo =  Integer.parseInt(JOptionPane.showInputDialog("대출할 책의 번호를 입력하세요"));
			boolean run=false;
			BookInfo no = new BookInfo(bookNo);
			
			Iterator <BookInfo> iter = books.iterator();
			while(iter.hasNext()) {
				if(iter.next().getNo() == bookNo) { myBooks.add(new MyBookInfo(name, no)); run=true; break; }
			}
			
			if (run) {
				for(BookInfo b : books) {
					if (b.getNo()==bookNo) {
						Object[] data = { MyBookInfo.cnt, name, bookNo ,b.getTitle(), myBooks.get(0) };
						b.setBookState(false);
						usr_crud.model[1].addRow(data);
						System.out.println(books); break;
					}
				}
			}
			run=false;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "올바른 값을 입력해주세요.");
		}
	}
}
