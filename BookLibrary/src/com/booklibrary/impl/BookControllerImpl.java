package com.booklibrary.impl;

import java.util.ArrayList;

import com.booklibrary.model.Book;

public interface BookControllerImpl {

	public void upload(Book book); // 책 업로드

	
	public ArrayList<Book> bookList(); // 책 목록

	
	public Book viewBook(int index); // 책 1권 보기
	
	
	public void updateBook(int index, Book book); // 책 수정

	
	public boolean deletebook(Book book); // 책 지우기
	
	
	
}
