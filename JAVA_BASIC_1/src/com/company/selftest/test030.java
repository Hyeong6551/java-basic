package com.company.selftest;

import java.util.HashSet;
import java.util.Set;

class dto_set{
	private int no;
	private String name;
	private int price;
	
	public dto_set(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return no+"\t" +name + "\t" + price + "\n";
	}
}

public class test030 {
	public static void main(String[] args) {
		Set<dto_set> set = new HashSet<>();
		System.out.println("=========================\nNO\tNAME\tPRICE\n=========================");
		
		set.add(new dto_set(1,"white",1000));
		set.add(new dto_set(2,"choco",1200));
		set.add(new dto_set(3,"banana",1300));
		
		for(dto_set ds : set) {
			System.out.print(ds);
		}
	}
}
