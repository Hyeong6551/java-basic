package com.company.portfolio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
	public void exec(ArrayList<UserInfo> user, UserView view) {
		// TODO Auto-generated method stub

	}
}
