package com.kh.condition;

import java.util.Scanner;

public class B_Switch {

	Scanner sc = new Scanner(System.in);
	
	/*
	 * switch문
	 * 
	 * [표현법] 
	 * 
	 * switch(조건식) {
	 * 		case 값1:
	 * 			... 조건식의 결과가 값1과 같을 경우 실행 코드...
	 * 			break;
	 * 		case 값2:
	 * 			... 조건식의 결과가 값2와 같을 경우 실행 코드...
	 * 			break;
	 * 		default;
	 * 			... 조건식의 결과가 일치하는 case문이 없을 때 실행 코드... 
	 * }
	 * 
	 * - case문의 수는 제한이 없다.
	 * - 조건식 결과는 정수, 문자, 문자열이어야 한다.
	 * - 조건문을 빠져나오려면 break가 필요하다.
	 * - default문은 생략 가능하다.
	 */
	
	public void method1() {
		
		/*
		 * 숫자를 입력받아서
		 * 1일 경우 "빨간색"
		 * 2일 경우 "파란색"
		 * 3일 경우 "초록색"
		 * 잘못 입력했을 경우 "잘못 입력하셨습니다."
		 */
		
		System.out.print("정수 입력 > ");
		int i = sc.nextInt();
		
		// if-else문
		if (i == 1) {
			System.out.println("빨간색");
		} else if (i == 2) {
			System.out.println("파란색");
		} else if (i == 3) {
			System.out.println("초록색");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		// switch문
		switch(i) {
		
		case 1:
			System.out.println("빨간색");
			break;
		case 2:
			System.out.println("파란색");
			break;
		case 3:
			System.out.println("초록색");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	
	/*
	 * 등급별 권한
	 * 1 : 관리권한, 글쓰기권한, 읽기권한
	 * 2 : 글쓰기권한, 읽기권한
	 * 3 : 읽기권한
	 */
	public void practice1() {
		System.out.print("등급 : ");
		int grade = sc.nextInt();
		
		switch(grade) {
		case 1: System.out.println("관리권한");
		case 2: System.out.println("글쓰기권한");
		case 3: System.out.println("읽기권한");
		}
	}
		
//		switch(grade){
//		case 1 : 
//			System.out.println("관리권한, 글쓰기권한, 읽기권한");
//			break;
//		case 2 : 
//			System.out.println("글쓰기권한, 읽기권한");
//			break;
//		case 3 : 
//			System.out.println("읽기권한");
//			break;
//		}
		
		
	/*
	 * 3, 4, 5 : 봄
	 * 6, 7, 8 : 여름
	 * 9, 10, 11 :가을
	 * 12, 1, 2 :겨울
	 * 
	 * 월>5
	 * 봄
	 * 
	 */
	public void practice2() {	
		System.out.print("월 : ");
		int num = sc.nextInt();
		
		switch(num) {
		
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
			
		case 6: case 7: case 8:
			System.out.println("여름");
			break;	
			
		case 9: case 10: case 11:
			System.out.println("가을");
			break;	
			
		default:
			System.out.println("겨울");
		}
	}


	public static void main(String[] args) {
		B_Switch b = new B_Switch();
//		b.method1();
//		b.practice1();
		b.practice2();
	}

}
