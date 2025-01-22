package com.company.basic006_constructor;

class Student001{	// .class
	String name;
	int kor,eng,math,no;
	
	void info() {
		int tot=kor + eng+ math;
		float avg=tot/3f;
		System.out.printf("이름 : %s\n총점 : %d\n평균 : %.2f",name, tot,avg);
	}
}

public class A001_basic_Q {		// .class
	public static void main(String[] args) {
		Student001 s1 = new Student001();
		// 1. new (heap)		
		// 2. Student001() - 생성자 호출하여 초기화
		// 3. s1
		s1.name = "first";
		s1.no=11;
		s1.kor=100;
		s1.eng=100;
		s1.math=99;
		s1.info();
	}
}

/* 3. Stduent001 s1 = new Student001();
-------------------------------------
[method : 정보, static, final]  Student001, A001_basic_Q
-------------------------------------
[heap : 동적]		| [step : 잠깐빌리기]
1000번지 
Student001{name: null, no:0, kor:0, eng:0, math:0}			←	a1 (1000번지)
1000번지 
Student001{name: "first", no:11, kor:100, eng:100, math:99}	←	s1.info() (1000번지 따라가서 info)

				| main
-------------------------------------
*/