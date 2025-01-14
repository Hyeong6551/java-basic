package com.company.basic003;

import java.util.Scanner;

public class B_Check {
	static void Check(String id_check, String pw_check) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("id : ");
		id_check = sc.next();
		System.out.print("pw : ");
		pw_check = sc.next();
	}
}
