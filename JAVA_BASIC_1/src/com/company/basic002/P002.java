package com.company.basic002;

import java.util.Scanner;

public class P002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("100~999 입력");
		int a = sc.nextInt();
		int result = ((a/10)*10)+1;
		System.out.println((a>=100 && a<1000)?"숫자는 "+a+" > "+result:"error");
	}
}
 