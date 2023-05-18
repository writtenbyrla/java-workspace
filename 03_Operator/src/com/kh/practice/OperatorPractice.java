package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public static void main (String [] args) {
		OperatorPractice op = new OperatorPractice();
//		op.method1();
//		op.method2();
//		op.method3();
//		op.method4();
//		op.method5();
//		op.method6();
		
	}
	
	public void method1 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("연필 개수 : ");
		int num2 = sc.nextInt();
		
		System.out.println("1인당 연필 개수 : " + (num2 / num1));
		System.out.println("남는 연필 개수 : " + (num2 % num1));
	}
	

	public void method2 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수를 입력해주세요 > ");
		int num1 = sc.nextInt();
		
		System.out.println(num1 / 100 * 100);
	}
	
	public void method3() {

		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		boolean result = (num1 == num2) && (num2 == num3);
		System.out.println(result);
		
	}
	
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "짝수다" : "홀수다";
		System.out.println(result);
		
	}
	
	public void method5 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int num = sc.nextInt();
		
		String result = (num <= 13)? "어린이":((num<=19)? "청소년": "성인");
		System.out.println(result);
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		int num2 = sc.nextInt();
		
		int result = ((num1 % num2) % 10 == 0)? (num1 / num2) : (num1 / num2)+1 ;
		
		System.out.println("필요한 바구니의 수 : " + result );
	}
}
