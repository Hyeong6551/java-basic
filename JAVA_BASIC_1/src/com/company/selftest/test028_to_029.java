package com.company.selftest;

import java.util.ArrayList;
import java.util.List;

// SelfTest028
/*
List   :    순서 [O] , 중복허용 [O]  
		=>  사용가능메서드: [add][remove][size][get]
Set    :    순서 [x] , 중복허용 [x]  
		=>  사용가능메서드: [add][remove][size][Iterator]
Map    :    순서가아닌 [key,value]의 쌍(ENTRY)으로 이루어짐
               =>  사용가능메서드: [put][remove][size][get]  
*/

//SelfTest029
class dto_list{
	private int no;
	private String name;
	private int price;
	
	public dto_list(int no, String name, int price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return no+"\t" +name + "\t" + price + "\n";
	}
}

public class test028_to_029 {
	public static void main(String[] args) {
		List<dto_list> list = new ArrayList<>();
		System.out.println("=========================\nNO\tNAME\tPRICE\n=========================");
		
		list.add(new dto_list(1,"white",1000));
		list.add(new dto_list(2,"choco",1200));
		list.add(new dto_list(3,"banana",1300));
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i));
		}
	}
}


