package com.company.basic015_JAVA_IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class A003_basic {
	public static void main(String[] args) throws IOException {
		String img_rel="src/com/company/basic015_JAVA_IO/artwork.jpg";
		String target1="src/com/company/basic015_JAVA_IO/artwork1.jpg";
		String target2="src/com/company/basic015_JAVA_IO/artwork2.jpg";
		
		// 이미지파일 읽어들여서 쓰기
		
		// 1. byte		artwork.jpg → artwork1.jpg
		//	InputStream	> [Program] > OutputStream
		InputStream bis = new FileInputStream(img_rel);
		OutputStream bos = new FileOutputStream(target1);
		
		int cnt1=0;
		while( (cnt1=bis.read()) != -1) { bos.write((byte)cnt1); }
		bos.flush();	bos.close();   	bis.close();
		System.out.println("first image copy done !");
		
		// 2. char		artwork.jpg → artwork2.jpg
		//   Reader	 >  [Program]  >  Writer
		Reader cr = new FileReader(img_rel);
		Writer cw = new FileWriter(target2);
		
		int cnt2=0;
		while( (cnt2=cr.read())!= -1 ) { cw.write((char)cnt2); }
		cw.flush();		cw.close();    cr.close();	 
		System.out.println("second image copy done !");
	}
}
