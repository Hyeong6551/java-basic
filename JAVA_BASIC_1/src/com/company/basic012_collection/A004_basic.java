package com.company.basic012_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class A004_basic {
	 public static void main(String[] args) {
		 UserInfo001[] arr = new UserInfo001[]{
		 new UserInfo001("아이언맨",50), new UserInfo001("헐크",40), new UserInfo001("캡틴",120) , };
	
		 //##1. 데이터 입력 ( add, get, size, remove, contains)
		 List<UserInfo001> list = new ArrayList<>();
		 for(int i=0;i<arr.length;i++) {
			 list.add(arr[i]);
		 }

		 
		 //##2. 데이터 출력
		 for(int i=0;i<list.size();i++) {
			 UserInfo001 temp = list.get(i);
			 System.out.println(temp.getName()+"\t"+temp.getAge());
		 	}
		 
		 //##3. 향상된 for문
		 for(UserInfo001 temp : list) {
			 System.out.println(temp.getName()+"\t"+temp.getAge());
		 }
		 
		 //1. Iterator
		 //1-1. 리스트모으기	->	//1-2. 처리대상확인 (hasNext)	->	//1-3. 데이터가져오기 (next)
		 Iterator<UserInfo001> iter = list.iterator();	// iter -> ["AAA","BBB","CCC"]
		 while(iter.hasNext()) {	// 처리대상 iter  [->"AAA","BBB","CCC"]
			 UserInfo001 temp = iter.next();	// 꺼내오기 "AAA" 		["BBB","CCC"]->
			 System.out.println(temp.getName()+"\t"+temp.getAge());
		 }
	 }
}