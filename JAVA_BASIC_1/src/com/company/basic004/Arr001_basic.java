package com.company.basic004;

import java.util.Arrays;

public class Arr001_basic {
	public static void main(String[] args) {
		// 정수형 배열
		// 비교 정수형 공간 변수명 10
		// 자료형 연달해서 주소보관변수명 = {값1,값2,..};
		
		int a=0;			 	// 정수형 공간 1개
		int [] arr= {1,2,3};	// 정수형 공간 여러개[]
								// [heap]1000번지 {1,2,3} → [stack] arr 1000번지
								//			index 0 1 2

		System.out.println(a);
		System.out.println(arr);						// 주소값 : [I@372f7a8d 
		System.out.println(""+arr[0]+arr[1]+arr[2]);	
		System.out.println(Arrays.toString(arr));		// 배열안에 있는 값 
	}
}
