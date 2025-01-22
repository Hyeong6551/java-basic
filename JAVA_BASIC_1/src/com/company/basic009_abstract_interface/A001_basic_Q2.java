package com.company.basic009_abstract_interface;

abstract class Process{
	abstract double exec(int kor, int eng, int math);
	abstract double exec(int total);
	abstract String exec(double avg);
}
abstract class Print{
	abstract void show(ScoreDto std);
	abstract void show(ScoreDto []std);
}

class Score{
	private String name;
	private int kor,eng,math,total;
	private double avg;
}
class Total extends Process{

	@Override
	double exec(int kor, int eng, int math) {
		return 0;
	}

	@Override
	double exec(int total) {
		return 0;
	}

	@Override
	String exec(double avg) {
		return null;
	}
}
class Avg extends Process{

	@Override
	double exec(int kor, int eng, int math) {
		return 0;
	}

	@Override
	double exec(int total) {
		return 0;
	}

	@Override
	String exec(double avg) {
		return null;
	}
	
}
class ScoreDto extends Score{
	private String jang;
	private String star;
	private String pass;
}
class StdPrint extends Print{

	@Override
	void show(ScoreDto std) {
		
	}

	@Override
	void show(ScoreDto[] std) {
	}
}


public class A001_basic_Q2 {
	public static void main(String[] args) {
		ScoreDto std = new ScoreDto();
		Process process = null;	//총점, 평균, 장학생
		
		Print print = null;
		print = new StdPrint();
		print.show(std);
	}
}
