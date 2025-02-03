package com.company.basic012_collection;

import java.util.Vector;

//List : 순서 O, 중복 O, add/get/size/remove/contains
//List - ArrayList	/ Vector / LinkedList

//ArrayList 와 Vector 차이점
//https://yeolco.tistory.com/94		

// ArrayList 는 데이터를 조회할 때 사용
// LinkedList는 데이터를 변경(삽입, 삭제)할 때 사용 
// Vector는 thread를 사용하는 환경에서 사용하는 것이 좋음

public class A005_basic2 {
//	static List<String> list = new ArrayList<>();	// thread-unsafe	Test1)		
	static Vector<String> list = new Vector<>();	// thread-safe		Test2)		
	
	//
	public static void main(String[] args) {
		System.out.println("[1. main start]");
	
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				list.add("1");	list.add("2");	list.add("3");	list.add("4");	
				list.forEach( (data)->{
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("DATA-"+data);
				});
			}
		});
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		list.add("5");
		System.out.println(list);
		
		System.out.println("[2. main end]");		
	}
}

