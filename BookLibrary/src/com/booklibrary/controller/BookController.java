package com.booklibrary.controller;

import com.booklibrary.model.Book;

public class BookController {

	Book[] bookList = new Book[5];
	int index = 0;
	
	public void upload(Book book) { // 책 업로드
		bookList[index++] = book;
	}
	
	public Book[] bookList() { // 책 목록
		return bookList;
	}
	
	public Book viewBook(int index) { // 책 1권 보기
		return bookList[index];
	}
	
	public void updateBook(int index, Book book) { // 책 수정
		bookList[index] = book;
	}
	
	public boolean deletebook() { // 책 지우기
		return false;
	}
}
