package com.company.mini_project;

import java.util.ArrayList;
import java.util.Scanner;

// controller	상속도 확인하고 구현객체 만들기
/*
 * <<interface>> InfoProcess		(void exec(ArrayList<Info> users)	)
 * ↑			↑			↑			↑
 * InfoCreate	InfoRead	InfoUpdate	InfoDelete
 */
interface InfoProcess{
	void exec(ArrayList<U_Info> users);
	Scanner sc = new Scanner(System.in);
}

class InfoCreate implements InfoProcess{		// ADD

	@Override
	public void exec(ArrayList<U_Info> users) {
		System.out.print("이메일 입력 > ");
		users.add(new U_Info(sc.next()));
		System.out.println("..........확인 > " + users);
	}
}

class InfoRead implements InfoProcess{

	@Override
	public void exec(ArrayList<U_Info> users) {
		if(users.size()==0) {
			System.out.println("사용자가 존재하지 않습니다.");
		} else
			System.out.println(users);
	}		
}

class InfoUpdate implements InfoProcess{		// UPDATE

	@Override
	public void exec(ArrayList<U_Info> users) {
		if(users.size()==0) {
			System.out.println("사용자가 존재하지 않습니다.");
		} 
		
		System.out.print("수정할 번호 > ");
		int U_num = sc.nextInt();
		
		for(U_Info u : users) {
			if(u.getNo()==U_num) {
				System.out.print("수정할 이메일 > ");
				u.setName(sc.next());
			}
		}
		System.out.println("..........확인 > " + users);
	}	
}

class InfoDelete implements InfoProcess{		// DELETE

	@Override
	public void exec(ArrayList<U_Info> users) {
		System.out.print("삭제할 번호 > ");
		int D_num  = sc.nextInt();
		
		U_Info D_find = null;		// 삭제번호와 사용자의 번호가 같으면 객체 담기
		for( U_Info u : users ) {
			if(D_num == u.getNo()) {
				D_find = u;
				break;
			}
		}
		users.remove(D_find);
		
		for(U_Info u :users) {
			if(u.getNo()>D_num) {
				u.setNo(D_num++);
			}
		}
		U_Info.cnt--; 
			
		System.out.println("..........확인 > " +users);
	}
}

public class Test002_controller {
	public static void main(String[] args) {
		// model 
		ArrayList<U_Info> list = new ArrayList<>();

		// controller
		// Q1.	interface / class 구현객체
		
		// Q2.	무한반복 메뉴판		1. 이메일 등록		2. 확인		3. 수정		4. 삭제		5. 종료
		Scanner sc = new Scanner(System.in);
		InfoProcess controller = null;
		InfoProcess [] ctrl = { new InfoCreate(), new InfoRead(), new InfoUpdate(), new InfoDelete() };
		int run=-1;
		
		for(;;) {
			try {
				System.out.println("============\n1. 이메일 등록\n2. 확인\n3. 수정\n4. 삭제\n5. 종료");
				run = sc.nextInt();
				if(run==5) { System.out.println("메뉴판을 종료합니다."); break; }
				controller = ctrl[run-1];	controller.exec(list);

				} catch(Exception e) {
					System.err.println("올바른 값 출력");
					sc.next();
				}
		}
	}
}
