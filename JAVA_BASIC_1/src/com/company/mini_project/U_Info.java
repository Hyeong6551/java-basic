package com.company.mini_project;

class  U_Info{
	//상태(멤버변수)
	public static int cnt=0;  //# 클래스변수  (  method / new 먼저올라감 )
	private int no;           //  인스턴스변수 (  heap  / new O , 생성자, this)
	private String email;     //  인스턴스변수
	public U_Info() { super(); }
	
	public U_Info(String email) { super(); this.no= ++cnt; this.email = email; } //#
	public U_Info(int no, String email) { super(); this.no = no; this.email = email; }
	@Override public String toString() { return "Info [no=" + no + ", email=" + email + "]"; }
	
	//행위(멤버함수)
	public int getNo() { return no; }
	public void setNo(int no) { this.no = no; }
	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }
}