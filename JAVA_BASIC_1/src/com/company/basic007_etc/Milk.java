package com.company.basic007_etc;

public class Milk {
   private int  mno;   
   private String mname;  
   private  int mage;
   
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMage() {
		return mage;
	}
	public void setMage(int mage) {
		this.mage = mage;
	}
	@Override
	public String toString() {
		return "Milk [mno=" + mno + ", mname=" + mname + ", mage=" + mage + "]";
	}  
   
   
}
