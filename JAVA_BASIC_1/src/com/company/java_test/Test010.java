package com.company.java_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Test010 {
	public static void main(String[] args) throws Exception{
		URL url = new URL("https://www.google.com/");
		
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		conn.setDoInput(true);
		conn.setDoOutput(true);
		
		int code = conn.getResponseCode();
		
		BufferedReader br;
		if(code == 200) {
			br = new BufferedReader(new InputStreamReader( conn.getInputStream()));
		} else {
			br = new BufferedReader(new InputStreamReader( conn.getErrorStream()));
		}
		
		String line = "";
		StringBuffer sb = new StringBuffer();
		while( (line=br.readLine())!= null) {
			sb.append(line+"\n");
		}
		
		System.out.println(sb);
	}
}
