package com.company.basic008_polymorphism;

/*	
 * Object
 *   ↑
 * Color	name(private)	/ getter/setter 
 *   ↑
 * Green	num(private)	/ getter/setter, show(이름, 갯수)	Green() {#1 }
 * 
 */

class Color extends Object{
	private String name;

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}

class Green extends Color{
	private int num;

	public int getNum() { return num; }
	public void setNum(int num) { this.num = num; }
	
	void show() {
		System.out.printf(":::::Green\n= Name : %s\n= NUM : %d",getName(),getNum());
	}
}

public class A001_basic_Q {
	public static void main(String[] args) {
		Green mygreen = new Green();
		mygreen.setName("Light_Green");
		mygreen.setNum(5);
		mygreen.show();
	}
}
