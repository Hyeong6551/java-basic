package com.company.basic012_collection;

import java.util.Objects;

public class ScoreDto001{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	@Override
	public String toString() {
		return "ScoreDto001 [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math
				+ ", avg=" + avg + "]";
	}
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getKor() { return kor; }
	public void setKor(int kor) { this.kor = kor; }
	public int getEng() { return eng; }
	public void setEng(int eng) { this.eng = eng; }
	public int getMath() { return math; }
	public void setMath(int math) { this.math = math; }
	public double getAvg() { return avg; }
	public void setAvg(double avg) { this.avg = avg; }

	public ScoreDto001(String name, int kor, int eng, int math) {
		super();
		this.name = name;	this.kor = kor;		this.eng = eng;
		this.math = math;
		this.avg  = Math.round(((this.math + this.kor + this.eng)/3.f)*100)/100.0;
	}

	public ScoreDto001(String name, int kor, int eng, int math, double avg) {
		super();
		this.name = name;	this.kor = kor;		this.eng = eng;
		this.math = math;	this.avg = avg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eng, kor, math, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreDto001 other = (ScoreDto001) obj;
		return eng == other.eng && kor == other.kor && math == other.math && Objects.equals(name, other.name);
	}
	
	
	
}
