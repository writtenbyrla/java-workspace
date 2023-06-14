package com.bookreview.controller;

import java.util.HashMap;
import java.util.Set;

import com.bookreview.model.User;

public class UserController {

	private HashMap<String, User> map = new HashMap<>();
//	User user = null;

	// 회원가입
	// id 중복되는지 확인 후 기존에 가입된 id 없으면 입력받은 user 정보 저장후 true값 반환 
//	public boolean signUp(String id, String password) { 
//		if(!map.containsKey(id)) {
//			map.put(id, password);
//			return true;
//		}
//		return false;
//	}
	
	public boolean signUp(String id, User user) {
		if(!map.containsKey(id)) {
			map.put(id, user);
			return true;
		}
		return false;
	}
	
	// 로그인
	// id, password 입력받아 일치할 시에 회원의 닉네임 반환
	public String login(String id, String password) { // 로그인
		if(map.containsKey(id) && map.get(id).getPassword().equals(password)) {
			return map.get(id).getNickName();
		}
		return null;
	}

	// 비밀번호 수정
	// id, password 일치하면 새로운 비밀번호로 저장하고 true 반환
	public boolean updatePassword(String id, String oldPw, String newPw) {
		if(map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.put(id, new User(newPw, map.get(id).getName(), map.get(id).getPhone(), map.get(id).getNickName(), map.get(id).getEmail()));
			return true;
		} return false;
	}
	
	public void updatePhone(String id, String phone) {
		map.put(id, new User(map.get(id).getPassword(), map.get(id).getName(), phone, map.get(id).getNickName(), map.get(id).getEmail()));
	}
	
	public void updateNickName(String id, String nickName) {
		map.put(id, new User(map.get(id).getPassword(), map.get(id).getName(), map.get(id).getPhone(), nickName, map.get(id).getEmail()));
	}

}

