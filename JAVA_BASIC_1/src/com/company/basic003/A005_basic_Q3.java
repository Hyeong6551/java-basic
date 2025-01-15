package com.company.basic003;

public class A005_basic_Q3 {
	public static void main(String[] args) {
		int sum=0, tot=0;
		
		//Q1
//		for(int i=1;i<=10;i++) {
//			sum += i;
//			tot += sum;
//		}
//		System.out.println(tot); sum=0; tot=0;
//		
//		int n=1;
//		while(n<=10) {
//			sum += n;
//			tot += sum;
//			n++;
//		}
//		System.out.println(tot); sum=0; tot=0;
//		
//		int m=1;
//		do {
//			sum += m;
//			tot += sum;
//			m++;
//		}
//		while(m<=10);
//		System.out.println(tot); sum=0; tot=0;
		
		
		//Q1-Upgrade
		for(int i=1;i<=10;i++) {
		sum += i;
		tot += sum;
		}
		System.out.println(tot); sum=0; tot=0;
	}
}
