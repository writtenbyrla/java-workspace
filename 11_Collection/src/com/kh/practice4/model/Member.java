package com.kh.practice4.model;

import java.util.Objects;

public class Member {

	private String password;
	private String name;
	
	public Member() {}
	public Member(String password, String name) {
		this.password = password;
		this.name = name;
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
	
	
	@Override
	public int hashCode() {
		return Objects.hash(name, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}
	
	@Override
	public String toString() {
		return "Member [password=" + password + ", name=" + name + "]";
	}
	
}
