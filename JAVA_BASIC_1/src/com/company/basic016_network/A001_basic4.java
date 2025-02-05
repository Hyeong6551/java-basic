package com.company.basic016_network;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class A001_basic4 {
	public static void main(String[] args) {
		Gson gson = new Gson();
		JsonObject job = new JsonObject();
		job.addProperty("one", "일");
		job.addProperty("two", "이");
		job.addProperty("three", "삼");
		System.out.println( gson.toJson(job) );
		
		System.out.println( gson.toJson(new GTest(1,"hello")));
		
		JsonObject ex = new JsonObject();
		ex.addProperty("name", "alpha");
		ex.addProperty("age", 3);
		ex.addProperty("loc", "경기 시흥시");
		System.out.println(gson.toJson(ex));
		
		System.out.println(gson.toJson(new G_ex1("alpha",3,"경기 시흥시"))+"\n");
		String result = gson.toJson(ex);
		
		// JsonParser - get
		JsonParser parser = new JsonParser();
		JsonObject ex_result = (JsonObject) parser.parse(result);
		
		String name = ex_result.get("name").getAsString();
		String age = ex_result.get("age").toString();
		String loc = ex_result.get("loc").getAsString();
		
		System.out.println(name+"\t"+age+"\t"+loc);
	}
}

class GTest{
	private int no;
	private String name;
	public GTest(int no, String name) { super(); this.no = no; this.name = name; }
	
	public int getNo() { return no; } public void setNo(int no) { this.no = no; } 
	public String getName() { return name; } public void setName(String name) { this.name = name; }
}

class G_ex1{
	private String name;
	private int age;
	private String loc;
	public G_ex1(String name, int age, String loc) { super(); this.name = name; this.age = age; this.loc = loc; }
	
	public String getName() { return name; } public void setName(String name) { this.name = name; } 
	public int getAge() { return age; } public void setAge(int age) { this.age = age; } 
	public String getLoc() { return loc; } public void setLoc(String loc) { this.loc = loc; }
}

/*

https://repo1.maven.org/maven2/com/google/code/gson/gson/2.2.4/
project - Build Path - Add to Build Path

*/