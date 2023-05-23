package com.kh.example.practice1.model;

public class Member {

	public String memberId;
	public String memberPwd;
	public String memberName = "김지은";
	public int age;
	public char gender;
	public String phone;
	public String email;
	
//	public void changeName() {
//		System.out.print("이름 입력 > ");
//		String name = sc.next();
//		memberName = name;
//		}
	
	public void changeName(String name) { // 매개변수
		memberName = name;		
	}
	
	public void printName() {
		System.out.println(memberName);
	}

}
