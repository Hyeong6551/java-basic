package com.company.mini_project;

import java.util.ArrayList;
import java.util.List;

// Q1. Dto
class U_Info{
	public static int cnt=0;	// 클래스 변수 (method area / new보다 먼저 올라감)
	private int no;				// 인스턴스 변수 (heap area / new O, this(생성자))
	private String name;		// 인스턴스 변수 (heap area / new O, this(생성자))
	
	public U_Info() { super();}
	public U_Info(String name) { super(); this.no = ++cnt; this.name = name; }
	@Override
	public String toString() { return "\nU_Info [no=" + no + ", name=" + name + "]"; }
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
}

// Q2. ArrayList Test
public class Test001_model {
	public static void main(String[] args) {
		// Q2-1. U_Info 자료형을 담는 ArrayList 만들기
		List<U_Info> u_list = new ArrayList<>();
	
		// Q3. add를 이용해서 new U_Info(1, "aaa@gmail.com") 입력
		u_list.add(new U_Info("aaa@gmail.com"));
		u_list.add(new U_Info("bbb@gmail.com"));
		u_list.add(new U_Info("ccc@gmail.com"));
		
		// Q4. R = get 이용해서 전체 출력
		for(U_Info u : u_list) {
			System.out.println("번호 : "+u.getNo() +" \t 이메일 : "+u.getName());
		}
		
		// Q5. U = 해당번호의 이메일 업데이트가 no=1의 name을 "abc@gmail.com"로 변경
		for(U_Info u : u_list) {
			if(u.getNo()==1) {
				u.setName("abc@gmail.com");
			}
		}
		System.out.println(u_list);
		
		// Q6. D = remove를 이용하여 1번 삭제
		u_list.remove(0);
		System.out.println(u_list);
	}
}
