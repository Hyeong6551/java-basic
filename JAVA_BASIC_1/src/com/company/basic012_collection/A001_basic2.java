package com.company.basic012_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

// 0. dto (data transform object)	-	alt + shift + s : 2,3,4

// 1. 클래스는 부품객체
// 2. 클래스는 상태(name, age)와 행위

class UserInfo{
	private String name;
	private int age;
	
	public UserInfo() { super(); }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getage() { return age; }
	public void setage(int age) { this.age = age; }
	
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; } 
	@Override
	public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
}

// List(기차) - 순서 O, 중복 O
public class A001_basic2 {
	public static void main(String[] args) {
		List<UserInfo> users = new ArrayList<>();
		users.add(new UserInfo("Iron",20));		
		users.add(new UserInfo("Hulk",30));		
		users.add(new UserInfo("Captain",40));	
		users.add(new UserInfo("Captain",40));	// 중복 허용이기에 똑같은 값 넣어도됨
		
		System.out.println("====UserInfo====");
		for(int i=0;i<users.size();i++) {
			System.out.println(users.get(i));
		}
		
		// Q1. 사용자 이름 받기
		Scanner sc = new Scanner(System.in);
		
		System.out.println("User정보 입력>");
		String name = sc.next();
		
		// Q2. 만약 사용자의 이름을 찾아서 같다면
		for (int i=0;i<users.size();i++) {
			if(name.equals(users.get(i).getName())) {
				System.out.println(users.get(i));
				break;
			}
		}
	}
}
