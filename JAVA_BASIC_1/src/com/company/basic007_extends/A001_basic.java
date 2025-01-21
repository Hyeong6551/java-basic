package com.company.basic007;

// 3. 클래스에 final을 붙이면 - 자삭에서 extends가 안됨 (상속 불가)
class FinalEx extends Object{	// Object는 java가 이런 객체 틀로 만들어놓음
	// 1. 상수(변하지 않는 값) : 기본값
	// final은 보통 값이 변하지 않을 경우에 사용. 상속을 원하지 않을 때 사용
	final static String Xmas="12-25";	// static은 빠져도됨. 근데 같이 붙음
	String name; 
	
	// 2. 메서드에 붙으면 상속받는 자식이 오버라이드 불가
	// 오버라이드란? 자식이 부모가 가진 메서드를 가져다가 개조하여 맞게 사용함..
	// 자식에게 물려주기 싫으면 final을 붙인다.
	void show() {	// 2-1 final 빼고
		System.out.println(Xmas + " / " + name);
	}

	public FinalEx() { super(); }	// Object()
	
}

class son2 extends FinalEx{	//3-1 부모 클래스에 final을 붙이면 상속 불가

	@Override
	void show() { super.show(); }
	//2-2 에서 오버라이드.. 하지만 2.에서 final을 붙였을 경우에는 cannot override 오류가 생김
}

public class A001_basic {
	public static void main(String[] args) {
		FinalEx f1 = new FinalEx();
//		f1.Xmas="11.11";		// cannot be assigned.. 수정 못함
		f1.name = "크리스마스";
		f1.show();
		// 잘 돌아가는듯 보이지만..? go 2.
	}
}
