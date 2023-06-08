package com.youtube.model;

import java.util.Date;
import java.util.List;

// CRUD - Create(추가) / Read(읽기) / Update(수정) / Delete(삭제) 
public class Video {

	private String title;
	private Date uploadAt;
	private int views;
	private String imgUrl;
	private String fileUrl;
	private String desc; // 설명
	private char kind; // shorts & video 둘 중 하나

	private List<Comment> comments;
	private Category category;
	
}
