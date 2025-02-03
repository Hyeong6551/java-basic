package com.company.basic012_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class A007_basic {
	public static void main(String[] args) {
		Map<Integer,UserInfo001> map = new HashMap<>();
		
		map.put(1, new UserInfo001("아이언맨", 50));
		map.put(2, new UserInfo001("헐크", 40)); 
        map.put(3, new UserInfo001("캡틴", 120));
		map.put(1, new UserInfo001("new 아이언맨", 50));			// 키 값이 겹치면 덮어씌움
	
		System.out.println(map);
		System.out.println(map.size());
		
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		Iterator <Integer> keyIter = map.keySet().iterator();
		while(keyIter.hasNext()) {
			Integer key = keyIter.next();
			System.out.println(key+"\t"+map.get(key));
		}
		
		System.out.println();
		Iterator <Entry <Integer, UserInfo001>> entIter = map.entrySet().iterator();
		while(entIter.hasNext()) {
			Entry <Integer, UserInfo001> key = entIter.next();
			System.out.println(key.getKey()+"\t"+key.getValue());
		}
	}
}
