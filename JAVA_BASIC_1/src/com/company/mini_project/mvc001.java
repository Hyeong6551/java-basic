package com.company.mini_project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

// use_MVC 조힙
/*
 * 합성 관계 (composition) - 생성자 new
 * 
 * 				 use_MVC
 * 	model(저장소)	 view(화면)	controller(처리)
 * 		◆			◆			◆
 *  List<Info> 	View_intro	controller	
 * 			  	View_crud	[] process
 */


class use_MVC{
	//model 
	ArrayList<U_Info> list;
	
	//view
	View_intro intro;
	View_crud crud;
	
	//controller
	InfoProcess controller;
	InfoProcess [] process;		// InfoCreate, InfoRead, InfoUpdate, InfoDelete
	
	public use_MVC() {
		list = new ArrayList<>();
		
		intro = new View_intro();	intro.show();
		crud = new View_crud();
		
		process = new InfoProcess [] { 
				new InfoCreate(), new InfoUpdate(), new InfoDelete() ,new InfoRead()
		};
	}

	//// function
	// intro
	public void step_intro() {
		intro.button.addActionListener(new ActionListener () {
			@Override
			public void actionPerformed(ActionEvent e) {
				intro.frame.dispose();		// 화면 꺼지고
				crud.show();				// 2번째창 열리고
				step_crud();
			}
		});
	}
	
	// crud
	public void step_crud() {
		String [] msg = new String[] {"추가","수정","삭제"};
		// InfoCreate
		// 익명이너클래스 안에 설정한 변수는 final로 처리되기에 for문으로 버튼을 연속적으로 사용 x
		crud.button[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, msg[0]);
				controller = process[0];
				controller.exec(list, crud);
			}
		});
		
		crud.button[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, msg[1]);
				controller = process[1];
				controller.exec(list, crud);
			}
		});
		
		crud.button[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, msg[2]);
				controller = process[2];
				controller.exec(list, crud);
			}
		});
		
		crud.button[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crud.frame.dispose();
			}
		});
	}
}

public class mvc001 {
	public static void main(String[] args) {
		new use_MVC().step_intro();		// intro 불러옴
	}
}

/*
 * 
 * 
 * 
 */