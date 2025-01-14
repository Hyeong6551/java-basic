package com.company.basic004;

public class Arr001_basic_Q {
	public static void main(String[] args) {
		//Q1
		double fl[] = {1.1,1.2,1.3,1.4,1.5};
		
		for(int i=0;i<fl.length;i++) {
			System.out.print(fl[i]+"\t");
		}
		System.out.println();
		
		//Q2
		char ch[] = {'A','B','C','D','E'};
		
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]+"\t");
		}
		System.out.println();
		
		//Q3
		String name[] = {"아이언맨", "헐크", "캡틴"};
		
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+"\t");
		}
	}
}
