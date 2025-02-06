package com.company.basic017_socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class A001_basic {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("IP HostName : " + local.getHostName());
			System.out.println("IP HostAddress : " + local.getHostAddress());
			
			local = InetAddress.getByName("www.naver.com");
			System.out.println("naver/IP : "+local);
		} catch (UnknownHostException e) { e.printStackTrace(); }
	}
}
