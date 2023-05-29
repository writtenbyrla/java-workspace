package com.kh.practice;

import java.util.Scanner;

import com.kh.practice.controller.CircleController;
import com.kh.practice.controller.RectangleController;

public class Application {

	Scanner sc = new Scanner(System.in);
	CircleController cc = new CircleController();
	RectangleController rc = new RectangleController();
	
	public static void main(String[] args) {
		Application app = new Application();
		app.mainMenu();
	
	}

	// 메인메뉴 출력, 잘못 입력했을 시 다시 받도록 반복
	public void mainMenu() {

		boolean check = true;
		while(check) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");

			switch(Integer.parseInt(sc.nextLine())) {
			case 1:
				this.circleMenu();
				break;

			case 2:	
				this.rectangleMenu();
				break;

			case 9:
				check = false;
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	
	// 원 메뉴 출력, 잘못 입력했을 시 메인 메뉴로 돌아감
	public void circleMenu() {
		System.out.println("===== 원 메뉴 =====");
		System.out.println("1. 원 둘레");
		System.out.println("2. 원 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");
		
		switch(Integer.parseInt(sc.nextLine())){
		case 1 :
			this.calcCircum();
			break;
			
		case 2 :
			this.calcCircum();
			break;

		case 9 : 
			this.mainMenu();
			break;
		}
		

	}
	 
	// 사각형 메뉴 출력, 잘못 입력했을 시 메인메뉴로 돌아감
	public void rectangleMenu() {
		System.out.println("===== 사각형 메뉴 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 넓이");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 : ");

		switch(Integer.parseInt(sc.nextLine())){

		case 1:
			this.calcPerimeter();
			break;

		case 2 :
			this.calcRectArea();
			break;

		case 9 : 
			this.mainMenu();
			break;
		}
	}
	
	// x,y 좌표와 반지름을 받아 원의 정보와 원 둘레 출력
	public void calcCircum() {
		System.out.print("x 좌표 :  ");
		int x = Integer.parseInt(sc.nextLine()); 
		
		System.out.print("y 좌표 :  ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름 :  ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcCircum(x, y, radius));
	}
	
	// x,y 좌표와 반지름을 받아 원의 정보와 원 넓이 출력
	public void calcCircleArea() {
		System.out.print("x 좌표 :  ");
		int x = Integer.parseInt(sc.nextLine()); 
		
		System.out.print("y 좌표 :  ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("반지름 :  ");
		int radius = Integer.parseInt(sc.nextLine());
		
		System.out.println(cc.calcArea(x, y, radius));
	}
	
	// x,y 좌표와 높이, 너비을 받아 사각형의 정보와 둘레 출력
	public void calcPerimeter() {
		System.out.print("x 좌표 :  ");
		int x = Integer.parseInt(sc.nextLine()); 
		
		System.out.print("y 좌표 :  ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("높이 :  ");
		int height = Integer.parseInt(sc.nextLine());
		
		System.out.print("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcPerimeter(x, y, height, width));

	}
	
	// x,y 좌표와 높이, 너비을 받아 사각형의 정보와 넓이 출력
	public void calcRectArea() {
		System.out.print("x 좌표 :  ");
		int x = Integer.parseInt(sc.nextLine()); 
		
		System.out.print("y 좌표 :  ");
		int y = Integer.parseInt(sc.nextLine());
		
		System.out.print("높이 :  ");
		int height = Integer.parseInt(sc.nextLine());
		
		System.out.print("너비 : ");
		int width = Integer.parseInt(sc.nextLine());
		
		System.out.println(rc.calcArea(x, y, height, width));
	}
}
