package com.company.basic012_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class A004_basic_Q {
	public static void main(String[] args) {
		ScoreDto001[] scArr = new ScoreDto001[] {
			new ScoreDto001("아이언맨", 30,40,50),
			new ScoreDto001("헐크", 40,60,70),
			new ScoreDto001("캡틴", 80,90,100)
		};
		
		List<ScoreDto001> list = new ArrayList<>();
		
		// 데이터 넣기
		for(int i=0;i<scArr.length;i++) {
			list.add(scArr[i]);
		}
		
		// for + size
		System.out.println(":: for + size");
		for(int i=0;i<list.size();i++) {
			ScoreDto001 temp = list.get(i);
			System.out.println("이름 : "+temp.getName()+"\t총점 : "+(temp.getKor()+temp.getEng()+temp.getMath())+"\t평균 : "+temp.getAvg());
		}
		System.out.println();
		
		// 향상된 for 문
		System.out.println(":: 향상된 for 문");
		for(ScoreDto001 temp : list) {
			System.out.println("이름 : "+temp.getName()+"\t총점 : "+(temp.getKor()+temp.getEng()+temp.getMath())+"\t평균 : "+temp.getAvg());
		}
		System.out.println();
		
		// Iterator
		System.out.println(":: Iterator");
		Iterator<ScoreDto001> itr = list.iterator();
		while(itr.hasNext()) {
			ScoreDto001 temp = itr.next();
			System.out.println("이름 : "+temp.getName()+"\t총점 : "+(temp.getKor()+temp.getEng()+temp.getMath())+"\t평균 : "+temp.getAvg());
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String name = "\u0000";
		System.out.print("이름 입력 : ");
		name = sc.next();
		
		itr = list.iterator();
		while(itr.hasNext()) {
			ScoreDto001 temp = itr.next();
			if(temp.getName().equals(name)){
				System.out.println("총점 : "+(temp.getKor()+temp.getEng()+temp.getMath())+"\t평균 : "+temp.getAvg());
				break;
			} 
		}
	}
}

/*
	Q1. 외부에서 (다른 폴더에서 사용가능하게)
	// 생성자, toString, getters/setters
	public class Score{
		private String name;
		private int kor;
		private int eng;
		private int math;
		private int total;
		private double avg;
	}

	Q2. ArrayList 만들어서 데이터 넣기
	new ScoreDto001("아이언맨", 30,40,50);
	new ScoreDto001("아이언맨", 30,40,50);
	new ScoreDto001("아이언맨", 30,40,50);
	
	Q3. 출력
	for + size	 /	 향상된 for	 /	 Iterator
	
	Q4. 사용자에게 이름입력 받기 -> 그 사용자의 총점과 평균 출력
	
*/