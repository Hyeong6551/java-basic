package com.company.mini_project;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class InfoCreate implements InfoProcess {
	@Override public void exec(ArrayList<U_Info> users) {
		System.out.println("1. 등록기능입니다.");
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일입력 > ");
		users.add( new U_Info(sc.next()) );
		//list.add(  new Info("aaa@gmail.com") );
		//System.out.println("............. 확인 >" + users);

	}// end exec

	@Override
	public void exec(ArrayList<U_Info> users, View_crud crud) {			// 데이터 추가
		// 1. 알림창으로 입력 받기
		String email = JOptionPane.showInputDialog("이메일을 입력해주세요");
		
		// 2. Arraylist에 데이터 채우기
		users.add(new U_Info(email));
		
		// 3. crud 화면 갱신
		Object[] data = {U_Info.cnt, email};
		crud.model.addRow(data);
	}
}// end class