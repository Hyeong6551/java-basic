package com.company.basic006;

class MyPrice002{
	String name;
	int price;
	
	public MyPrice002() {
		this.name = "갤럭시노트12";
		this.price = 110000;
	}

	void show(){
		System.out.printf("상품이름 : %s\n상품가격 : %d",name,price);
	}
}
public class A001_basic_Q2 {
	public static void main(String[] args) {
		MyPrice002 product = new MyPrice002();
		product.show();
	}
}
