package com.kh.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {

	public static void main(String[] args) {

		
		
	try {
		//1. 소켓 생성
		ServerSocket server = new ServerSocket(60000);
		System.out.println("server Ready");
		
		//2. 소켓 리턴 accept
		Socket s = server.accept();
		System.out.println("Client Socket... Returning");
		
		// 3. 소켓으로부터 스트림 리턴
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		br.close();

	} catch (IOException e) {
		System.out.println("서버와의 연결이 끊어졌습니다.");
	}
	
		
		
		
		
	}

}
