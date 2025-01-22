package com.company.basic009_abstract_interface;

interface Vehicle { 
	public void run(); 
}

class MotorCycle implements Vehicle{
	@Override
	public void run() {
		System.out.println("오토바이");
	}
}

class Car implements Vehicle{
	@Override
	public void run() {
		System.out.println("자동차");
	}
}

class Driver{
	public void drive(Vehicle v) { v.run();	}	// 오버라이드된 자식들 호출
}

public class A002_basic_Q2 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Car car = new Car();
		MotorCycle mc = new MotorCycle();
		
		driver.drive(car);
		driver.drive(mc);
		
	}
}
