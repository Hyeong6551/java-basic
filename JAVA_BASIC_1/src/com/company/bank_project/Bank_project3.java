package com.company.bank_project;

import java.util.Scanner;

interface Bank_Process{
	void exec();
}

class Bank_add implements Bank_Process{
	Scanner sc = new Scanner(System.in);
	String id, pw;
	int age, cash;
	@Override
	public void exec() {
		System.out.println("아이디 입력 : ");
		id = sc.next();
		System.out.println("비밀번호 입력 : ");
		pw = sc.next();
		System.out.println("나이 입력 : ");
		age = sc.nextInt();
		System.out.println("잔액 입력 : ");
		cash = sc.nextInt();
	}
}

class Bank_read implements Bank_Process{
	@Override
	public void exec() {
		System.out.println("2");
	}
}

class Bank_Input implements Bank_Process{
	@Override
	public void exec() {
		System.out.println("3");
	}
}

class Bank_Output implements Bank_Process{
	@Override
	public void exec() {
		System.out.println("4");
	}
}

class Bank_Delete implements Bank_Process{
	@Override
	public void exec() {
		System.out.println("5");
	}
}

public class Bank_project3 {
	public static int InputNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("======BANK======");
		System.out.println("* 1.추가\n* 2.조회\n* 3.입급\n* 4.출금\n* 5.삭제\n* 9.종료");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		Bank_Process [] process = { new Bank_add(), new Bank_read(), new Bank_Input(), new Bank_Output(), new Bank_Delete()};	
		int num=0;	

		System.out.println("WELCOM! (주)CODE BANK");
		
		for(;;) {
			try {
				num = InputNum();
				if(num==9) { break; }	// 9. 종료
				else if (num==1) { process[0].exec(); }		// 1. 추가
				else if (num==2) { process[1].exec(); }		// 2. 조회
				else if (num==3) { process[2].exec(); }		// 3. 입금
				else if (num==4) { process[3].exec(); }		// 4. 출금
				else if (num==5) { process[4].exec(); }		// 5. 삭제
				else { System.err.println("올바른 값을 입력해주세요");}
			} catch (Exception e) {
				System.err.println("올바른 값을 입력해주세요");
			}
		}
		
	}
}
