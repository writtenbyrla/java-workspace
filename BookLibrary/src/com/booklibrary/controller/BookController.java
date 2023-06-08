package com.booklibrary.controller;

import java.util.ArrayList;

import com.booklibrary.model.Book;

public class BookController {

	ArrayList<Book> bookList = new ArrayList<>();
	
	// C : 책 업로드 
	public void upload(Book book) {
		bookList.add(book);
	}
	
	// R : 책 목록 보기
	public ArrayList<Book> bookList() { 
		return bookList;
	}
	
	// R : 책 1권 보기
	public Book viewBook(int index) {
		return bookList.get(index);
	}
	
	// U : 책 수정
	public void updateBook(int index, Book book) { // 책 수정
		bookList.set(index, book);
	}
	
	// D : 책 삭제
	public boolean deletebook(Book book) { // 책 지우기
		return bookList.remove(book);
	}
}
