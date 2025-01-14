package com.company.basic004;

public class Arr002_basic_Q {
	public static void main(String[] args) {
		//Q1
		char ch[] = {'B','a','n','a','n','a'};
		int cnt=0;
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a') {
				cnt += 1;
			}
		}
		System.out.println("a의 갯수 : "+cnt);
		
		//Q2
		int l=0,u=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z') {
				l++;
			} else if(ch[i]>='A' && ch[i]<='Z') {
				u++;
			}
		} 
		System.out.printf("대문자의 갯수 : %d, 소문자의 갯수 : %d\n",u,l);
		
		//Q3
		char ch2[];
		ch2 = new char[52];
		cnt = 0;
		char[] lower = {'a','e','i','o','u','A','E','I','O','U'};
		
		char A ='A', a = 'a';
		for(int i=0;i<ch2.length;i++) {
			if(i<26) {
				ch2[i] = A++;
			} else {
				ch2[i] = a++;
			}
			for(int j=0;j<lower.length;j++) {
				if(ch2[i]==lower[j]) {
					cnt++;
				}
			}
		}
		System.out.println("모음의 갯수 : "+cnt);
	}
}
