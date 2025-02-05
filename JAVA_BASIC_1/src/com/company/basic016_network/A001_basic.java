package com.company.basic016_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class A001_basic {
	public static void main(String[] args) {
		// ※Q10
		try {
			// 1. java URL 객체 얻기
			URL url = new URL("https://www.daum.net/");
			
			// 2. 연결객체 ( HttpURLConnection )
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			// 3. 요청 설정
			conn.setDoInput(true);			// 읽기
			conn.setDoOutput(true);			// 쓰기
			conn.setReadTimeout(1000);
			conn.setRequestMethod("GET");	// 주소표시 창 줄에 데이터 노출
			
			// 4. 응답 코드 - 응답 성공 시 200
//			System.out.println(conn.getResponseCode());
			int code = conn.getResponseCode();
			
			// 5. 응답 데이터
			BufferedReader br;
			if(code == 200) {	// 정상 호출
				br = new BufferedReader(new InputStreamReader( conn.getInputStream() ));
			} else {			// 에러 발생
				br = new BufferedReader(new InputStreamReader( conn.getErrorStream() ));	
			}
			
			String line="";		// 문자열 바뀔때 주소 바뀜		
			StringBuffer sb = new StringBuffer();	// 주소 고정
			
			while( (line=br.readLine()) != null ) {
				sb.append(line+"\n");
			}
			System.out.println(sb.toString());
			
			br.close();	conn.disconnect();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}


