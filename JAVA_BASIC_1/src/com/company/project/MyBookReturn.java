package com.company.project;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

class MyBookReturn implements BookProcess{

	@Override
	public void exec(ArrayList<BookInfo> books) {
		
	}

	@Override
	public void exec(ArrayList<BookInfo> books, ArrayList<MyBookInfo> myBooks, View_Admin_crud ad_crud,View_User_crud usr_crud) {
		int bookNo = Integer.parseInt(JOptionPane.showInputDialog("반납할 책 번호를 입력해세요"));
		
		int findNum = -1;
		int cnt=0;
		Iterator <MyBookInfo> iter = myBooks.iterator();
		while(iter.hasNext()) {
			if(iter.next().getMno() == bookNo ) {findNum = cnt; iter.remove(); break; }
			cnt++;
		}
		
		if(findNum==-1) {
			JOptionPane.showMessageDialog(null, "존재하지 않는 번호입니다."); return;
		} else {
			usr_crud.model2.removeRow(cnt);
			findNum=-1;
		}
	}
}
