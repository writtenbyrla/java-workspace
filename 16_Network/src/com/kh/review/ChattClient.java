package com.kh.review;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChattClient {

	public static void main(String[] args) {
		
	try {
		// 1. 소켓 생성
		Socket s = new Socket("127.0.0.1", 60000);
		System.out.println("Client Socket Creating");
		
		// 2. 스트림
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(s.getOutputStream());
		
		String line="";
		while((line=br.readLine())!=null) {
			pw.println(line);
		}
		

	} catch (IOException e) {
		System.out.println("서버와의 연결에 실패했습니다.");
	}
	
	}

}
