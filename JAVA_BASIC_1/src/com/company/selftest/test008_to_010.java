package com.company.selftest;

public class test008_to_010 {
	public static void main(String[] args) {
		// SelfTest008
		for(int i=1;i<=10;i++) {
			System.out.printf("%d ",i);
		}
		System.out.println();
		
		// SelfTest009
		int i=1;
		while(i<=10) {
			System.out.printf("%d ",i);
			i++;
		}
		System.out.println();
		
		// SelfTest010
		int j=1;
		do {
			System.out.printf("%d ",j);
			j++;
		} while (j<=10);
	}
}
