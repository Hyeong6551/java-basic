package com.company.basic009_abstract_interface;

interface Board{
	public void exec();
}

class BoardInsert implements Board{	
	@Override
	public void exec() {
		System.out.println("게시판 삽입기능");
	}
}

class BoardDelete implements Board{
	@Override
	public void exec() {
		System.out.println("게시판 삭제기능");
	}
}

class BoardSelect implements Board{
	@Override
	public void exec() {
		System.out.println("게시판 선택기능");
	}
}

class BoardUpdate implements Board{
	@Override
	public void exec() {
		System.out.println("게시판 수정기능");
	}
}

public class A002_basic_Q {
	public static void main(String[] args) {
		Board board = null;	// Board interface로 선언되어 static, final이라 new 사용 안됨
		board = new BoardInsert(); board.exec();
		board = new BoardDelete(); board.exec();
		board = new BoardSelect(); board.exec();
		board = new BoardUpdate(); board.exec();
	}
}
