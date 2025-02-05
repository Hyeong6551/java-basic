package com.company.basic016_network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 1. Dto
// 2. ArrayList 작성
// 3. list 데이터 넣기
// 4. 나이순으로 정렬

class UserInfo {
	private int no;
	private String name; 
	private int age;
	
	public UserInfo(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	public int getNo() { return no; }  public void setNo(int no) { this.no = no; }
	public String getName() { return name; }  public void setName(String name) { this.name = name; }
	public int getAge() { return age; }  public void setAge(int age) { this.age = age; }
	
	@Override
	public String toString() {
		return "UserInfo [no=" + no + ", name=" + name + ", age=" + age + "]";
	}
}
public class A002_basic {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<>();
		
		list.add(new UserInfo(1,"aaa",10));
		list.add(new UserInfo(2,"bbb",13));
		list.add(new UserInfo(3,"ccc",12));
		System.out.println("정렬 전\n"+list);
		
		// sort(List<T> list, Comparator<? super T> c)
		// 1. Comparator -> interface -> new Comparator() {}
		// 2. <? super UserInfo> ->	UserInfo 포함 부모들
		Collections.sort(list, new Comparator<UserInfo>() {
			@Override
			public int compare(UserInfo o1, UserInfo o2) {
				// 기본적으로 오름차순으로 되어있음
				// name 내림차순	(String)
//				return o2.getName().compareTo(o1.getName());
				
				// age 내림차순	(int)
				return o2.getAge() - o1.getAge();
			}
		});
		System.out.println("정렬 후\n"+list);
		
	}
}
