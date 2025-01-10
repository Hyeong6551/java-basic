package com.company.basic001;

import java.util.Scanner;

public class A011_basic_Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("학번 입력");
		int num = sc.nextInt();
		System.out.println("국어 점수");
		int kor = sc.nextInt();
		System.out.println("영어 점수");
		int eng = sc.nextInt();
		System.out.println("수학 점수");
		int math = sc.nextInt();
		
		int tot = kor+eng+math;
		float avg = tot/(float)3;
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":: GREEN IT SCORE ::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::");
		
		System.out.println("학번\t국어\t영어\t수학 \t총점\t평균\t\t합격여부\t레벨\t장학생");
		System.out.printf("std%d"+"\t"+kor+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg+"\t"
		+(avg>=60?"합격":"불합격")+"\t"+(avg>=90?"수(Lv%d)":avg>=80?"우(Lv%d)":avg>=70?"미(Lv%d)":avg>=60?"양(Lv%d)":"가(Lv%d)")
		+"\t"+(avg>=95?"장학생":""),num,(int)avg/10);
	}
}
