package com.company.basic012_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A001_basic {
	public static void main(String[] args) {
		String [] arr = new String[3];	// 공간 3개 고정
		System.out.println(Arrays.toString(arr));
		
		List list = new ArrayList();	// 자료형 상관없이 추가 가능
		list.add("one");
		list.add(1);
		list.add(3.14);
		System.out.println(list);	// 배열처럼 보이지만..?
	
		List<String> list2 = new ArrayList<>();	// String 만 추가
		list2.add("two");
//		list2.add(2);	// integer 는 안됨
		System.out.println(list2);
		
		// Q1 List를 사용하여 add를 이용해 "one","two","three"를 넣고 출력
		List<String> q1 = new ArrayList<>();
		q1.add("one");	q1.add("two");	q1.add("three");
		System.out.println("갯수 > " + q1.size());
		System.out.println("꺼내옹기 > " + q1.get(0));
		System.out.println("포함 > " + q1.contains("two"));
		System.out.println("삭제 > " + q1.remove(0));
		System.out.println(q1);
	}
}
/*
 * List(기차) - 순서 O,	중복 O,	add/get/size/remove/contains 
 * 
 */