package com.company.portfolio;

import java.util.ArrayList;
import java.util.Scanner;

public class Test002_controller {
	public static void main(String[] args) {
		ArrayList<UserInfo> list = new ArrayList<>();
		list.add(new UserInfo("aaa","aaa@gmail.com"));
		list.add(new UserInfo("bbb","bbb@gmail.com"));
		list.add(new UserInfo("ccc","ccc@gmail.com"));
		
		Scanner sc = new Scanner(System.in);
		UserProcess controller = null;	// 부모 - 인터페이스 - 설계
		UserProcess [] crud = { new UserCreate(), new UserRead(), new UserUpdate(), new UserDelete() };
	
//		controller = crud[0];	controller.exec(null);
//		controller = crud[1];	controller.exec(null);
//		controller = crud[2];	controller.exec(null);
//		controller = crud[3];	controller.exec(null);
		
		//1. 무한반복
		int num=-1;
		for(;;) {
			System.out.println(":: 메뉴 입력 ::\n1. create\n2. read\n3. update\n4. delete\n5. exit");
			//2. 사용자에게 번호입력
			num = sc.nextInt();
			if (num>=1 && num<=4) { controller = crud[num-1];	controller.exec(list);	}
			else if(num==5) { break; }
			else { System.out.println(); }
		}
	}
}
