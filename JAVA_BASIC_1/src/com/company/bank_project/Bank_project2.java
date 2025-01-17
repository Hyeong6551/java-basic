package com.company.bank_project;

import java.util.Scanner;

class id_check {			// 사용자 정보 확인용
	Scanner sc = new Scanner(System.in);
	String id_check, pw_check, id,pw;
	boolean check;
	int age, cash;
	
	void make_id() {		// id 만들기
		System.out.print("아이디 입력 : ");
		id = sc.next();
		System.out.print("비밀번호 입력 : ");
		pw = sc.next();  
		System.out.print("나이 입력 : ");
		age = sc.nextInt();
		System.out.print("잔액 입력 : ");
		cash = sc.nextInt();
	}
	
	void idpw_check() {		// id 조회용
		System.out.print("id : ");
		id_check = sc.next();
		System.out.print("pw : ");
		pw_check = sc.next();
		
		if((!id.equals(id_check) || !pw.equals(pw_check)) && check==false) {
			System.out.println("다시 확인해주세요");
		} else {
			check= true;
		}
	}
}

public class Bank_project2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		id_check idpw = new id_check();
		
		System.out.println("WELCOM! (주)CODE BANK");
		
		boolean run = true;
		char YorN='\u0000';
		int get_cash=0;		
		
		for(;run;) {
			System.out.println("======BANK2======");
			System.out.print("* 1.추가\n* 2.조회\n* 3.입급\n* 4.출금\n* 5.삭제\n* 9.종료\n입력>>>");
			int num = sc.nextInt();
			System.out.println();
			

			if(num==9) {				// 9. 종료
				System.out.println("종료기능 입니다.");
				sc.close();
				break;
			} 
			else if(num==1) {			// 1. 추가
				idpw.make_id();
			} 
			else if(num==2 || num==3 || num==4 || num==5) {
				switch(num) {
					case 2 :			// 2. 조회 
						idpw.idpw_check();
						
						if(idpw.check==true) {
							System.out.printf("==계좌조회\nID : %s\nPass : %s\n나이 : %d\n잔액 : %d\n",idpw.id,idpw.pw,idpw.age,idpw.cash); 
							idpw.check=false; break;
						} else { break; }
					case 3 :			// 3. 입금
						idpw.idpw_check();

						if(idpw.check==true) {
							System.out.print("입금 : ");
							get_cash = sc.nextInt();
							if(get_cash < 0) {
								System.out.println("입금을 할 수 없습니다."); idpw.check=false; break;
							}
							idpw.cash += get_cash;
							System.out.println("==입금완료\n잔액 : "+idpw.cash);
							idpw.check=false; break;
						} else { break; }
					case 4 :			// 4. 출금
						idpw.idpw_check();

						if(idpw.check==true) {
							System.out.print("출금 : ");
							get_cash = sc.nextInt();
							if (idpw.cash < get_cash ) {
								System.out.println("잔액이 부족합니다.");
								break;
							} else if (get_cash < 0) {
								System.out.println("출금을 할 수 없습니다.");
							}
							idpw.cash -= get_cash;
							System.out.println("==출금완료\n잔액 : "+idpw.cash);
							idpw.check=false; break;
						} else { break; }
					case 5 :			// 5. 삭제
						idpw.idpw_check();

						if(idpw.check==true) {
							System.out.print("계좌를 삭제하시겠습니까? (Y/N)");
							YorN = sc.next().charAt(0);
							switch (YorN) {
								case 'y' :
								case 'Y' : idpw.id=" "; idpw.pw=" "; idpw.cash=' '; idpw.age=' '; YorN=' ';
										System.out.println("계좌 삭제 완료"); idpw.check=false; break; 
								case 'n' : 
								case 'N' : idpw.check=false; break;
								default : System.err.println("Error"); idpw.check=false; break;
							} 
						} else { break; }
					}
				} 
			else { System.err.println("error");}
		}
	}
}
