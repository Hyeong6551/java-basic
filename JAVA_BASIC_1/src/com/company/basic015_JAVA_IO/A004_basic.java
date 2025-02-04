package com.company.basic015_JAVA_IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A004_basic {
	public static void main(String[] args) throws Exception {
		String folder_rel = "src/com/company/basic015_JAVA_IO/";
		String file_rel = "file003.txt";
		String network = "src/com/company/basic015_JAVA_IO/file002.txt";
		
		// 1. 폴더 + 파일 만들기
		File folder = new File(folder_rel);
		File file = new File(folder_rel+file_rel);
		try {
			if(!folder.exists()) { folder.mkdir(); }
			if(!file.exists()) { file.createNewFile();}
			System.out.println("create done !");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		// 2. 파일쓰기 (byte)
		// InputStream > [프로그램] > OutputStream #
		// BufferedWriter(속도 향상) - OutputStreamWrtier(단어) - FileOutputStream(byte)
		// file002.txt 파일 읽어와서 file005.txt.에 쓰기
		InputStream is = new FileInputStream(network);		// network
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));;
		int cnt1=0;
		while( (cnt1=is.read()) != -1) { bw.write(cnt1); }
		bw.flush();		bw.close();
		
		// 3. 파일읽기 (byte)
		// InputStream # > [프로그램] > OutputStream 
		// BufferedReader(속도 향상) - InputStreamReader(단어) - FileInputStream(byte)
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		
		String line="";		// line="a"	(a : 1000번지)	, line=line+"b" (ab : 1001번지)	주소가 새로 생김 -> 주소가 바뀜
		StringBuffer sb = new StringBuffer();	// sb.append("a"), sb.append("ab")	(sb : 2000번지)	주소가 바뀌지 않음
		while( (line=br.readLine()) != null ) { sb.append(line+"\n"); }
		System.out.println(sb.toString());
		br.close();		
	}
}


