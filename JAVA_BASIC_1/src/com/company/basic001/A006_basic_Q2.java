package com.company.basic001;

import java.util.Scanner;

public class A006_basic_Q2 {
	public static void main(String[] args) {
		int kor=0, eng=0, math=0, total=0;
		float avg=0.0f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수입력 :");
		kor = sc.nextInt();
		System.out.println("영어점수입력 :");
		eng = sc.nextInt();
		System.out.println("수학점수입력 :");
		math = sc.nextInt();
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::");
		System.out.println(":: GREEN IT SCORE ::");
		System.out.println(":::::::::::::::::::::::::::::::::::::::");
		
		int result = kor + eng + math;
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+result+"\t"+(result/(float)3));
	}
}
