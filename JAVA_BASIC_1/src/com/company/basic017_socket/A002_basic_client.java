package com.company.basic017_socket;

import java.net.Socket;

public class A002_basic_client {
	public static void main(String[] args) {
		// 통신사 - 서버 소켓이 열렸는지 확인하고 ( Server 먼저 실행)
		Socket socket = null; 
		
		try {
			socket = new Socket("127.0.0.1",1407);
			System.out.println("[Client] 3. 상담사에게 전화");
			
			Thread sender = new Sender(socket); 	sender.start();		// 말하기 기능
			Thread receiver = new Receiver(socket); receiver.start();	// 듣기 기능
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// 문희하기 - (Socket)
	}
}
