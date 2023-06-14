package com.bookreview.model;

import java.util.List;

public class User {

	private String password;
	private String name;
	private String phone;
	private String nickName;
	private String email;
	List<Review> review;
	
	public User() {}

	public User(String password, String name, String phone, String nickName, String email) {
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.nickName = nickName;
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Review> getReview() {
		return review;
	}

	public void setReview(List<Review> review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "User [password=" + password + ", name=" + name + ", phone=" + phone + ", nickName=" + nickName
				+ ", email=" + email + ", review=" + review + "]";
	}
	
}
