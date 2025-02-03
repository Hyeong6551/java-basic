package com.company.basic012_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A006_basic {
	public static void main(String[] args) {
		UserInfo001[] arr = new UserInfo001[] { 
			new UserInfo001("아이언맨",50),new UserInfo001("헐크",40),
			new UserInfo001("캡틴",120),new UserInfo001("캡틴",120),new UserInfo001("캡틴",120)
		};
		
		// 1. HashSet을 이용
		Set<UserInfo001	> set = new HashSet<>();
		for (int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println(set.size());
		
		// 2. 출력
		for(UserInfo001 temp :set) {
			System.out.println(temp.getName() + "\t : \t" + temp.getAge());
		}
		
		Iterator<UserInfo001> iter = set.iterator();	// 1. 줄서기
		while(iter.hasNext()) {		// 2. 처리대상확인
			UserInfo001 temp = iter.next();		// 3. 꺼내오기
			System.out.println(temp.getName() + "\t : \t" + temp.getAge());
		}
	}
}
