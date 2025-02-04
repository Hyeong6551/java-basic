package com.company.portfolio;

import java.util.ArrayList;
import java.util.Scanner;

class UserCreate implements UserProcess {

	@Override
	public void exec(ArrayList<UserInfo> user) {
		System.out.println(":: 1.create ::");
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자 이름, 이메일 입력받기
		System.out.print("name? >");	String name = sc.next();
		System.out.print("email? >");	String email = sc.next();
		
		// 
		user.add(new UserInfo(name, email));
	}

	@Override
	public void exec(ArrayList<UserInfo> user, UserView view) {
		// TODO Auto-generated method stub

	}

}
