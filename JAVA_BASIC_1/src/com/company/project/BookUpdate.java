package com.company.project;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class BookUpdate implements BookProcess {

	@Override
	public void exec(ArrayList<BookInfo> books, View_Admin_crud ad_crud) {
		int no = Integer.parseInt(JOptionPane.showInputDialog("수정할 번호를 입력해주세요"));
		
		
	}

}
