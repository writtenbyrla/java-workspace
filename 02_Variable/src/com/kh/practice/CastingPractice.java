package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	public static void main(String args[]){
		CastingPractice cp = new CastingPractice();
		cp.method1();
//		cp.method2();
		
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		int i = (int)ch;
		
		
		System.out.printf("A unicode : %d\n", i);
		System.out.printf("B unicode : %d", i+1);
		
	}
	
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();

		int sum = a+b+c;
		float average = ((float)(a + b+ c))/3;
		
//		System.out.println("총점 : " + (a + b+ c));
		System.out.println("총점 : " + sum);
//		System.out.printf("평균 : %.2f", ((float)(a + b+ c))/3);
		System.out.printf("평균 : %.2f", average);
		
	}
	
}
