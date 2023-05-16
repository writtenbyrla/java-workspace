package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {

	// FQCN(Fully Qualified Class Name)
	// 클래스가 속한 패키지명을 모두 포함한 이름

	public static void main(String[] args) {
		VariablePractice vp = new VariablePractice();
//		vp.method1();
//		vp.method2();
		vp.method3();
//		vp.method4();
	}

	public void method1() {
		Scanner sc = new Scanner(System.in);


		System.out.print("첫 번째 정수를 입력하세요 : ");
		int a = sc.nextInt(); 

		System.out.print("두 번째 정수를 입력하세요 : ");
		int b = sc.nextInt(); 

		System.out.println("더하기 결과: " + (a+b));
		System.out.println("빼기 결과: " + (a-b));
		System.out.println("곱하기 결과: " + (a*b));
		System.out.println("나누기 몫 결과: " + (a/b));
	}
	
	
	public void method2() {
		int c = 10000;
		int d = 7000;
		System.out.println("성인 2명 : " + (c*2) + "원");
		System.out.println("성인 3명 : " + (d*3) + "원");
		System.out.println("총 금액 : " + ((c*2)+(d*3)) + "원");
	}
	
	public void method3() {
		int x = 5;
		int y = 7;
		int z = 9;
		int a = 0;
		
		a = x;
		x = y;
		y = z;
		z = a;
		
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		System.out.println("z=" + z);
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String line = sc.next();
		char word = line.charAt(0);
		char word2 = line.charAt(7);
		
		System.out.println("첫번째 문자 : " + word);
		System.out.println("마지막 문자 : " + word2);
	}
}
