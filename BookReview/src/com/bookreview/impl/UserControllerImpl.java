package com.bookreview.impl;

import com.bookreview.model.User;

public interface UserControllerImpl {
	
	public boolean login();

	public boolean signUp(); // 회원가입

	public User viewProfile(); // 프로필 보기

	public User updateProfile(); // 프로필 수정

	public boolean deleteProfile(); // 계정 삭제
	
	
	
}
