package com.kh.socket2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattServer {

	// 클라이언트가 보낸 메세지를 받아서
	// 다시 클라이언트에게 받은 메세지를 보낸다.
	
	public static void main(String[] args) {

		try {
			// 서버 소켓 생성
			ServerSocket server = new ServerSocket(60000);
			System.out.println("Server Ready");
			
			// 소켓 하나 리턴
			Socket s = server.accept();
			System.out.println("Client Socket... Returning");
			
			
			// 소켓으로부터 스트림 리턴
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			// 스트림 생성(클라이언트에서 받은 입력값 다시 넘기기)
			PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println("[" + s.getInetAddress() +"]가 보낸 메시지 : " + line);
				pw.println(line);
			}
			
			
			
			
		} catch (IOException e) {
			System.out.println("Client와의 연결이 끊어졌습니다.");
		}
		
		
		
	}

}
