package com.company.basic003;

import java.util.Scanner;

public class A004_basic_Q {
	public static void main(String[] args) {
		//Q1
		int cnt=0;
		for(int i=1;i<=30;i++) {
			if(i%3==0 && i%2==0) {
				System.out.println("3의 배수이면서 2의 배수인 숫자 : "+ i);
				cnt +=1;
			}
		}
		System.out.println("갯수 : "+cnt+"\n");
		
		//Q2
		int n=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				n += i;
			}
		}
		System.out.println("짝수의 합 : "+n+"\n");
		
		//Q3
		int y=0;
		for(int i=1;i<=2023;i++) {
			if((i%4==0 && i%100!=0) || i%400==0) {
				y += 1; 
			}
		}
		System.out.println("서기1년~서기2023년중에서 윤년의 갯수 : "+y+"\n");
		
		//Q4
		int cnt1=0;
		for(char i='a';i<='z';i++) {
			if(i=='a' || i=='e' || i=='i' || i=='o' || i=='u') {
				cnt1 += 1;
			}
		}
		System.out.println("소문자 a~z까지 모음의 갯수 : "+cnt1+"\n");
		
		//Q5
		for(char i='A';i<='Z';i++) {
			System.out.print(i);
			if(i%5==4) {
				System.out.println();
			}
		}
		System.out.println();
		
		//Q6
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("숫자 2 입력 : ");
		int num2 = sc.nextInt();
		
		int result=0, temp=0;
		
		if(num1<=num2) {
			for(int i=num1;i<=num2;i++) {
				System.out.print(i);
				result += i;
				if(i==num2) {
					System.out.print("=");
					break;
				}
				System.out.print("+");
			} 
		} else {
			for(int i=num1;i>=num2;i--) {
				System.out.print(i);
				result += i;
				if(i==num2) {
					System.out.print("=");
					break;
				}
				System.out.print("+");
			}
		}
		System.out.println(result);
	}
}
