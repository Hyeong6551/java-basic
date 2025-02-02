package com.company.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class use_Book_mvc{
	// model
	ArrayList<Book_Info> list;
	
	// view
	View_Intro_Page intro;
	View_Common_Page common; 
	View_Admin_Page admin;
	View_User_Page user;

	public use_Book_mvc() {
		intro = new View_Intro_Page();		intro.Show_Intro();
		common = new View_Common_Page();
		admin = new View_Admin_Page();
		user = new View_User_Page();
	}
	
	// controller
	public void start_Intro() {
		intro.button[0].addActionListener(new ActionListener() {	// 관리자
			@Override
			public void actionPerformed(ActionEvent e) {
				intro.frame.dispose();
				admin.Show_Admin();
				start_Admin();
			}
		});
		
		intro.button[1].addActionListener(new ActionListener() {	// 사용자
			@Override
			public void actionPerformed(ActionEvent e) {
				intro.frame.dispose();
				user.Show_User();
			}
		});
		
		intro.button[2].addActionListener(new ActionListener() {	// 종료
			@Override
			public void actionPerformed(ActionEvent e) {
				intro.frame.dispose();
			}
		});
	}
	
	//////////////////////////////////////		관리자 페이지
	public void start_Admin() {			
		admin.button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				admin.frame.dispose();
			}
		});
	}

}

public class  Book_mvc {
	public static void main(String[] args) {
		use_Book_mvc mvc =new use_Book_mvc();
		mvc.start_Intro();
	}
}
