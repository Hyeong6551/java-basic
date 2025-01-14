package com.company.basic003;

public class A005_basic_Q {
	public static void main(String[] args) {
		int result=0;
		
		//Q1
		for(int i=1;i<=20;i++) {
			if(i%2!=0 && i%3!=0) {
				result += i;
			}
		}
		System.out.println(result);
		result=0;
		
		//Q2
		int i=1;
		while(i<=20) {
			if(i%2!=0 && i%3!=0) {
				result += i;
			}
			i++;
		}
		System.out.println(result);
		result=0;
		
		//Q3
		int j=1;
		do {
			if(j%2!=0 && j%3!=0) {
				result += j;
			}
			j++;
		}while(j<=20);
		System.out.println(result);
	}
}
