package com.company.basic003;

public class A001 {
	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		for (int i=1; i<=10;i++) {
			System.out.print(i+"\t");
		}
		System.out.println("");
		
		// 1 2
		for (int i=1; i<=10;i++) { 
			if(i==3) { break; }
			System.out.print(i+"\t");
		}
		System.out.println("");
		
		// 1 2 4 5 6 7 8 9 10
		for (int i=1; i<=10;i++) { 
			if(i==3) { continue; }
			System.out.print(i+"\t");
		}
	}
}
