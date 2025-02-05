package com.company.basic016_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class A001_basic2 {
	public static void main(String[] args) {
		try {
			// 1.URL
			/*
			   https://openapi.naver.com/v1/search/news.xml
			   https://openapi.naver.com/v1/search/news.json
			 */
			String api_url = "https://openapi.naver.com/v1/search/kin.xml?query="
						   + URLEncoder.encode("정치","UTF-8");
	
			URL url = new URL(api_url);
			
			// 2. HttpURLConnection
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			// 3. 요청 설정 - GET/POST		필수-query(UTF-8)
			/*
			   > X-Naver-Client-Id: {애플리케이션 등록 시 발급받은 클라이언트 아이디 값}
			   > X-Naver-Client-Secret: {애플리케이션 등록 시 발급받은 클라이언트 시크릿 값}
			 */
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id","NvmeYvs8dwYiKjj3KI4p");
			conn.setRequestProperty("X-Naver-Client-Secret","NEUEosAj7R");
			
			// 4. 응답 확인 - 200
			int code = conn.getResponseCode();
			System.out.println(code);
			BufferedReader br;
			if(code == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			// 5. 응답 데이터 - xml/json/csv
			String line="";
			StringBuffer sb = new StringBuffer();	
			while( (line=br.readLine()) != null) {
				sb.append(line+"\n");
			}
			System.out.println(sb.toString());
			br.close();
			conn.disconnect();
			
		} catch(Exception e) { e.printStackTrace(); }
	}
}

//소켓 프로그래밍 (채팅창) 패키지
//java.net , java.io

//Client ID	
//NvmeYvs8dwYiKjj3KI4p
//Client Secret	
//NEUEosAj7R