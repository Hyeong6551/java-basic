package com.company.basic014_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class A002_basic {
	public static void main(String[] args) {
		// JAVA IO 
		// 입력 스트림 / 출력 스트림
		// 1. 스트림 - 데이터 종류에 상관없이(Stream) 같은 방식으로 처리(Lambda)
		
		Integer [] arr = {1,2,3}; 	// 배열
		List<Integer> list = new ArrayList<>();		// ArrayList
		
		list.add(1);	// int인 기본형태로 값을 집어넣어도 객체로 인식함 -> Integer (1) wrapper
		list.add(new Integer(2));
		list.add(3);	
		
		Arrays.stream(arr).forEach( (t)->{System.out.println(t);} );		// 배열을 스트림의 형식으로
		
		System.out.println();
		
		list.stream();
//		Consumer c;
//		void java.util.function.Consumer.accept ( T t )
	}
}
