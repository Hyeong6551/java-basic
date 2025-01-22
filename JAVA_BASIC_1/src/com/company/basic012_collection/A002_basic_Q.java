package com.company.basic012_collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Milk{
	private String name;
	
	@Override
	public int hashCode() { return Objects.hash(age, name); } // 고유 객체를 가져와 Milk가 맞는지 확인 
	
	@Override
	public boolean equals(Object obj) {		// 중복코드를 해결해줌. 그 안에 있는 값이 맞는지 확인하는 코드
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Milk other = (Milk) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

	private int age;

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getage() { return age; }
	public void setage(int age) { this.age = age; }
	
	public Milk() { super(); }
	public Milk(String name, int age) { super(); this.name = name; this.age = age; }
	
	@Override
	public String toString() { return "Milk [name=" + name + ", age=" + age + "]"; }
}

public class A002_basic_Q {
	public static void main(String[] args) {
		Set<Milk> set = new HashSet<>();
		// Q1. add 이용하여 값 넣기
		
		set.add(new Milk("Banana",1800));
		set.add(new Milk("White",1200));
		set.add(new Milk("Choco",1500));
		set.add(new Milk("Choco",1500));
		
		System.out.println(set.size());		// 4개가 출력됨. hashCode() equals()를 사용하여 중복제거
		
		for(Milk m : set) {		
			System.out.println(m.getName()+" / "+m.getage());
			
		}
	}
}
