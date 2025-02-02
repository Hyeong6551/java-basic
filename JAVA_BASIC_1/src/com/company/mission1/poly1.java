package com.company.mission1;

class Score_ver18{
	private String name;
	private int kor, eng, math, total;
	private double avg;
	private String p,s,rank;
		
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	
	public Score_ver18(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
}

class Process18{
	public Process18(Process18[] datas) {
		
	}
	public Process18() { super();  }

	public void run(Score_ver18[] std) {
		
	}
}

class Total18 extends Process18{
	
	public Total18() { super(); }
	public void run(int kor, int eng, int math, int total) {
		total = kor+eng+math;
	}
}

class Avg18 extends Process18{
	public Avg18() { super(); }
	public void run(double avg, int total) {
		avg = total/3f;
	}
}

class Pass18 extends Process18{
	public Pass18() { super(); }
	public void run(String p, double avg) {
		if(avg>=90) {
			p = "장학생";
		} else {
			p = " ";
		}
	}
}

class Jang18 extends Process18{
	public Jang18() { super(); }
	public void run(String s) {
		
	}
}

class Star18 extends Process18{
	
}

class Show18{
	public void show(Score_ver18[] std) {
		System.out.println("");
	}
}

public class poly1 {
	public static void main(String[] args) {
		Score_ver18 [] std = new Score_ver18[] { 
				new Score_ver18("아이언맨",100,100,100),
				new Score_ver18("헐크",90,60,80),
				new Score_ver18("블랙팬서",20,60,90)};
		
		Process18 [] datas = new Process18[] {
				new Total18(), new Avg18(), new Pass18(), new Jang18(), new Star18()
		};
		
		Process18 process = new Process18(datas);
		process.run(std);

		Show18 print = new Show18();
		print.show(std);
	}
}
