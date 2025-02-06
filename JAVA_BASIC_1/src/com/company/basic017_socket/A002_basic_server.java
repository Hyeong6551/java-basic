package com.company.basic017_socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class A002_basic_server {
	public static void main(String[] args) {
		// 1. 서버 소켓 - 통신사(서비스 제공자)[ , , , , ]
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(1407);
			System.out.println("[Server] 1. 서버 준비 완료 / 2. 고객 기다리는 중");
		} catch (IOException e) { e.printStackTrace(); }
		
		// 2. 클라이언트의 연결 요청 - 상담사(Socket)랑 연결(accept)
		try {
			socket = serverSocket.accept();
			System.out.println("[Server] 4. 상담사랑 연결");
			Thread sender = new Sender(socket); 	sender.start();		// 말하기 기능
			Thread receiver = new Receiver(socket); receiver.start();	// 듣기 기능
		} catch (IOException e) { e.printStackTrace(); }

		// 3. 데이터 주고받기
	}
}

// [ 프로그램 ] 

// 말하기 실행 클리스
class Sender extends Thread {		// 1. STEP 상속
	Socket socket; DataOutputStream out;
	String who;
	SimpleDateFormat sdf;
	
	public Sender() { super(); }

	public Sender(Socket socket) {	// 상대방의 정보
		super();
		this.socket = socket;
		this.who = "["+( socket.getPort() == 1407?"Client":"Server" );
		this.sdf = new SimpleDateFormat(" - hh:mm:ss] : ");
		try {
			out = new DataOutputStream( socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 2. todo run
	public void run() {
		//Scanner sc = new Scanner(System.in);
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			while( out != null ) {
				String data = in.readLine();
				if(data != null) {out.writeUTF(who+sdf.format(System.currentTimeMillis())+data); out.flush();}
			} 
		} catch (Exception e) { //e.printStackTrace(); 
		}finally {
			try {
				if(out != null ) {in.close();}
				if(in != null) { in.close();}
				if(!socket.isClosed()) { socket.close();}
			} catch (Exception e) { e.printStackTrace(); }
		}
	}
}

// 듣기 실행 클래스
class Receiver extends Thread {		// 1. STEP 상속
	Socket socket; DataInputStream in;
	
	public Receiver() { super(); }
	public Receiver(Socket socket) {
		super();
		this.socket = socket;	// 정보
		try {
			in = new DataInputStream( socket.getInputStream());	// 듣기 기능 키기
		} catch (IOException e) { e.printStackTrace(); }			
	}
	
	// 2. STEP run 실행 클래스 todo 내용
	public void run() {	
			try {
				while(in != null) {			// 상대방이 말하는거 듣기
					System.out.println(in.readUTF()); 
				}	
			} catch (Exception e) {
//				e.printStackTrace();
				System.out.println("통신을 종료합니다 >> " + socket);
			} finally {
				try {
					if(in != null) { in.close();}
					if(!socket.isClosed()) { socket.close();}
				} catch (Exception e) { e.printStackTrace(); }
			}			
		
	}
}