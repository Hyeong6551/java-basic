package com.company.basic012_collection;

import java.util.HashSet;
import java.util.Set;

/*
 * 일반적인 배열은 공간 갯수가 고정되어있음
 * 고정되지 않은 배열을 쓰고 싶다 => collection (List, Set, Map)
 * List(기차) 	= 	순서(index) 존재 	, 중복 허용 	, add/get/size/remove/contains
 * Set(주머니) 	= 	순서(index) X	 	, 중복 X		, add/Iterator/size/remove/contains
 *  
 */

public class A002_basic {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		System.out.println(set);				// 순서 없이 랜덤으로 출력됨
		System.out.println(set.size());
		System.out.println(set.contains("Five"));
		System.out.println(set.remove("Five"));		// 순서가 없으므로 인덱스 번호로 삭제 불가능
		System.out.println(set);
		
		for(String s : set) {	// 배열 안에 있는 내용 출력
			System.out.println(s);
		}
	}
}
