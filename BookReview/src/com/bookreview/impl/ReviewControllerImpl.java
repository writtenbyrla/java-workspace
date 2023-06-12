package com.bookreview.impl;

import java.util.ArrayList;

import com.bookreview.model.Review;

public interface ReviewControllerImpl {

	public void upload(Review book); // 책 업로드

	
	public ArrayList<Review> bookList(); // 책 목록

	
	public Review viewBook(int index); // 책 1권 보기
	
	
	public void updateBook(int index, Review book); // 책 수정

	
	public boolean deletebook(Review book); // 책 지우기
	
	
	
}
