package com.company.portfolio_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

class UserDelete implements UserProcess {

	@Override
	public void exec(ArrayList<UserInfo> user) {
		System.out.println(":: 4.delete ::");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("no? > ");		int no = sc.nextInt();
		
		Iterator <UserInfo> iter = user.iterator();
		while(iter.hasNext()) {
			UserInfo u = iter.next();
			if(u.getNo() == no) {
				iter.remove(); break;
			}
		}
	}

	@Override
	public void exec(ArrayList<UserInfo> user, View_crud crud) {
		int no = Integer.parseInt( JOptionPane.showInputDialog("삭제할 번호를 입력해주세요"));
		int find=-1;
		int cnt=0;
		Iterator <UserInfo> iter = user.iterator();
		while(iter.hasNext()) {
			if(iter.next().getNo() == no ) {find = cnt; iter.remove(); break;}
			cnt++;
		}

		if( find == -1 ) { JOptionPane.showMessageDialog(null,"번호를 다시 확인해주세요");	return; }
		crud.model.removeRow(cnt);
	}

	@Override
	public void exec(View_crud crud) {
		int no = Integer.parseInt(JOptionPane.showInputDialog("삭제할 번호를 입력해주세요"));
		
		UserDao dao = new UserDao();	dao.getConnection();
		dao.delete(no);
		
		crud.model.removeRow(no);
		new UserRead().exec(crud);
	}
}
