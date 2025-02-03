package com.company.basic012_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//List : 순서 O, 중복 O, add/get/size/remove/contains
//List - ArrayList	/ Vector / LinkedList

//ArrayList 와 LinkList 차이점
//https://f-lab.kr/insight/java-arraylist-vs-linkedlist-20240521	

public class A005_basic {
	public static void main(String[] args) {
		// ArrayList (객체 삭체 시 인덱스가 1개씩 앞으로 당겨짐) -> 데이터를 조회할 때 사용
		// LinkedList (데이터+주소, 객체 삭제 시 앞뒤 링크만 변경) -> 데이터 변경(삽입, 삭제) 시 사용
		
		List<String> arrlist = new ArrayList<>();
		List<String> linklist = new LinkedList<>();
		
		long start, end;
		
		System.out.println("데이터 변경 시간 비교");
		start = System.nanoTime();
		for(int i=0;i<10000;i++) { arrlist.add(0,String.valueOf(i));}
		end = System.nanoTime();
		System.out.println("ArrayList : " + (end-start) + "ns");
		
		start = System.nanoTime();
		for(int i=0;i<10000;i++) { linklist.add(0,String.valueOf(i));}
		end = System.nanoTime();
		System.out.println("LinkedList : " + (end-start) + "ns");
		
		System.out.println("\n데이터 조회 시간 비교");
		start = System.nanoTime();
		for(int i=0;i<10000;i++) { arrlist.get(i); }
		end = System.nanoTime();
		System.out.println("ArrayList : " + (end-start) + "ns");
		
		start = System.nanoTime();
		for(int i=0;i<10000;i++) { linklist.get(i); }
		end = System.nanoTime();
		System.out.println("LinkedList : " + (end-start) + "ns");
	}
}

	