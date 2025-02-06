package com.company.portfolio_ex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/*
 * 					UserMain
 * 		◆				◆				◆
 * 		|				|				|
 * 	<Model>		 	 <View> 		<Controller>
 *
 * List<UserInfo>	View_intro		controller
 * 					View_crud		[] process
 * 
 */

public class UserMain {
	// model
	ArrayList<UserInfo> users;
	
	// view
	View_intro intro;
	View_crud crud;
	
	// controller
	UserProcess controller;
	UserProcess[] process;
	
	//// 생성자
	public UserMain() {
		users = new ArrayList<>();
		intro = new View_intro();	intro.show();
		crud = new View_crud();
		process = new UserProcess[] {new UserCreate(), new UserRead(), new UserUpdate(), new UserDelete() };
	}
	
	//// 행위 - 기능 - 멤버함수
	public void intro() {
		intro.buttons[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 현재 창 끄고 
				intro.frame.dispose();
				// 2. crud창 열기
				crud.show();
				member();
			}
		});
	}
	public void member() {
		crud.button[0].addActionListener(new ActionListener() {	// 등록
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[0];	controller.exec(users,crud);	// 처리하고 view로 넘기기
			}
		});

		crud.button[1].addActionListener(new ActionListener() {	// 수정
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[2];	controller.exec(users,crud);	// 처리하고 view로 넘기기
			}
		});
		
		crud.button[2].addActionListener(new ActionListener() {	// 삭제
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[3];	controller.exec(users,crud);	// 처리하고 view로 넘기기
			}
		});
		
		crud.button[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crud.frame.dispose();
			}
		});
	}
	
	public static void main(String[] args) {
		new UserMain().intro();
	}


}
