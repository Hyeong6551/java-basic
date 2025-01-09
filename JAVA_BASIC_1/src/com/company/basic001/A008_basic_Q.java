package com.company.basic001;

import java.util.Scanner;

public class A008_basic_Q {
	public static void main(String[] args) {
		//Q1
		String name="";
		int kor=0, eng=0, math=0, total=0;
		float avg = 0.0f;
		String level="";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수입력 :");
		kor = sc.nextInt();
		System.out.println("영어점수입력 :");
		eng = sc.nextInt();
		System.out.println("수학점수입력 :");
		math = sc.nextInt();
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":: GREEN IT SCORE ::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		
		total = kor + eng + math;
		avg = total/(float)3;
		System.out.println("국어\t영어\t수학\t총점\t레벨\t평균");
		System.out.println(kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+"Lv"+(int)avg/10+"\t"+avg);
	}
}
