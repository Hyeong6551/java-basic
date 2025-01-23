package com.company.selftest;

import java.util.HashMap;
import java.util.Map;

class dto_map{
	private int no;
	private String name;
	private int price;

	public dto_map(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return no + "\t" + name + "\t" + price;
	}
	
	
}

public class test031 {
	public static void main(String[] args) {
		Map<dto_map,Integer> mp = new HashMap<>();
		System.out.println("=========================\nNO\tNAME\tPRICE\n=========================");
		
		mp.put(new dto_map(1,"white",1000),1);
		mp.put(new dto_map(2,"choco",1200),2);
		mp.put(new dto_map(3,"banana",1300),3);
		
		for(dto_map d : mp.keySet()) {
			System.out.println(d);
		}
	}
}
