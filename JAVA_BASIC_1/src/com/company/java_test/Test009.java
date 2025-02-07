package com.company.java_test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test009 {
	public static void main(String[] args) throws Exception {
		String folder_rel = "src/com/company/java_test/";
		String file_rel = "test9.txt";
		
		File folder = new File(folder_rel);
		File file = new File(file_rel);
		
		if(!folder.exists()) {folder.mkdir();}
		if(!file.exists()) {file.createNewFile();}
		
		BufferedWriter  br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(folder_rel+file_rel,true)));
		br.write("ONE\n");	br.write("TWO\n");	br.write("THREE\n");
		System.out.println("파일 출력 완료");
		br.flush();  br.close();
	}
}
