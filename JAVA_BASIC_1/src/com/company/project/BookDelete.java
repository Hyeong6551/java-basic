package com.company.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

class BookDelete implements BookProcess{
	@Override
	public void exec(ArrayList<BookInfo> books) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Book no? > ");	int num = sc.nextInt();
		
		Iterator<BookInfo> iter = books.iterator();
		while(iter.hasNext()) {
			BookInfo b = iter.next();
			if(b.getNo() != num) {
				System.out.println("존재하지 않는 번호 입니다.");
			} else {
				iter.remove();
				System.out.println("삭제완료");
			}
		}
		
	}
	
	@Override
	public void exec(ArrayList<BookInfo> books, ArrayList<MyBookInfo> myBooks, View_Admin_crud ad_crud, View_User_crud usr_crud) {
		int bookNo = Integer.parseInt(JOptionPane.showInputDialog("삭제할 책 번호를 입력해주쉐요"));
		int findNum = -1;
		int cnt=0;
		
		Iterator <BookInfo> iter = books.iterator();
		while(iter.hasNext()) {
			if(iter.next().getNo() == bookNo ) { findNum = cnt; iter.remove(); break; }
			cnt++;
		}
		
		// 입력한 번호가 대출받은 책이라면 - 삭제가 불가능한 책
		if(findNum==-1) {
			JOptionPane.showMessageDialog(null, "존재하지 않는 번호입니다."); return;
		} else {
			ad_crud.model.removeRow(cnt);
			usr_crud.model.removeRow(cnt);
			findNum=-1;
		}
		
		
	}
}
