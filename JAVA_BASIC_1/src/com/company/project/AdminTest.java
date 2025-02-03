package com.company.project;

import java.util.ArrayList;
import java.util.Iterator;

public class AdminTest {
	public static void main(String[] args) {
		ArrayList<BookInfo> list = new ArrayList<>();	
		list.add(new BookInfo("책이름","작가","출판사"));
		list.add(new BookInfo("책이름1","작가1","출판사1"));
		list.add(new BookInfo("책이름2","작가2","출판사2"));
		
		// 데이터 전체 출력
		Iterator <BookInfo> bookIter= list.iterator();
		while(bookIter.hasNext()) {
			BookInfo bi = bookIter.next();
			System.out.println(bi);
		}
		System.out.println();
		
		// 특정 데이터를 검색 후 원하는 데이터 값 변경
		bookIter = list.iterator();
		while(bookIter.hasNext()) {
			BookInfo bi = bookIter.next();
			if(bi.getNo()==2) {
				bi.setTitle("제목 있음");	break;	// break를 해주지 않으면 적용이 안됨
			}
		}
		System.out.println(list+"\n");

		// 특정 데이터 검색 후 데이터 삭제
		bookIter = list.iterator();
		while(bookIter.hasNext()) {
			BookInfo bi = bookIter.next();
			if(bi.getNo()==2) {
				bookIter.remove();	break;
			}
		}
		System.out.println(list);
	}
}
