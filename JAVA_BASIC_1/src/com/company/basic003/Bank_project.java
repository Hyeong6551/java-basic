package com.company.basic003;

import java.util.Scanner;

public class Bank_project {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("WELCOM! (주)CODE BANK");
		
		boolean run = true;
		char YorN='\u0000';
		String id = " ", pw = " ", id_check=" ", pw_check=" ";
		int age=0,cash=0,get_cash=0;
		
		for(;run;) {
			System.out.println("======BANK======");
			System.out.println("* 1.추가\n* 2.조회\n* 3.입급\n* 4.출금\n* 5.삭제\n* 9.종료");
			int num = sc.nextInt();
			
			// 1. 추가
			if(num==1) {
				System.out.print("아이디 입력 : ");
				id = sc.next();
				System.out.print("비밀번호 입력 : ");
				pw = sc.next();  
				System.out.print("나이 입력 : ");
				age = sc.nextInt();
				System.out.print("잔액 입력 : ");
				cash = sc.nextInt();
			}
			
			// 2. 조회
			if(num==2) {
				System.out.print("id : ");
				id_check = sc.next();
				System.out.print("pw : ");
				pw_check = sc.next();
				
				if(!id.equals(id_check) || !pw.equals(pw_check)) {
					System.out.println("다시 확인해주세요");
				} else {
					System.out.printf("==계좌조회\nID : %s\nPass : %s\n나이 : %d\n잔액 : %d\n",id,pw,age,cash);;
				}
			}
			
			// 3. 입금
			if(num==3) {
				System.out.print("id : ");
				id_check = sc.next();
				System.out.print("pw : ");
				pw_check = sc.next();
				
				if(!id.equals(id_check) || !pw.equals(pw_check)) {
					System.out.println("다시 확인해주세요");
				} else {
					System.out.print("입금 : ");
					get_cash = sc.nextInt();
					cash += get_cash;
					System.out.println("==입금완료\n잔액 : "+cash);
				}
			}
			
			// 4. 출금
			if(num==4) {
				System.out.print("id : ");
				id_check = sc.next();
				System.out.print("pw : ");
				pw_check = sc.next();
				
				if(!id.equals(id_check) || !pw.equals(pw_check)) {
					System.out.println("다시 확인해주세요");
				} else {
					System.out.print("출금 : ");
					get_cash = sc.nextInt();
					if (cash < get_cash ) {
						System.out.println("잔액이 부족합니다.");
						continue;
					}
					cash -= get_cash;
					System.out.println("==출금완료\n잔액 : "+cash);
					}
				}
			
			// 5. 삭제
			if(num==5) {
				System.out.print("id : ");
				id_check = sc.next();
				System.out.print("pw : ");
				pw_check = sc.next();
				
				if(!id.equals(id_check) || !pw.equals(pw_check)) {
					System.out.println("다시 확인해주세요");
				} else {
					System.out.print("계좌를 삭제하시겠습니까? (Y/N)");
					YorN = sc.next().charAt(YorN);
					if(YorN=='y' || YorN=='Y') {
						id=" "; pw=" "; cash=' '; age=' '; 
					} else if(YorN=='n' || YorN=='N') {
						continue;
					} else {
						System.err.println("올바른 값을 입력해주세요");
					}
				}
			}
			
			// 9. 종료
			if(num==9) {
				System.out.println("종료기능 입니다.");
				run = false;
			}
		}
	}
}
