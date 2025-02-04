package com.company.basic015_JAVA_IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class A002_basic2 {
	public static void main(String[] args) {
		String folder_rel = "src/com/company/basic015_JAVA_IO/";
		String file_rel = "file002-2.txt";
		
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
		
		// 2. char 쓰기
		try {
			Writer writer = new FileWriter(folder_rel + file_rel, true);
			writer.write("안녕");
			writer.flush();
			writer.close();
			System.out.println("write done!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 3. char 읽기
		try {
			Reader reader = new FileReader(file);
//			System.out.println((char)reader.read());
			int cnt=0;
			while((cnt=reader.read()) != -1) {
				System.out.print((char)cnt);
			}
			reader.close();
			System.out.println("\nread done!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
