package com.bookreview.model;

import java.sql.Date;
import java.util.Objects;

public class Review {

	private String title; // 책 제목
	private String writer; // 작가
	private String comment; // 책에 대한 리뷰
	private String uploadAt; // 리뷰 업로드 날짜
	
	public Review() {}

	public Review(String title, String writer, String comment, String uploadAt) {
		this.title = title;
		this.writer = writer;
		this.comment = comment;
		this.uploadAt = uploadAt;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(String uploadAt) {
		this.uploadAt = uploadAt;
	}



	@Override
	public String toString() {
		return "Review [title=" + title + ", writer=" + writer + ", comment=" + comment + ", uploadAt=" + uploadAt
				+ "]";
	}

	

	
	
	
	
}
