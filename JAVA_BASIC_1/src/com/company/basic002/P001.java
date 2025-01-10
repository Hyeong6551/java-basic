package com.company.basic002;

import java.util.Scanner;

public class P001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("10~99 값 입력");
		int a = sc.nextInt();
		int result = ((int)(((a/10)+1)*10)-a);
		System.out.println((a%10==0)?(int)((a/10)*10)-a:
			(a<100 && a>=10)?result:"error");
		
		/////////////////////////
		System.out.println(10 - (a%10));
	}
}
