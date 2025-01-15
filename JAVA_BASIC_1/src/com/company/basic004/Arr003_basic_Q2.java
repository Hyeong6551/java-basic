package com.company.basic004;

public class Arr003_basic_Q2 {
	public static void main(String[] args) {
		char [][] da1 = new char[5][5];
		
		//Q1
		/*
	 	@####
	 	#@###
	 	##@##
	 	###@#
	 	####@
		*/
		for(int i=0;i<da1.length;i++) {
			for(int j=0;j<da1[i].length;j++) {
				if(i==j) { 
					da1[i][j] = '@';
				} else {
					da1[i][j] = '#';
				}
				System.out.print(da1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		//Q2
		for(int i=0;i<da1.length;i++) {
			for(int j=0;j<da1[i].length;j++) {
				if(j+i==4) {
					da1[i][j] = '@';
				} else {
					da1[i][j] = '#';
				}
				System.out.print(da1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		int [][] da2 = new int[5][5];
		
		//Q3
		//입력부분과 출력부분을 따로 지정해야 오류가 안남
		int cnt=0;
		for(int i=0;i<da2.length;i++) {
			for(int j=0;j<da2[i].length;j++) {
					if(i%2==1) {
						da2[i][da2[i].length-1-j] = ++cnt;
					} else {
						da2[i][j] = ++cnt;
					}
			}
		}
		
		for(int i=0;i<da2.length;i++) {
			for(int j=0;j<da2[i].length;j++) {
				System.out.printf("%d\t",da2[i][j]);
			}
			System.out.println();
		}
	}
}


/*
 1 2 3 4 5
 10 9 8 7 6
 11 12 13 14 15
 20 19 18 17 16
 21 22 23 24 25
 
00 1	10 10
01 2	11 9
02 3	12 8
03 4 	13 7
04 5 	14 6
 */ 
