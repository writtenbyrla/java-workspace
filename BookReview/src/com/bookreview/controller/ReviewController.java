package com.bookreview.controller;

import java.util.ArrayList;

import com.bookreview.model.Review;

public class ReviewController {

	ArrayList<Review> reviewList = new ArrayList<>();
	UserController uc = new UserController();
	Review review = new Review();
	
	// C : 리뷰 업로드
	public void upload(Review review) {
		reviewList.add(review);
		System.out.println("리뷰가 등록되었습니다.");
	}
	
	// R : 리뷰 목록 보기
	public ArrayList<Review> reviewList() { 
		return reviewList;
	}
	
	
	// U : 리뷰 수정
	public boolean updateReview(String title) { // 책 수정
		if(review.getTitle().equals(title)) {
			reviewList.set(reviewList.indexOf(title), review);
			System.out.println("리뷰가 수정되었습니다.");
			return true;
		}
		return false;
	}
	
	// D : 리뷰 삭제
	public void deleteReview(String title) { // 책 지우기
		if(review.getTitle().equals(title)) {
			reviewList.remove(review);
		}
	}
}
