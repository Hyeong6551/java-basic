package com.company.basic015_JAVA_IO;

import java.io.File;
import java.io.IOException;

public class A001_basic {
	public static void main(String[] args) {
		// 1. 폴더 - 파일 만들기
//		String folder_rel = "src/com/company/basic015_JAVA_IO/";
		String folder_rel = "C:\\file\\";
		String file_rel = "file001.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		try {
			if (!folder.exists() ) { folder.mkdir(); }	//폴더가 존재하지 않으면 mkdir() 실행
			if (!file.exists() ) { file.createNewFile(); } 
			System.out.println("폴더/파일 준비 완료");
		}catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
