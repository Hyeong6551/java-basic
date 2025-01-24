package com.company.basic014_lambda;

interface Test30{
	int methodA(String str);
}

public class PR001 {
	public static void main(String[] args) {
		Test30 test1 = new Test30() {
			@Override
			public int methodA(String str) {
				System.out.println(str);
				return 0;
			}
			
		};
		test1.methodA("GOOD DAY");
		
		Test30 test2 = (str)->{ System.out.println(str); return 0;};
		test2.methodA("GOOD DAY");
	}
}
