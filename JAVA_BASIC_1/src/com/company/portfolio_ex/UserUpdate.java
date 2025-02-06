package com.company.portfolio_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;

class UserUpdate implements UserProcess {

	@Override
	public void exec(ArrayList<UserInfo> user) {
		System.out.println(":: 3.upadte ::");
		Scanner sc = new Scanner(System.in);
		System.out.print("no? >");	int num = sc.nextInt();
		System.out.print("email? >");	String email = sc.next();
		
		Iterator <UserInfo> iter =user.iterator();
		while(iter.hasNext()) {
			UserInfo u = iter.next();
			if(u.getNo()==num) {
				u.setEmail(email);	break;
			}
		}
	}

	@Override
	public void exec(ArrayList<UserInfo> user, View_crud crud) {
		int no = Integer.parseInt( JOptionPane.showInputDialog("수정할 번호를 입력해주세요"));
		String email = JOptionPane.showInputDialog("수정할 이메일을 입력해주세요");
		int find=-1;
		int cnt=0;
		Iterator <UserInfo> iter = user.iterator();
		while(iter.hasNext()) {
			if(iter.next().getNo() == no ) {find = cnt; break;}
			cnt++;
		}
		
		if( find == -1 ) { JOptionPane.showMessageDialog(null,"번호를 다시 확인해주세요");		return; }
		user.get(cnt).setEmail(email);
		crud.model.setValueAt(email, cnt, 2);
	}
}
