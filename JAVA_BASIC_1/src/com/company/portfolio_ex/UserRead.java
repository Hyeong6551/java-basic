package com.company.portfolio_ex;

import java.util.ArrayList;
import java.util.Iterator;

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
}
