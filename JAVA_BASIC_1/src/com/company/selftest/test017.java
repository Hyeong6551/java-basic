package com.company.selftest;

public class test017 {
	public static void main(String[] args) {
		//SelfTest017
		int [][] aa = new int[4][5];
		
		int n=1;
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				aa[i][j] = n++; 
			}
		}
		
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				System.out.printf("%d\t",aa[i][j]); 
			}
			System.out.println();
		}
	}
}
