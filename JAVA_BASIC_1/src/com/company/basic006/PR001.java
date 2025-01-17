package com.company.basic006;

import java.util.Scanner;

// Q1. Object Oriented Programming
// Q2. 여러 부품객체들 조립하여 완성된 프로그램을 만듦
// Q3. 클래스 : 인스턴스화를 하여 여러 객체들을 만듦 / 인스턴스 : 각각의 특징이 담겨 있는 객체
// Q4. (1) new (2) A11 (3) a1
// Q5. (4) 초기화 (5) new 호출 (6) 없다
// Q6. 기본생성자를 반드시 선언 - 오버로딩 시, 이름은 같은데 파라미터와 자료형과 갯수가 다를 때
//	   					   상속
//     

/*
class A11{
	int a;
	A11(){}	
}
public class EX001{
	public static void main(String[] args){
	A11 a1 = new A11();
	// new - heap 메모리 빌리기, 객체 생성
	// A11() - String null, int 0으로 초기화하는 역할
	// a1 - new A11() 한 주소를 갖고 있음		
	}
*/

/*  RUNTIMEDATA AREA    
-------------------------------------------------------------
[method: 정보, static, final] A11 EX001       
-------------------------------------------------------------
[heap:동적]                       |[stack: 잠깐빌리기]
1000번지 A11 (a=0)				← a1[1000번지] 
								 | main
-------------------------------------------------------------
*/

class TV002{
	String channel;
	int volume;
	
	void show() {
		System.out.printf("===== TV\nTV채널 : %s\nTV볼륨 : %d\n",channel,volume);
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print(":::::::::::MYTV\n::TV채널입력 >");
		channel = sc.next();
		System.out.print("::TV볼륨입력 >");
		volume = sc.nextInt();
	}
	
	public TV002(String channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}
	public TV002() { super(); }
	@Override
	public String toString() {
		return "TV002 [channel=" + channel + ", volume=" + volume + "]";
	}
}

public class PR001 {
	public static void main(String[] args) {

		// Q7
		// 생성자를 직접 건들경우 - 오버로딩 발생 - 기본생성자를 직접 선언해야함
		TV002 a1 = new TV002("MBC",6);	a1.show();
		TV002 a2 = new TV002();		a2.input();		a2.show();
	}
}
