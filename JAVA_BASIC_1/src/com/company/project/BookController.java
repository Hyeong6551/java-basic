package com.company.project;

import java.util.ArrayList;
import java.util.Scanner;

public class BookController {
	public static void main(String[] args) {
		ArrayList<BookInfo> list = new ArrayList<>();
		
		BookProcess controller = null;
		BookProcess [] crud = {new BookCreate(), new BookUpdate(), new BookDelete() };
		
		Scanner sc = new Scanner(System.in);

		int num=-1;
		for(;;) {
			System.out.println("1. 추가\n2. 수정\n3. 삭제\n5. 종료");
			num = sc.nextInt();
			if(num>=1 && num<=3) {
				controller = crud[num-1];	controller.exec(list);
			} else if(num==5) {
				System.out.println("프로그램을 종료합니다.");	break;
			}
		}
	}
}
