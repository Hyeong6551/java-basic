package com.company.basic015_JAVA_IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Calendar;

public class A005_basic {
	public static void main(String[] args) throws Exception {
		String folder_rel = "src/com/company/basic015_JAVA_IO/";
		String file_rel = "file004.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel+file_rel);
		
		if(!folder.exists()) { folder.mkdir(); }
		if(!file.exists()) { file.createNewFile(); }
		
		// 파일명 변경
		Calendar cal = Calendar.getInstance();
		
		// 파일 쓰기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		int cnt=0;

	
		// 파일 읽기
	}
}
