package com.company.basic002;

import java.util.Scanner;

public class A003_basic_Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = "-";
		String k_lvl="가", e_lvl="가", m_lvl="가";
		char grade = '가';
		
		String pass = "불합격";
		
		System.out.println("학번 입력");
		int stdid = sc.nextInt();
		System.out.println("국어 점수 입력");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력");
		int eng = sc.nextInt();
		System.out.println("수학 점수 입력");
		int math = sc.nextInt();
		
		int tot = kor + eng + math;
		float avg  = tot/(float)3;
		int lvl = (int)avg/10;
		
		if(avg>=70) { pass="합격"; }
		else if(kor<40 || eng<40 || math<40) { pass="재시험"; }
		
		if(avg>=95 && avg<=100) { n="장학생"; }
		
		if(avg>=90) { grade = '수'; } 
		else if(avg>=80) { grade = '우'; } 
		else if(avg>=70) { grade = '미'; } 
		else if(avg>=60) { grade = '양'; }
		
		if(kor>=90) { k_lvl = "수"; }
		else if(kor>=80) { k_lvl = "우"; } 
		else if(kor>=70) { k_lvl = "미"; } 
		else if(kor>=60) { k_lvl = "양"; }
		else if(kor<40) { k_lvl = "재시험"; pass="재시험"; }
		
		if(eng>=90) { e_lvl = "수"; }
		else if(eng>=80) { e_lvl = "우"; } 
		else if(eng>=70) { e_lvl = "미"; } 
		else if(eng>=60) { e_lvl = "양"; }
		else if(eng<40) { e_lvl = "재시험"; pass="재시험"; }
		
		if(math>=90) { m_lvl = "수"; }
		else if(math>=80) { m_lvl = "우"; } 
		else if(math>=70) { m_lvl = "미"; } 
		else if(math>=60) { m_lvl = "양"; }
		else if(math<=39) { m_lvl = "재시험"; pass="재시험"; }

		
		System.out.println("============================================================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생\t레벨");
		System.out.println("============================================================================");
		System.out.printf("std%d\t"+"%d(%s)\t"+"%d(%s)\t"+"%d(%s)\t"+tot+"\t"+"%.2f"+"\t"+pass+"\t"+grade+"\t"+n+"\tLv%d",stdid,kor,k_lvl,eng,e_lvl,math,m_lvl,avg,lvl);
	}
}
