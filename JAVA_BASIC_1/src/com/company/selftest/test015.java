package com.company.selftest;

public class test015 {
	public static void main(String[] args) {
		//SelfTest015
		int[] a = new int[5];
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.printf("%d ",a[i]);
		}
	}
}
