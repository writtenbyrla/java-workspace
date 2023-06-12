package com.bookreview.model;

import java.util.List;

public class User {

	private String id;
	private String password;
	private String name;
	private String phone;
	private String nickName;
	private String email;
	List<Review> review;
	
	public User() {}
	
	public User(String id, String password, String name, String phone, String nickName, String email) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.nickName = nickName;
		this.email = email;
	}
	
	public User(String id, String password, String name, String phone, String nickName, String email,
			List<Review> review) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.nickName = nickName;
		this.email = email;
		this.review = review;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return "User [id=" + id + ", password=" + password + ", name=" + name + ", phone=" + phone + ", nickName="
				+ nickName + ", email=" + email + "]";
	}
	
	


}
