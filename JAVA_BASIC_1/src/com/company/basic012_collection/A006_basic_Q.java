package com.company.basic012_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A006_basic_Q {
	public static void main(String[] args) {
		Set<ScoreDto001> set = new HashSet<>();
	
		set.add(new ScoreDto001("아이언맨",30,40,50));
		set.add(new ScoreDto001("아이언맨",30,40,50));
		set.add(new ScoreDto001("아이언맨",30,40,50));
		set.add(new ScoreDto001("헐크",40,60,70));
		set.add(new ScoreDto001("캡틴",80,90,100));
		
		System.out.println(set.size());
		
		Iterator <ScoreDto001> scIter = set.iterator();
		while(scIter.hasNext()) {
			ScoreDto001 temp = scIter.next();
			System.out.println("이름 : "+temp.getName()+"\t총점 : "+(temp.getKor()+temp.getEng()+temp.getMath())+"\t평균 : "+temp.getAvg());
		}
	}
}
