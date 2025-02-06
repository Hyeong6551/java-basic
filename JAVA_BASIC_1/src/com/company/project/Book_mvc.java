package com.company.project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class use_Book_mvc{
	// model
	ArrayList<BookInfo> books;
	ArrayList<myBookInfo> myBooks;
	
	// view
	View_Intro_Page intro;
	View_Admin_crud admin;
	View_User_crud user;

	// controller
	BookProcess controller;
	BookProcess[] process;
	myBookProcess myController;
	myBookProcess[] myProcess;
	
	// constructor
	public use_Book_mvc() {
		books = new ArrayList<>();
		myBooks = new ArrayList<>();
		
		intro = new View_Intro_Page();		intro.Show_Intro();
		admin = new View_Admin_crud();
		user = new View_User_crud();
		
		process = new BookProcess[] {new BookCreate(), new BookUpdate(), new BookDelete()};
		myProcess = new myBookProcess[] {new myBookBorrow()};
	}
	
	// 행위 - 기능 - 멤버함수
	public void start_Intro() {
		intro.button[0].addActionListener(new ActionListener() {	// 관리자 페이지
			@Override
			public void actionPerformed(ActionEvent e) {
				intro.frame.dispose();
				admin.Show_Admin();
				start_Admin();
			}
		});
		
		intro.button[1].addActionListener(new ActionListener() {	// 사용자 페이지
			@Override
			public void actionPerformed(ActionEvent e) {
				intro.frame.dispose();
				user.Show_User();
				start_User();
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
		admin.ad_button[0].addActionListener(new ActionListener() {		// 책 추가
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[0];	controller.exec(books, admin);
			}
		});
		
		admin.ad_button[1].addActionListener(new ActionListener() {		// 책 변경
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[1];	controller.exec(books, admin);
			}
		});
		
		admin.ad_button[2].addActionListener(new ActionListener() {		// 책 삭제
			@Override
			public void actionPerformed(ActionEvent e) {
				controller = process[2];	controller.exec(books, admin);
			}
		});
		
		admin.ad_button[3].addActionListener(new ActionListener() {		// 사용자 페이지로 이동
			@Override
			public void actionPerformed(ActionEvent e) {
				admin.frame.dispose();
				user.Show_User();
				start_User();
			}
		});
		
		admin.ad_button[4].addActionListener(new ActionListener() {		// 종료
			@Override
			public void actionPerformed(ActionEvent e) {
				admin.frame.dispose();
			}
		});
	}
	
	//////////////////////////////////////		사용자 페이지
	public void start_User() {
		user.usr_button[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user.frame.dispose();
				admin.Show_Admin();
				start_Admin();
			}
		});
		
		user.usr_button[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				user.frame.dispose();
			}
		});
	}
}

public class  Book_mvc {
	public static void main(String[] args) {
		use_Book_mvc mvc = new use_Book_mvc();
		mvc.start_Intro();
	}
}
