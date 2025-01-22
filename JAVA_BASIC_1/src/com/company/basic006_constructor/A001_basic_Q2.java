package com.company.basic006_constructor;

class Myage002{
	String name;
	int age;
	
	public Myage002() {
		this.name = "갤럭시노트12";
		this.age = 110000;
	}

	void show(){
		System.out.printf("상품이름 : %s\n상품가격 : %d",name,age);
	}
}
public class A001_basic_Q2 {
	public static void main(String[] args) {
		Myage002 product = new Myage002();
		product.show();
	}
}
