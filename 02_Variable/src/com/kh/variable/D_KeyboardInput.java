package com.kh.variable;

import java.util.Scanner;

public class D_KeyboardInput {

	/*
	 * Scanner
	 * - 화면(Console)으로부터 데이터를 "입력"받는 클래스
	 * 
	 * 1) import java.util.Scanner; 추가
	 * 
	 * 2) Scanner 클래스 생성
	 *    Scanner sc = new Scanner(System.in);
	 *    
	 * 3) Scanner 클래스 사용
	 *    입력 값이
	 *    	- 문자열일 때: sc.next() - 공백이 있을 경우 공백 이전까지
	 *    			   sc.nextLine() - 공백 포함 엔터 전까지
	 *    	- 정수일 때: sc.nextInt()
	 *    	- 실수일 때: sc.nextFloat(), sc.nextDouble()
	 */
	
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? > ");
		String name = sc.next(); // 입력을 받음
		sc.nextLine();
		
		System.out.print("당신의 집은 어디십니까? > ");
		String addr = sc.nextLine(); // 입력을 받음
		
		System.out.print("당신의 나이는 몇살입니까? > ");
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇입니까? (소수점 첫째 자리까지 입력하세요.) > ");
		float height = sc.nextFloat();
		sc.nextLine(); // nextLine 이외의 것 다음에 nextLine 나올때 반드시 붙여줘야 함
		
		System.out.print("당신의 성별은 무엇입니까? (남/여) > ");
		String line = sc.nextLine();
		char gender = line.charAt(0); // 가장 첫 글자만 가지고 옴
		
		System.out.println("당신의 이름은 " + name + "이고 사는 곳은 " + addr + ", 나이는 " + age + "세, 키는 " + height + "cm, 성별은 "+ gender + "입니다.");
	
		System.out.printf("당신의 이름은 %s이고 사는 곳은 %s, 나이는 %d세, 키는 %.1fcm, 성별은 %c입니다.",name, addr, age, height, gender);
		
	}
}
