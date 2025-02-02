package com.company.mission1;

class Static005{
	static String company="(주)";
	int a=10;
	static { company = "(주) DBDBIG"; }
	{a=20;}
	public Static005() { super(); a=30; }
	public Static005(int a) { super(); this.a=a; }
	void show() { int a=0; System.out.println(a); }
}
/*
	초기화 순서
	4 -> 6 -> 5 -> 7 -> 8 -> 9
*/