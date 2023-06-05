package com.booklibrary.model;

public class Book {

	private String title;
	private String writer;
	private String imgUrl;
	
	public Book() {
	}

	public Book(String title, String writer, String imgUrl) {
		this.title = title;
		this.writer = writer;
		this.imgUrl = imgUrl;
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

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", imgUrl=" + imgUrl + "]";
	}
	
	
	
	
}
