package com.company.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

class BookUpdate implements BookProcess {
	@Override
	public void exec(ArrayList<BookInfo> books) {
		Scanner sc = new Scanner(System.in);
		System.out.print("book no? >");		int num = sc.nextInt();
		Iterator <BookInfo> iter = books.iterator();
		while(iter.hasNext()) {
			BookInfo b = iter.next();
			if(b.getNo() != num) {
				System.out.println("존재하지 않는 번호입니다.");
			} else {
				System.out.print("book title? > ");		String title = sc.next();
				System.out.print("book author > ");		String author = sc.next();
				System.out.print("book publisher > ");	String publisher = sc.next();
				
				b.setTitle(title);	b.setAuthor(author);  b.setPublisher(publisher);  break;
			}
		}
	}
	
	@Override
	public void exec(ArrayList<BookInfo> books,  ArrayList<MyBookInfo> myBooks, View_Admin_crud ad_crud, View_User_crud usr_crud) {
		int upNum = Integer.parseInt(JOptionPane.showInputDialog("수정할 책 번호를 입력해주세요"));
		
		int findNum = -1;
		int cnt=0;
		Iterator <BookInfo> iter = books.iterator();
		while(iter.hasNext()) {
			if(iter.next().getNo() == upNum ) { findNum = cnt; break; }
			cnt++;
		}
		
		if(findNum ==-1) { JOptionPane.showMessageDialog(null, "존재하지 않는 번호입니다."); return; }
		else {
			String title = JOptionPane.showInputDialog("수정할 제목을 입력해주세요"); 
			String author = JOptionPane.showInputDialog("수정할 저자를 입력해주세요."); 
			String publisher = JOptionPane.showInputDialog("수정할 출판사를 입력해주세요."); 
			
			if(title != null && author != null && publisher != null) {
				books.get(cnt).setTitle(title);
				books.get(cnt).setAuthor(author);
				books.get(cnt).setPublisher(publisher);
				
				ad_crud.model.setValueAt(title, cnt, 1);
				ad_crud.model.setValueAt(author, cnt, 2);
				ad_crud.model.setValueAt(publisher, cnt, 3);
				
				usr_crud.model.setValueAt(title, cnt, 1);
				usr_crud.model.setValueAt(author, cnt, 2);
				usr_crud.model.setValueAt(publisher, cnt, 3);
				findNum=-1;
			}
		}
	}
}
