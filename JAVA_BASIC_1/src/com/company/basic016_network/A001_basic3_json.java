package com.company.basic016_network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class A001_basic3_json {
	public static void main(String[] args) {
		try {
			String book_url = "https://openapi.naver.com/v1/search/book.json?query="
						+URLEncoder.encode("원피스","UTF-8") + "&sort=sim";
			URL url = new URL(book_url);
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "NvmeYvs8dwYiKjj3KI4p");
			conn.setRequestProperty("X-Naver-Client-Secret", "NEUEosAj7R");
			
			int resp = conn.getResponseCode();
			System.out.println(resp);
			
			BufferedReader br;
			if (resp == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			String line ="";	StringBuffer sb = new StringBuffer();
			while((line=br.readLine()) != null) {
				sb.append(line+"\n");
			}
			
			System.out.println(sb.toString());
			br.close();		conn.disconnect();
			
			// 필요한 데이터 처리		json
			String result = sb.toString();
			JsonParser parser = new JsonParser();
			
			JsonObject job = (JsonObject) parser.parse(result);
			JsonArray arr = (JsonArray) job.get("items");
			
//			System.out.println(arr.get(0));				// 0번째 데이터
			for(int i=0;i<arr.size();i++) {
				JsonObject  data = (JsonObject) arr.get(i);	
				String title = data.get("title").getAsString();
				String description = data.get("description").getAsString();
				System.out.println("※ Title : " + title + "\n※ Description : "+description +"\n\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

//소켓 프로그래밍 (채팅창) 패키지
//java.net , java.io

//Client ID	
//NvmeYvs8dwYiKjj3KI4p
//Client Secret	
//NEUEosAj7R