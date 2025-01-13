package com.company.basic003;

import java.util.Scanner;

public class A001_basic_Q {
	public static void main(String[] args) {
		int kor=-1, eng=-1, math=-1, tot=0, num=0;
		float avg=0;
		String name=" ", k_lvl=" ", e_lvl=" ", m_lvl=" ", pass=" ", great=" ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력");
		name = sc.next();
		
		// 0~100 입력, 아니라면 무한반복 
		// ★★★ 중요 ★★★
		for(;;) {
			if(!(kor>=0 && kor<=100)) { 
				System.out.println("국어 입력");
				kor = sc.nextInt();
				continue; 
			}
			
			if(!(eng>=0 && eng<=100)) { 
				System.out.println("영어 입력");
				eng = sc.nextInt();
				continue; 
			}

			if(!(math>=0 && math<=100)) { 
				System.out.println("수학 입력");
				math = sc.nextInt();
				continue; 
			}
			break;
		}
		
				
		// 총점, 평균
		tot=kor+eng+math;
		avg=tot/3f;
		
		// 국어, 영어, 수학 점수에 따른 등급
		k_lvl = kor +"(" + (kor>=90?"수":kor>=80?"우":kor>=70?"미":kor>=60?"양":"가") + ")";
		e_lvl = eng +"(" + (eng>=90?"수":eng>=80?"우":eng>=70?"미":eng>=60?"양":"가") + ")";
		m_lvl = math +"(" + (math>=90?"수":math>=80?"우":math>=70?"미":math>=60?"양":"가") + ")";
		
		// 평균이 95점 이상이면 장학생
		if(avg>=95) { great="장학생";}
				
		// 평균 70이상이면 합격, 단 세과목중 한 과목이라도 40미만이면 재시험, 평균이 70미만이면 불합
		if(avg>=70) {
			pass="합격";
			if(kor<40 || eng<40 || math<40) { pass="재시험"; }
		} else {
			pass="불합격";
		}
		
		System.out.println("======================================================================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println("======================================================================================");
		
		System.out.println(name+"\t"+k_lvl+"\t"+e_lvl+"\t"+m_lvl+"\t"+tot+"\t"+Math.round(avg*100)/100.0+"\t"+pass+"\t"+great+"\t"+"★".repeat((int)avg/10));
		sc.close();
	}
}
