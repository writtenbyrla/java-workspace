package com.bookreview.controller;

import java.util.ArrayList;

import com.bookreview.model.Review;

public class ReviewController {

	private ArrayList<Review> reviewList = new ArrayList();
	UserController uc = new UserController();
	
	// C : 리뷰 업로드
	public boolean upload(Review review) {
		return reviewList.add(review);
	}
	
	// R : 리뷰 목록 보기
	public ArrayList<Review> reviewList() { 
		return reviewList;
	}
	
	
	// U : 리뷰 수정
	public Review updateReview(String title, Review review) { // 책 수정
		for(Review r : reviewList) {
			if(r.getTitle().equals(title)) {
				return reviewList.set(reviewList.indexOf(r), review);
			}
		} return null;

	}
	
	// D : 리뷰 삭제
	public Review deleteReview(String title) { // 책 지우기
		for(int i=0; i<reviewList.size(); i++) {
			if(reviewList.get(i).getTitle().equals(title)) {
				return reviewList.remove(i);
			}
		}
		return null;
	}
}
