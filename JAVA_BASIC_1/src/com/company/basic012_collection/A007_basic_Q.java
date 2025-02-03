package com.company.basic012_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class A007_basic_Q {
	public static void main(String[] args) {
		Map<String,String> exMap = new HashMap<>();
		
		exMap.put("피구왕", "통키");
		exMap.put("제빵왕", "김탁구");
		exMap.put("요리왕", "비룡");
		
		System.out.println(exMap.entrySet());
		
		Scanner sc = new Scanner(System.in);
		String name = "\u0000";
		
		
		System.out.print("이름을 입력하세요 > ");
		name = sc.next();
		
		Iterator <Entry <String, String>> entIter = exMap.entrySet().iterator();
		while(entIter.hasNext()) {
			Entry <String, String> temp = entIter.next();
			if(temp.getKey().equals(name)) {
				System.out.println(temp.getValue());
			}
		}
		
		Iterator <String> keyIter = exMap.keySet().iterator();
		while(keyIter.hasNext()) {
			String temp = keyIter.next();
			if(temp.equals(name)) {
				System.out.println(exMap.get(temp));
			}
		}
		System.out.println(exMap.containsKey(name)?(exMap.get(name)):"error");
	}
}
