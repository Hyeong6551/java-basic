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
		

	}
}
