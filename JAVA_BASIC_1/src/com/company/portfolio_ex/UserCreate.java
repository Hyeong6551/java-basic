package com.company.portfolio_ex;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class UserCreate implements UserProcess {

	@Override
	public void exec(ArrayList<UserInfo> user) {
		System.out.println(":: 1.create ::");
		Scanner sc = new Scanner(System.in);
		
		// 사용자 이름, 이메일 입력받기
		System.out.print("name? >");	String name = sc.next();
		System.out.print("email? >");	String email = sc.next();
		user.add(new UserInfo(name, email));
	}

	@Override
	public void exec(ArrayList<UserInfo> user, View_crud crud) {
		// 1. 알림창으로 입력받기
		String name = JOptionPane.showInputDialog("이름을 입력해 주세요");
		String email = JOptionPane.showInputDialog("이메일을 입력해 주세요");
		
		// 2. model 데이터 저장 - ArrayLisy에 데이터채우기
		user.add(new UserInfo(name, email));
		
		// 3. view 화면 갱신 - crud
		Object[] data = { UserInfo.cnt,name, email };	// 날짜
		crud.model.addRow(data);
	}
}
