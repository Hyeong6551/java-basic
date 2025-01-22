package com.company.selftest;

public class test016 {
	public static void main(String[] args) {
		//SelfTest016
		int[][] aa = new int[2][3];
		
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				aa[i][j] = 100*(i+1) + j;
			}
		}
		
		for(int i=0;i<aa.length;i++) {
			for(int j=0;j<aa[i].length;j++) {
				System.out.printf("%d ",aa[i][j]);
			}
			System.out.println();
		}
	}
}
