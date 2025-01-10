package com.company.basic002;

import java.util.Scanner;

public class P003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("년도 입력");
		int year = sc.nextInt();
		
		int y1 = year%4, y2 = year%100, y3 = year%400;
		
		System.out.println((y1==0 && y2==0 && y3==0)?"윤년":
				(y1==0 && y2==0)?"평년":
				y1==0?"윤년":"error");
	}
}
