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

		try {		
			int bookNo = Integer.parseInt(JOptionPane.showInputDialog("삭제할 책 번호를 입력해주쉐요"));
			int findNum = -1;
			boolean state = true;
			
			Iterator <BookInfo> iter = books.iterator();
			while(iter.hasNext()) {
				BookInfo temp = iter.next();
				if(temp.getNo() == bookNo ) { 
					findNum = temp.getNo(); state = temp.isBookState();
					if(findNum==-1) {
						JOptionPane.showMessageDialog(null, "존재하지 않는 번호입니다."); return; 
					} else {
						if(state) {
							iter.remove();
							ad_crud.model.removeRow(findNum-1);
							usr_crud.model[0].removeRow(findNum-1);
						} else {
							JOptionPane.showMessageDialog(null, "현재 대출받고 있는 책이므로 변경할 수 없습니다.");
						}
					}
				}
			}
			System.out.println(state);

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "올바른 값을 입력해주세요.");
		} 
	}
}
