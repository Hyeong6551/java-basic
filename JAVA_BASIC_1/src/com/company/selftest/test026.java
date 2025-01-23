package com.company.selftest;

public class test026 {
	public static void main(String[] args) {
		//SelfTest026
		Milk [] milks = new Milk[3];
		
		milks[0] = new Milk();
		milks[1] = new Milk("choco",1200);
		milks[2] = new Milk("banana",1500);
		
		for(int i=0;i<milks.length;i++) {
			System.out.println(milks[i]);
		}
	}
}
