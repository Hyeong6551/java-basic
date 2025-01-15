package com.company.basic004;

public class Arr003_basic_Q {
	public static void main(String[] args) {
		//Q1
		int [][] da1 = {{1,2,3},{4,5,6}};
		
		for(int i=0;i<da1.length;i++) {
			for(int j=0;j<da1[i].length;j++) {
				System.out.print(da1[i][j]+"\t");
			}
			System.out.println();
		}
		
		//Q2
		int [][] da2 = {{10,20,30},{40,50,60}};
		
		for(int i=0;i<da2.length;i++) {
			for(int j=0;j<da2[i].length;j++) {
				System.out.printf("%d\t", da2[i][j]);
			}
			System.out.println();
		}
		
		//Q3
		int [][] da3 = new int[2][3];
		int a = 1;
		
		for(int i=0;i<da3.length;i++) {
			for(int j=0;j<da3[i].length;j++) {
				da3[i][j] = (a*=10)/10;
				System.out.print(da3[i][j]+"\t");
			}
			System.out.println();
		}
		
		//Q4
		int [][] da4 = new int[2][3];
		int b = 10;
		
		for(int i=0;i<da4.length;i++) {
			for(int j=0;j<da4[i].length;j++) {
				da4[i][j] = ++b; 
				System.out.print(da4[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
