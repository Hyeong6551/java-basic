package com.company.portfolio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

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
	public void exec(ArrayList<UserInfo> user, UserView view) {
		// TODO Auto-generated method stub

	}

}
