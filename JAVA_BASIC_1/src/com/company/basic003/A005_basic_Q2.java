package com.company.basic003;

public class A005_basic_Q2 {
	public static void main(String[] args) {
		int n=0;	int tot=0;
		
		//Q1
		for(int i=1;i<=10;i++) {
			n += i;
			tot += n;
		}
		System.out.println(tot);	n=0; tot=0;
		
		//Q2
		int i=1;
		while(i<=10) {
			n += i;
			tot += n;
			i++;
		}
		System.out.println(tot);	n=0; tot=0;
		
		//Q3
		int j=1;
		do {
			n += j;
			tot += n;
			j++;
		}while(j<=10);
		System.out.println(tot);
	}
}
