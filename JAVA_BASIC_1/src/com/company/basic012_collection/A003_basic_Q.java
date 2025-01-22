package com.company.basic012_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Fruit{
	private int no;
	private String name;
	
	public Fruit() { super();}
	public Fruit(int no, String name) { super(); this.no = no; this.name = name; }
	@Override
	public String toString() { return "Fruit [no=" + no + ", name=" + name + "]"; }
	
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	//중복되는 값 해결
	@Override
	public int hashCode() {
		return Objects.hash(name, no);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(name, other.name) && no == other.no;
	}
}

public class A003_basic_Q {
	public static void main(String[] args) {
		Map<Fruit, Integer> fr = new HashMap<>();
		
		fr.put(new Fruit(11,"Apple"),1);
		fr.put(new Fruit(11,"Apple"),1);
		fr.put(new Fruit(22,"Banana"),2);
		
		System.out.println(fr.size());
		
		for( Fruit f : fr.keySet()) {
			System.out.println(f + "/" + fr.get(f));	// f = 키, fr.get(f) = 값
		}
	}
}
