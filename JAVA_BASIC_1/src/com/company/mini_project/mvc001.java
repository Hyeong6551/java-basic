package com.company.mini_project;

import java.util.ArrayList;
import java.util.List;


class use_MVC{
	//model 
	List<U_Info> list = new ArrayList<U_Info>();
	
	//view
	View_intro intro;
	View_crud crud;
	
	//controller
	InfoProcess controller;
	InfoProcess [] process;		// InfoCreate, InfoRead, InfoUpdate, InfoDelete
	
	// function
	// intro
	public void step_intro() {
		
	}
	
	// crud
	public void step_crud() {
		
	}
	

}

public class mvc001 {
	public static void main(String[] args) {
		new use_MVC().step_intro();		// intro 불러옴ㄴ
	}
}

/*
 * 
 * 
 * 
 */