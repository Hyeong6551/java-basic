package com.company.basic016_network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class A001_basic3_xml2 {
	public static void main(String[] args) {
		try {
			String book_url = "https://openapi.naver.com/v1/search/book.xml?query="
						+URLEncoder.encode("원피스","UTF-8") + "&sort=sim";
			
			// 1
			URL url = new URL(book_url);
		
			// 2
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();

			// 3
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id", "NvmeYvs8dwYiKjj3KI4p");
			conn.setRequestProperty("X-Naver-Client-Secret", "NEUEosAj7R");
			
			int resp = conn.getResponseCode();
			System.out.println(resp);
			
			// 4
			BufferedReader br;
			if (resp == 200) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			
			// 5
			String line ="";	StringBuffer sb = new StringBuffer();
			while((line=br.readLine()) != null) {
				sb.append(line+"\n");
			}
			br.close();		conn.disconnect();
			
			// System.out.println(sb.toString());
			
			// 5-2 xml
			Path path = Paths.get("src/com/company/basic016_network/Book001.xml");
			String result = sb.toString();
			BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
			
			bw.write(result);
			bw.close();	System.out.println("xml 저장 성공");
			
			File file = new File("src/com/company/basic016_network/Book001.xml");
			
			// 필요한 데이터 처리		xml
			// 싱글톤(static 메서드로 객체 생성 - 전역변수 - 데이티 공유 가능) + 팩토리 패턴
			DocumentBuilderFactory factory = DocumentBuilderFactory.newDefaultInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);

			NodeList items = doc.getElementsByTagName("item");
			for(int i=0;i<items.getLength();i++) {
				Node item = items.item(i);		// data 1개
				// NodeList ( 라이브컬렉션 - DOM의 변경사항을 실시간 반영 / 텍스트, 속성 )
//				System.out.println(item);		// <item></item>
				
				NodeList child = item.getChildNodes();	// 공백 => <title></title> => 공백 => <link></link> => ...
//				System.out.println(childItem.getLength());	
				for(int j=0;j<child.getLength();j++) {
					Node data = child.item(j);
					if(data.getNodeType() == Node.ELEMENT_NODE) {	// 공백 -> 태그 -> 공백 -> 태그
						String name = data.getNodeName();
						String value = data.getTextContent();
						if(name.equals("title")) {
							System.out.println("제목 : " + value + "\t");
						} else if(name.equals("description")) {
							System.out.print("설명 : " + value + "\t");
						}
					}
				}
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