package com.company.mission1;

class Car014{
	static String company=" (주) 자동차 ";
	String model;
	int speed;
	Car014(String model) { this.model = model; }
	void setSpeed(int speed) { this.speed = speed; }
	void run() {
		System.out.println("자동차 "+model+"(이)가 속도 "+speed+"(으)로 달리고 있습니다.");
	}
}

public class static009 {
	public static void main(String[] args) {
		System.out.println("::::::"+ Car014.company+"::::::");
		Car014 myCar = new Car014("포르쉐");
		Car014 urCar = new Car014("벤츠");
		
		myCar.setSpeed(60);
		urCar.setSpeed(50);
		
		myCar.run();
		urCar.run();
	}
}
