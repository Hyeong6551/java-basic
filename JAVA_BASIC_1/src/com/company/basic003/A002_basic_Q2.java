package com.company.basic003;

public class A002_basic_Q2 {
	public static void main(String[] args) {
		//Q1
		int cnt=0;
		for(int i=1;i<=10;i++) {
			if(i%3==0) {
				cnt += 1;
			}
		}
		System.out.println(cnt);
		
		//Q2
		int i=1; cnt=0;
		while(i<=10) {
			if(i%3==0) {
				cnt += 1;
			}
			i++;
		}
		System.out.println(cnt);
		
		//Q3
		int j=1; cnt=0;
		do {
			if(j%3==0) {
				cnt += 1;
			}
			j++;
		} while(j<=10);
		System.out.println(cnt);
	}
}
