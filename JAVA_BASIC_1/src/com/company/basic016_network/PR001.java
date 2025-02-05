package com.company.basic016_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class PR001 {
	public static void main(String[] args) throws Exception{
		// ※Q9
		String folder_rel = "src/com/company/basic016_network/";
		String file_rel = "exFile001.txt";
		
		File folder = new File(folder_rel);
		File file = new File(folder_rel + file_rel);
		
		try {
			if(!folder.exists()) { folder.mkdir(); }
			if(!file.exists()) { file.createNewFile(); }
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		bw.write("apple\t");	bw.write("banana\t");	bw.write("coconut\t");
		bw.flush();		bw.close(); 	System.out.println("write done");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line="";
		StringBuffer sb = new StringBuffer();
		
		while( (line=br.readLine()) != null ) {
			sb.append(line+"\n");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
