package com.company.basic015_JAVA_IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class A002_basic {
	public static void main(String[] args) {
		String folder_rel = "src/com/company/basic015_JAVA_IO/";
		String file_rel = "file002.txt";
		
		// 1. folder+file 준비
		File folder = new File(folder_rel);
		File file = new File(folder_rel+file_rel);
		
		try {
			if(!folder.exists()) { folder.mkdir(); }
			if(!file.exists()) { file.createNewFile(); }
			System.out.println("create new folder/file !");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		// 2. byte 단위로 파일 쓰기
		// InputStream > 프로그램 > OutputStream [#]
		try {
			OutputStream output = new FileOutputStream(file);
			output.write('c');
			output.write('o');
			output.write('l');
			output.write('d');
			output.flush();
			output.close();	// 중요
			System.out.println("write done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		// 3. byte 단위로 파일 읽기
		// InputStream [#] > 프로그램 > OutputStream
		try {
			InputStream input = new FileInputStream(file);
//			System.out.println(input.read());	// 99 'c'
			int cnt=0;
			while( (cnt=input.read()) != -1) {
				System.out.print((char)cnt);
			}
			input.close();	// 중요
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
