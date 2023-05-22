package com.kh.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	/*
	 * 길이가 5인 배열을 선언하고 과일 5개로 초기화 한 후 본인이 좋아하는 과일 하나를 출력하세요. (과일 5개는 뭐든지~)
	 * 
	 * */
	public void method1() {
		
		String[] fruit = new String[] {"체리", "복숭아", "딸기", "청포도", "사과"};
		
		System.out.println(fruit[0]);
	}
	
	/*
	 * 사용자에게 배열의 길이와 배열의 크기 만큼 사용자한테 입력 받은 값으로 초기화 한 후
	 * 각 입력 받은 값이 잘 들어갔는지 출력 후 저장된 값들의 합을 출력하세요.
	 * 
	 * 정수 : 5
	 * 배열 0번째 인덱스에 넣을 값 : 4
	 * 배열 1번째 인덱스에 넣을 값 : -4
	 * 배열 2번째 인덱스에 넣을 값 : 3
	 * 배열 3번째 인덱스에 넣을 값 : -3
	 * 배열 4번째 인덱스에 넣을 값 : 2
	 * [4, -4, 3, -3, 2]
	 * 2
	 * */
	public void method2() {
		
		System.out.print("정수 : ");
		int number = sc.nextInt();
		
		int [] array = new int[number];
		int sum=0;
		
		for(int i=0; i<number; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : " );
			int input = sc.nextInt();
			array[i] = input;
			sum += input;
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(sum);
	}
	
	
	/*
	 * 음식 메뉴는 자유롭게! 개수도 자유롭게! 배열 사용해서
	 * 사용자가 입력한 값이 배열에 있으면 "배달 가능", 없으면 "배달 불가능"을 출력하세요.
	 * 
	 * */
	public void method3() {
		String[] menu = new String[] {"김밥", "오므라이스", "돈까스", "라면"};
		
		System.out.print("메뉴 입력 > ");
		String input = sc.next();
		
		for(int i=0; i<menu.length; i++) {
						
			if(input.equals(menu[i])) {
				System.out.println("배달 가능");
				break;
			} else {
				System.out.println("배달 불가능");
				break;
			}
		}
	}
	
	
	/*
	 * 
	 * 사용자에게 주민등록번호를 입력받아 성별자리 이후부터 *로 가리고 출력하세요.
	 * 단, 원본 배열은 건드리지 않고! 
	 * 
	 * 주민등록번호 : 123456-1234567
	 * 123456-1******
	 * 
	 * */
	public void method4() {
		
		char[] number = new char[14];
		
		System.out.print("주민등록번호 입력 > ");
		String input = sc.next();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			number[i]=ch;
			
			if(i<8) {
				System.out.print(ch);
			} else {
				System.out.print("*");
			}
		} 
	}
	
	
	/*
	 * 사용자가 입력한 단어를 거꾸로 뒤집어서 출력하세요. 
	 * 
	 * length: 11
	 * 단어 입력 : programming 012345678910
	 * gnimmargorp 10 9 8 7 6 5 4 3 2 1 0
	 * 
	 * */
	public void method5() {
		
		System.out.print("단어 입력 : ");
		String word = sc.next();
		char[] ch = new char[word.length()];
		
		for(int i = 0; i<word.length(); i++) { // 배열에 저장
			char a = word.charAt(i);
			ch[i]= a;
			}
		
		for(int j = word.length()-1; j>=0; j--) { // 역순으로 출력
			System.out.print(ch[j]);
		}
	}
	
	
	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice();
//		ap.method1();
//		ap.method2();
//		ap.method3();
//		ap.method4();
		ap.method5();
	}
	
}
