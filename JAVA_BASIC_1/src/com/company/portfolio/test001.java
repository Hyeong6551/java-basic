package com.company.portfolio;

import java.util.ArrayList;
import java.util.Iterator;

public class test001 {
	public static void main(String[] args) {
		// 0. UserInfo test
		UserInfo user = new UserInfo("first","first@gmail.com");
		System.out.println(user);
		
		// 1. ArrayList
		// index O, 중복 O, add/get/size/remove/contains
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(new UserInfo("hello","bros@gmail.com"));
		list.add(new UserInfo("welcome","toMyHouse@gmail.com"));
		list.add(new UserInfo("ccc","bal@gmail.com"));
		//UserInfo		cnt=0	수정
		
		// 2. Iterator 이용해서 전체 데이터 출력
		Iterator <UserInfo> userIter = list.iterator();
		while(userIter.hasNext()) {
			UserInfo temp = userIter.next();
			System.out.println(temp);
		}
		
		// 3. no가 2이면 abc@gmail.com로 변경
		userIter = list.iterator();			// 중요
		while(userIter.hasNext()) {
			UserInfo temp = userIter.next();
			if(temp.getNo()==2) {
				temp.setEmail("abc@gmail.com"); break;
			}
		}
		System.out.println(list);
		
		// 4. no가 2번인 데이터 삭제
		userIter = list.iterator();
		while(userIter.hasNext()) {
			UserInfo temp = userIter.next();
			if(temp.getNo()==2) {
				userIter.remove();	break;		//userIter가 가리키는 번호를 삭제
			}
		}
		System.out.println(list);
	}
}
