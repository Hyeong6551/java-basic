package com.company.basic007_extends;

/*
 * Q1. Score 클래스 만들기 (부품객체)
 * 상태 : 멤버변수 - name, kor, eng, math, avg (private)
 * 행위 : 멤버함수 - 
 */

class Score{
	private String name;
	private int kor, eng, math;
	private double avg;
	
	public Score() { super(); }

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = (this.kor+this.eng+this.math)/3f;
	}

	@Override
	public String toString() {
		return name +"\t"+ kor + "\t" + eng + "\t" + math + "\t" + Math.round(avg*100)/100.0 + "\t";
	}
}

public class Arr001_basic_Q {
	public static void main(String[] args) {
		//Q2. 클래스 배열 만들기
//		Score scr = new Score();	// new 공간 빌림, 객체 생성 / Score() 초기화 사용 가능 / scr 주소
		
		Score arr[] = new Score[3];	// new 공간 빌림, 객체 생성 / 생성자 호출 X => 사용불가
		
		arr[0] = new Score("아이언맨",100,100,100);
		arr[1] = new Score("헐크",90,60,80);
		arr[2] = new Score("블랙팬서",20,60,90);

		//Q3. 다음과 같이 출력
		System.out.println("======================================");
		System.out.println("이름\t국어\t영어\t수학\t평균");
		System.out.println("======================================");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("======================================");
	}
}
