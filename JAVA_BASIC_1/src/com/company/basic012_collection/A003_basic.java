package com.company.basic012_collection;

import java.util.HashMap;
import java.util.Map;

/*
 * List(기차) - 순서 O, 중복 O, add/get/size/remove/contains
 * Set(주머니) - 순서 X, 중복 X, add/Iterator/size/remove/contains
 * Map(사전) - 키:값 형식, 중복 X, put/get/size/remove/containsKey
 * 
 */

public class A003_basic {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("one","하나");
		map.put("two","둘");
//		map.put("one","셋");		// 키가 같으면 가장 마지막으로 추가한 데이터로 덮어씀 
		map.put("three", "셋");
		System.out.println(map);
		
		System.out.println(map.get("one"));		// key 값을 넣으면 value 값 출력
		System.out.println(map.size());
		System.out.println(map.remove("three"));
		System.out.println(map);
		System.out.println(map.containsKey("one"));
		
		for(String key : map.keySet()) {
			System.out.println(key+" / "+map.get(key));
		}
	}
}
