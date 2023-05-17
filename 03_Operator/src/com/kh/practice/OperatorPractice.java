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
		op.method6();
		
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
		
		float a = (float) (num1 * 0.01);
		int b = (int) a * 100;
		
		System.out.println(b);
		
	}
	
	public void method3() {


		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		String result = (num1 == num2) && (num2 == num3) && (num1 == num3) ? "true" : "false";
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
		
		String result = (num <= 13)? "어린이":(((num > 13) && (num<=19))? "청소년": "성인");
		System.out.println(result);
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사과의 개수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("바구니의 크기 : ");
		int num2 = sc.nextInt();
		
		int num3 = num1 / num2 ;
		int num4 = num1 % num2 ; 
		
		int result = (num4 % 10 == 0)? num3 : num3+1 ;
		
		System.out.println("필요한 바구니의 수 : " + result );
	}
}
