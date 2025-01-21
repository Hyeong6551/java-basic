package com.company.basic006;

//1. 클래스는 부품객체
//2. 클래스 상태(멤버변수) + 행위(멤버함수)
class Car66{
	String name="아우디";  int speed;
	{ name="BMW";   speed=120; }
	//alt + shift + s  
	public Car66(String name, int speed) { super(); this.name = name; this.speed = speed; }
	public Car66() { super(); }// 생성자 손대면 기본생성자 자동생성X
	@Override public String toString() { return "Car6 [name=" + name + ", speed=" + speed + "]"; }
}
public class Class006_init2 {
	 public static void main(String[] args) {
		 Car66 car61 = new Car66();            System.out.println(car61);// 사용자가 잘모를경우
		 Car66 car62 = new Car66("벤츠" , 150); System.out.println(car62); 
		 Car66 car63 = new Car66("EV6" , 120); System.out.println(car63); 
	}
}
/*   	 기본값  →  명시적초기화(name="아우디")  → 초기화블록({ name="BMW";   speed=120; })  → 생성자
name     null     아우디                      BMW                                      BMW
speed	 0	      0                         120                                      120 

*/



/*  RUNTIMEDATA AREA    
-------------------------------------------------------------
[method: 정보, static, final]       
-------------------------------------------------------------
[heap:동적]                       |[stack: 잠깐빌리기] 
								 | main
-------------------------------------------------------------
*/

