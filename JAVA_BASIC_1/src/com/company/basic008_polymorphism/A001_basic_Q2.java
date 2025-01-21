package com.company.basic008;

class MobileNote7 extends Object{
	private String iris;

	public String getIris() { return iris; }
	public void setIris(String iris) { this.iris = iris; }
	
	void newShow() {
		System.out.printf("::::: NOTE7 새로운 기능(Overriding)\n iris 홍채인식기능!\n= myiris : %s\n",iris);
	}
}

class MobileNote8 extends MobileNote7{
	private String face;

	public MobileNote8() { super(); }
	public String getFace() { return face; }
	public void setFace(String face) { this.face = face; }
	
	@Override
	public void newShow() {
		super.newShow();
		System.out.printf("::::: NOTE8 새로운 기능(Overriding)\n face 안면인식기능!\n= face : %s\n",face);
	}
}

class MobileNote9 extends MobileNote8{
	private int battery;

	public MobileNote9() { super(); }
	public int getBattery() { return battery; }
	public void setBattery(int battery) { this.battery = battery; }	
	
	@Override
	public void newShow() {
		super.newShow();
		System.out.printf("::::: NOTE9 새로운 기능(Overriding)\n battery 하루종일 사용가능!\n= battery : %s\n",battery);
	}
}

public class A001_basic_Q2 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.setBattery(24);
		my9.newShow();
	}
}
