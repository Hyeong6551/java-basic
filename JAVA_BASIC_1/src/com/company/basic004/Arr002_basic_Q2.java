package com.company.basic004;

import java.util.Arrays;

public class Arr002_basic_Q2 {
	public static void main(String[] args) {
		//Q4
		char ch[] = {'B','a','n','a','n','a'};
		
		for (int i=0;i<ch.length;i++) {
			if (ch[i] >='a' && ch[i]<='z') {
				ch[i] -= 32;
			} else {
				ch[i] += 32;
			}
		}
		System.out.println(Arrays.toString(ch));
	
		//Q5
		int[] su = {-3,5,-1,9,-7};
		int cnt=0;
		
		for(int i=0;i<su.length;i++) {
			if(su[i]<0) {
				cnt++;
			}
		}System.out.println(cnt);
		
		//Q6
		int [] su2 = {-3,5,-1,9,-7,2,-11};
		int result=0;
		
		for(int i=0;i<su2.length;i++) {
			if(su2[i]>0 && su2[i]%2==1) {
				result += su2[i];
			}
		}System.out.println(result);
	}
}
