package com.kh.example.practice1;

import java.util.Scanner;

import com.kh.example.practice1.model.Member;

public class Run {
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);

		Member m = new Member();

		System.out.print("이름 입력 > ");
		String name = sc.nextLine();

		m.changeName(name);
		m.printName();
	}
}
