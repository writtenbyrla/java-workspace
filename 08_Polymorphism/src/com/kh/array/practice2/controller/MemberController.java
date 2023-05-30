package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	Member[] mArr = new Member[3];
	public int count = 0;
	
	public void insertMember(Member m) {
		mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());	
//		mArr[count++] = m;
	}
	
	public boolean updateMember(String id, String name, String password, String email) {
		// checkId 활용! - index
		// 추가처럼 수정도 같은 방식, 해당 인덱스 값에 넣는 방식
		// setter 이용
		
		int index = this.checkId(id);
		if(index!=-1) {
			mArr[index].setId(id);
			mArr[index].setName(name);
			mArr[index].setPassword(password);
			mArr[index].setEmail(email);
			return true;
		}
		return false;
	}
	
	public int checkId(String id) {
		//객체 배열 값 for문으로 일치한지 확인해서 return값

		for(int i=0; i<mArr.length; i++) {	
			if(mArr[i]!=null && mArr[i].getId().equals(id)) {
				return i; // return 이후 빠져나감
			} 
		}
		return -1; // 일치하지 않으면 -1로 넘김
	}
	
	public Member[] printAll() {
		return mArr;
	}

}
