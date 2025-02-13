package com.company.portfolio_ex;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.table.DefaultTableModel;

class UserRead implements UserProcess {

	@Override
	public void exec(ArrayList<UserInfo> user) {
		System.out.println(":: 2.read ::");
		Iterator <UserInfo> iter = user.iterator();
		while(iter.hasNext()) {
			UserInfo u = iter.next();
			System.out.println(u.getNo()+"\t"+ u.getName()+"\t"+u.getEmail()+"\t"+u.getDate());
		}
	}
	
	@Override
	public void exec(ArrayList<UserInfo> user, View_crud crud) {	}

	@Override
	public void exec(View_crud crud) {
		UserDao dao = new UserDao();
		dao.getConnection();
		ArrayList<UserInfo> list = dao.readAll();	// db 연동 전체 데이터 가져오기
		
		DefaultTableModel model = (DefaultTableModel) crud.table.getModel();
		model.setNumRows(0);	// 중요
		
		Iterator<UserInfo> iter= list.iterator();
		while(iter.hasNext()) {
			UserInfo temp = iter.next();
			Object[] data = {temp.getNo(), temp.getName(), temp.getEmail(), temp.getDate()};
			crud.model.addRow(data);
		}
	}
}
