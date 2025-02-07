package com.company.java_test;

import java.util.ArrayList;
import java.util.Iterator;

class UserInfo{
	private String name;
	private int age;
	public UserInfo() { super(); }
	public UserInfo(String name, int age) { super(); this.name = name; this.age = age; }
	public String getName() { return name; } public void setName(String name) { this.name = name; }
	public int getAge() { return age; } public void setAge(int age) { this.age = age; }
	@Override
	public String toString() { return "UserInfo [name=" + name + ", age=" + age + "]"; }
}

public class Test008 {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<>();
	
		list.add(new UserInfo("아이언맨",30));
		list.add(new UserInfo("헐크",40));
		list.add(new UserInfo("캡틴",80));
		
		Iterator <UserInfo> iter = list.iterator();
		while(iter.hasNext()) {
			UserInfo u = iter.next();
			System.out.println(u.toString());
		}
	}
}
