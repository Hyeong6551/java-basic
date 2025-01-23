package com.company.mini_project;

import java.util.ArrayList;

class InfoRead implements InfoProcess {
	@Override
	public void exec(ArrayList<U_Info> users) {
		System.out.println("2. 조회기능입니다.");
		for( U_Info u  : users) { System.out.println(u); }
	}
}