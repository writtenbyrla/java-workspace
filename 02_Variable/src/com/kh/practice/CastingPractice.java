package com.kh.practice;

import java.util.Scanner;

public class CastingPractice {
	public static void main(String args[]){
		CastingPractice cp = new CastingPractice();
//		cp.method1();
		cp.method2();
		
	}
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String a = sc.next();
		
		String b = sc.nextLine();
		
		System.out.println("A unicode : " + a);
		System.out.println("B unicode : " + b);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int a = sc.nextInt();
		
		System.out.print("영어 : ");
		int b = sc.nextInt();
		
		System.out.print("수학 : ");
		int c = sc.nextInt();
		
		
		System.out.println("총점 : " + (a + b+ c));
		System.out.printf("");
//		System.out.print("평균 : " + ((a + b+ c)/3));
		
	}
	
}
