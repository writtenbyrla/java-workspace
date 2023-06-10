package com.bookreview.model;

import java.sql.Date;

public class Book {

	private String title; // 책 제목
	private String writer; // 작가
	private Date uploadAt;
	private String desc; // 책 설명
	private String comment; // 책에 대한 리뷰
	
	public Book() {}
	
	public Book(String title, String writer, Date uploadAt, String desc, String comment) {
		this.title = title;
		this.writer = writer;
		this.uploadAt = uploadAt;
		this.desc = desc;
		this.comment = comment;
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

	public Date getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", uploadAt=" + uploadAt + ", desc=" + desc
				+ ", comment=" + comment + "]";
	}
	
	
	
	
}
