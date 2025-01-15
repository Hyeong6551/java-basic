package com.company.basic004;

import java.util.Arrays;

public class Arr003_basic {
	public static void main(String[] args) {
		//	#1. 1차원배열
		//
		//	1. new 공간 빌리기(heap)	2. int(정수, 1,2,3)	3. [3] 공간 3개
		//	4. arr1(주소보관 : stack)	
		// 	[ 3 (index : 0~2) ]
		int [] arr1 = new int[3];
		
		// #2. 2차원배열
		//
		//	1. new 공간 빌리기(heap)	2. int(정수)			3. [2]층[3]칸 = 총 6칸
		//	4. arr2(주소보관 : stack)	
		// 	[ 6 (index : 0~5) ]
		int [][] arr2 = new int[2][3];
		arr2[0][0] = 1;
		arr2[0][1] = 2;
		arr2[0][2] = 3;
		arr2[1][0] = 4;
		arr2[1][1] = 5;
		arr2[1][2] = 6;
		
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[i].length;j++) {
				System.out.printf("%d\t",arr2[i][j]);
			}
			System.out.println();
		}
	}
}
