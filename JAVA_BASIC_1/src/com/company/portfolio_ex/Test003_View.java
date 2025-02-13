package com.company.portfolio_ex;

public class Test003_View {
	public static void main(String[] args) {
		
		//ver-1   new UserView_intro().show();
		//ver-2
		View_crud crud = new View_crud();
		crud.show();
		
		// 1. 데이터 추가 -  add
		Object[] data = {1 , "aaa" ,"aaa@gmail.com" , "2025-02-05"};
		crud.model.addRow(data);
	}
}
