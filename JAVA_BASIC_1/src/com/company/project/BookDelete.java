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
		
	}
	@Override
	public void exec(ArrayList<BookInfo> books, View_Admin_crud ad_crud) {
		int delNum = Integer.parseInt(JOptionPane.showInputDialog("삭제할 책 번호를 입력해주쉐요"));
		int findNum = -1;
		for(int i=0;i<books.size();i++) {
			BookInfo temp = books.get(i);
			if(temp.getNo()==delNum) {
				findNum = i;
				break;
			}
		}
		
		// 잘못된 번호를 입력할 경우 - 존재하지 않는 번호
		// 입력한 번호가 대출받은 책이라면 - 삭제가 불가능한 책
		if(findNum==-1) {
			JOptionPane.showMessageDialog(null, "존재하지 않는 번호입니다."); return;
		} else {
			ad_crud.model.removeRow(findNum);
		}
	}
	
}
